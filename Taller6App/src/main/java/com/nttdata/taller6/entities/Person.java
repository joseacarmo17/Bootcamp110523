package com.nttdata.taller6.entities;

public class Person {
	private String firstname;
	private String lastname;
	private String age;
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}
	/**
	 * @param firstname
	 * @param lastname
	 * @param age
	 */
	public Person(String firstname, String lastname, String age) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}
	/**
	 * 
	 */
	public Person() {
		super();
	}
	
	
}
