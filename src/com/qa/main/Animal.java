package com.qa.main;

//Entity
public class Animal {

	// Fields
	private int eyes = 16;
	private String name;
	private int legs = 15;
	private String hello = "Yes";
	
	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

	public int getEyes() {
		return eyes;
	}

	public String getName() {
		return name;
	}

	public void setEyes(int eyes) {
		this.eyes = eyes;
	}

	public void setName(String name) {
		this.name = name;
	}

}
