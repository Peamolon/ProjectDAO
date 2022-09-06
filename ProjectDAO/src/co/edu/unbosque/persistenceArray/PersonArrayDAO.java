package co.edu.unbosque.persistenceArray;

import java.util.ArrayList;

import co.edu.unbosque.model.Person;

public class PersonArrayDAO {

	private ArrayList<Person> people;

	public PersonArrayDAO() {
		people = new ArrayList<Person>();
	}

	public void addPerson(Person a) {
		people.add(a);
	}

	public ArrayList<Person> getPeaople() {
		return people;
	}

}
