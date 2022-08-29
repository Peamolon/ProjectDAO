package co.edu.unbosque.model;

import java.io.Serializable;

public class Person implements Serializable{
	private String name;
	private int age;
	private int idNumber;
	private char sex;
	
	public Person() {
		name = "";
		age = 0;
		idNumber = 0;
		sex = ' ';
	}
	
	public Person(String name, int age, int idNumber, char sex) {
		this.name = name;
		this.age = age;
		this.idNumber = idNumber;
		this.sex = sex;
	}
	
	@Override
	public String toString() {
		return "Name: "+name+ " Age: "+age+" idNumber: "+idNumber +" Sex: "+sex;
	}
	
	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
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
