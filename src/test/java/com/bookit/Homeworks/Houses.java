package com.bookit.Homeworks;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Houses {

	@SerializedName("headOfHouse")
	private String headOfHouse;

	@SerializedName("houseGhost")
	private String houseGhost;

	@SerializedName("mascot")
	private String mascot;

	@SerializedName("school")
	private String school;

	@SerializedName("founder")
	private String founder;

	@SerializedName("__v")
	private int V;

	@SerializedName("members")
	private List<String> members;

	@SerializedName("values")
	private List<String> values;

	@SerializedName("name")
	private String name;

	@SerializedName("_id")
	private String id;

	@SerializedName("colors")
	private List<String> colors;

	public void setHeadOfHouse(String headOfHouse){
		this.headOfHouse = headOfHouse;
	}

	public String getHeadOfHouse(){
		return headOfHouse;
	}

	public void setHouseGhost(String houseGhost){
		this.houseGhost = houseGhost;
	}

	public String getHouseGhost(){
		return houseGhost;
	}

	public void setMascot(String mascot){
		this.mascot = mascot;
	}

	public String getMascot(){
		return mascot;
	}

	public void setSchool(String school){
		this.school = school;
	}

	public String getSchool(){
		return school;
	}

	public void setFounder(String founder){
		this.founder = founder;
	}

	public String getFounder(){
		return founder;
	}

	public void setV(int V){
		this.V = V;
	}

	public int getV(){
		return V;
	}

	public void setMembers(List<String> members){
		this.members = members;
	}

	public List<String> getMembers(){
		return members;
	}

	public void setValues(List<String> values){
		this.values = values;
	}

	public List<String> getValues(){
		return values;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setColors(List<String> colors){
		this.colors = colors;
	}

	public List<String> getColors(){
		return colors;
	}
}