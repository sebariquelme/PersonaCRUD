package com.example.models;

//Repository in https://github.com/sebariquelme/PersonaCRUD
public class Persona {

	private int id;
	private String name;
	private String lastname;
	private String address;
	private int phoneNumber;
	private String hairColour;

	public Persona() {
	}

	public Persona(int id, String name, String lastname, String address, int phoneNumber, String hairColour) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.hairColour = hairColour;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getHairColour() {
		return hairColour;
	}

	public void setHairColour(String hairColour) {
		this.hairColour = hairColour;
	}

}
