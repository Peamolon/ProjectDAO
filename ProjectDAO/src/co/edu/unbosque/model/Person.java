package co.edu.unbosque.model;

import java.io.Serializable;

public class Person implements Serializable{
	private String name;
	private int age;
	private int idNumber;
	
	public Person() {
		name = "";
		age = 0;
		idNumber = 0;
	}
	
	public Person(String name, int age, int idNumber) {
		this.name = name;
		this.age = age;
		this.idNumber = idNumber;
	}
	
	@Override
	public String toString() {
		return "Name: "+name+ " Age: "+age+" idNumber: "+idNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

}
