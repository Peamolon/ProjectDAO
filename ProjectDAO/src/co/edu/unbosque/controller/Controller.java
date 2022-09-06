package co.edu.unbosque.controller;

import java.sql.SQLException;
import java.util.List;

import co.edu.unbosque.model.Person;
import co.edu.unbosque.persistenceBinary.PersonBinaryDAO;
import co.edu.unbosque.persistenceCassandra.PersonCassandraDAO;
import co.edu.unbosque.persistenceSqlite.OperationSQlite;

public class Controller {
	private PersonBinaryDAO person;
	private OperationSQlite operation;
	public Controller() throws SQLException {

	}


}
