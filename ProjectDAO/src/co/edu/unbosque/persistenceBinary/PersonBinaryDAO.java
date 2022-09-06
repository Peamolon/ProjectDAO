package co.edu.unbosque.persistenceBinary;

import java.io.Serializable;
import java.util.ArrayList;

import co.edu.unbosque.model.Person;

public class PersonBinaryDAO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Operation operation;
	private ArrayList<Person> people;
	
	public PersonBinaryDAO() {
		operation = new Operation();
		people = new ArrayList<Person>();
	}
	
	public boolean addPerson(Person p) throws ClassNotFoundException{
		if(operation.getPeople()!=null) {
			people = operation.getPeople();
		}
		people.add(p);
		operation.addPeople(people);
		return true;
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
