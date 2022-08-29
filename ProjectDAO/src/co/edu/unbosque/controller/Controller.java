package co.edu.unbosque.controller;

import java.sql.SQLException;
import java.util.List;

import co.edu.unbosque.model.Person;
import co.edu.unbosque.persistenceBinary.PersonBinaryDAO;
import co.edu.unbosque.persistenceSqlite.OperationSQlite;

public class Controller {
	private PersonBinaryDAO person;
	private OperationSQlite operation;
	public Controller() throws SQLException {
		operation = new OperationSQlite();
		
		Person aux = new Person("Juancho", 53, 1233411, 'M');
		operation.addPerson(aux);
		List<Person>people = operation.getAll();
		for(Person p : people) {
			System.out.println(p);
		}
	}


}
