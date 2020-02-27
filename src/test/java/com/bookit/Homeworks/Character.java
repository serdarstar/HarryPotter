package com.bookit.Homeworks;


import com.google.gson.annotations.SerializedName;


public class Character {

	@SerializedName("role")
	private String role;

	@SerializedName("bloodStatus")
	private String bloodStatus;

	@SerializedName("school")
	private String school;

	@SerializedName("species")
	private String species;

	@SerializedName("deathEater")
	private boolean deathEater;

	@SerializedName("__v")
	private int V;

	@SerializedName("dumbledoresArmy")
	private boolean dumbledoresArmy;

	@SerializedName("name")
	private String name;

	@SerializedName("ministryOfMagic")
	private boolean ministryOfMagic;

	@SerializedName("_id")
	private String id;

	@SerializedName("orderOfThePhoenix")
	private boolean orderOfThePhoenix;

	@SerializedName("house")
	private String house;

	public void setRole(String role){
		this.role = role;
	}

	public String getRole(){
		return role;
	}

	public void setBloodStatus(String bloodStatus){
		this.bloodStatus = bloodStatus;
	}

	public String getBloodStatus(){
		return bloodStatus;
	}

	public void setSchool(String school){
		this.school = school;
	}

	public String getSchool(){
		return school;
	}

	public void setSpecies(String species){
		this.species = species;
	}

	public String getSpecies(){
		return species;
	}

	public void setDeathEater(boolean deathEater){
		this.deathEater = deathEater;
	}

	public boolean isDeathEater(){
		return deathEater;
	}

	public void setV(int V){
		this.V = V;
	}

	public int getV(){
		return V;
	}

	public void setDumbledoresArmy(boolean dumbledoresArmy){
		this.dumbledoresArmy = dumbledoresArmy;
	}

	public boolean isDumbledoresArmy(){
		return dumbledoresArmy;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setMinistryOfMagic(boolean ministryOfMagic){
		this.ministryOfMagic = ministryOfMagic;
	}

	public boolean isMinistryOfMagic(){
		return ministryOfMagic;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setOrderOfThePhoenix(boolean orderOfThePhoenix){
		this.orderOfThePhoenix = orderOfThePhoenix;
	}

	public boolean isOrderOfThePhoenix(){
		return orderOfThePhoenix;
	}

	public void setHouse(String house){
		this.house = house;
	}

	public String getHouse(){
		return house;
	}
}