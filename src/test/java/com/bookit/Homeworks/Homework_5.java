package com.bookit.Homeworks;

import com.bookit.utilities.ConfigurationReader;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework_5 {

    @BeforeClass
    public static void setup(){
        baseURI = ConfigurationReader.get("harryPotterAPI.uri");
    }

    @Test
    public void Verify_sorting_hat(){
        Response response = given().accept(ContentType.JSON).when().get("sortingHat");
        assertEquals(response.statusCode(),200);
        List<String> hats=new ArrayList<>(Arrays.asList("Gryffindor","Ravenclaw","Slytherin","Hufflepuff"));
        System.out.println("hats = " + hats);
        String result=response.body().prettyPrint().substring(1,response.body().prettyPrint().length()-1);
        System.out.println("result = " + result);
        assertTrue(hats.contains(result));

//      Diger yolu
//        boolean flag=false;
//
//        for (int i = 0; i < hats.size(); i++) {
//            System.out.println(hats.get(i));
//            if(hats.get(i).equals(result)){
//                System.out.println(hats.get(i));
//                flag=true;
//            }
//        }
//
//        assertEquals(flag,true);
    }

    @Test
    public void Verify_bad_key(){
        String key="invalid";
        Response response = given().accept(ContentType.JSON).queryParam("key", key).get("characters");
        assertEquals(response.statusCode(),401);
        assertEquals(response.contentType(),"application/json; charset=utf-8");
        assertTrue(response.statusLine().contains("Unauthorized"));
        assertEquals(response.body().path("error").toString(),"API Key Not Found");
    }

    @Test
    public void Verify_no_key(){
        String key="invalid";
        Response response = given().accept(ContentType.JSON).get("characters");
        assertEquals(response.statusCode(),409);
        assertEquals(response.contentType(),"application/json; charset=utf-8");
        assertTrue(response.statusLine().contains("Conflict"));
        assertEquals(response.body().path("error").toString(),"Must pass API key for request");

    }
    @Test
    public void Verify_number_of_characters(){
        String key="$2a$10$Jyx8ZN7Xf0kmzjWs7mRVh.ugmEbhBwjGgcLoMO81NhFWlWveSHGp.";

        Response response = given().accept(ContentType.JSON).queryParam("key",key).get("characters");

        assertEquals(response.statusCode(),200);
        assertEquals(response.contentType(),"application/json; charset=utf-8");

        Character character=response.body().as((Type) Character[].class);
        System.out.println(character.getName().toString());
        System.out.println("character.getId().toString() = " + character.getId().toString());
        System.out.println("character.getName().toString() = " + character.getName().toString());
//        System.out.println(response.body().path("_id[10]").toString());



    }

    @Test
    public void houses() {
        String key = "$2a$10$Jyx8ZN7Xf0kmzjWs7mRVh.ugmEbhBwjGgcLoMO81NhFWlWveSHGp.";

        Response response = given().accept(ContentType.JSON).queryParam("key", key)
                .queryParam("_id"," 5a05e2b252f721a3cf2ea33f")
                .get("houses");

        assertEquals(response.statusCode(), 200);
        assertEquals(response.contentType(), "application/json; charset=utf-8");

        Character character=response.body().as(Character.class);
        System.out.println("character.getId().toString() = " + character.getId().toString());
        System.out.println("character.getName().toString() = " + character.getName().toString());
        System.out.println(response.body().path("_id[10]").toString());

        Houses houses=response.body().as(Houses.class);
        System.out.println(houses.getColors().get(1).toString().toString());
        System.out.println("houses.getColors().toString() = " + houses.getColors().toString());




    }

}
