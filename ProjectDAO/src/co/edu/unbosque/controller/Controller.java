package co.edu.unbosque.controller;

import java.awt.event.*;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.*;

import co.edu.unbosque.model.Person;
import co.edu.unbosque.persistenceArray.PersonArrayDAO;
import co.edu.unbosque.view.*;
import co.edu.unbosque.persistenceBinary.PersonBinaryDAO;
import co.edu.unbosque.persistenceSqlite.OperationSQlite;

public class Controller implements ActionListener {
	private PersonBinaryDAO personBin;
	private PersonArrayDAO personArray;
	private OperationSQlite operation;
	private Principal principal;
	private Registrar register;
	private Edit edit;
	private View view;
	private Delete delete;
	public Controller() throws SQLException {
		operation = new OperationSQlite();
		personBin = new PersonBinaryDAO();
		personArray = new PersonArrayDAO();
		principal = new Principal();
		register = new Registrar();
		edit = new Edit();
		view = new View();
		delete = new Delete();
//		Person aux = new Person("Juancho", 53, 1233411, 'M');
//		operation.addPerson(aux);
//		List<Person>people = operation.getAll();
//		for(Person p : people) {
//			System.out.println(p);
//		}
		
		
		
		asignListeners();
	}
	
	public void asignListeners() {
		//----------------Botones de la pagina principal-------------
		principal.setVisible(true);
		principal.getBtnRegistro().addActionListener(this);
		principal.getBtnEditar().addActionListener(this);
		principal.getBtnVer().addActionListener(this);
		principal.getBtnEliminar().addActionListener(this);
		
		register.getBtnRArray().addActionListener(this);
		register.getBtnRBinario().addActionListener(this);
		register.getBtnRSql().addActionListener(this);
		register.getBtnRCassandra().addActionListener(this);
		register.getBtnBack().addActionListener(this);
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		
		if(command.equals("BRegister")) {
			principal.setVisible(false);
			register.getFrame().setVisible(true);
		} if(command.equals("RArray")) {
			
			String name = register.getTextName().getText();
			String ageTxt = register.getTxtEdad().getText();
			String idTxt = register.getTextId().getText();
			String sexTxt = register.getTextSex().getText();
			
			int age = Integer.parseInt(ageTxt);
			int id = Integer.parseInt(idTxt);
			char sex = sexTxt.charAt(0);
			
			Person p = new Person(name, age, id, sex);
			
			personArray.addPerson(p);
			
			
			
			
		} if(command.equals("RBinario")) {
			
			String name = register.getTextName().getText();
			String ageTxt = register.getTxtEdad().getText();
			String idTxt = register.getTextId().getText();
			String sexTxt = register.getTextSex().getText();
			
			int age = Integer.parseInt(ageTxt);
			int id = Integer.parseInt(idTxt);
			char sex = sexTxt.charAt(0);
			
			Person p = new Person(name, age, id, sex);
			
			try {
				if(personBin.addPerson(p)) {
					
				}
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		} if(command.equals("RBack")) {
			register.getFrame().setVisible(false);
			principal.setVisible(true);
			
		} 
		
		
		
		
		
	}


}
