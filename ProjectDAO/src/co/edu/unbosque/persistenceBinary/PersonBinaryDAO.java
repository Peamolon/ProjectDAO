package co.edu.unbosque.persistenceBinary;

import java.util.ArrayList;

import co.edu.unbosque.model.Person;

public class PersonBinaryDAO {
	private Operation operation;
	private ArrayList<Person> people;
	
	public PersonBinaryDAO() {
		operation = new Operation();
		people = new ArrayList<Person>();
	}
	
	public void addPerson(Person p) throws ClassNotFoundException{
		if(operation.getPeople()!=null) {
			people = operation.getPeople();
		}
		people.add(p);
		operation.addPeople(people);
	}
	
	public void getPeople() throws ClassNotFoundException {
		if(operation.getPeople()!=null) {
			people = operation.getPeople();
		}
		for(Person p: people) {
			System.out.println(p.toString());
		}
		
	}	

}
