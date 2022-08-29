package co.edu.unbosque.controller;

import co.edu.unbosque.model.Person;
import co.edu.unbosque.persistence.PersonDAO;

public class Controller {
	private PersonDAO person;
	public Controller() {
		person = new PersonDAO();
		Person aux = new Person("David", 26, 4353453);
		try {
			person.addPerson(aux);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			person.getPeople();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
