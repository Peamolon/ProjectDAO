package co.edu.unbosque.persistence;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.model.Person;

public class Operation {	
	public Operation() {
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<Person> getPeople() throws ClassNotFoundException{
		try {
			ObjectInputStream getData = new ObjectInputStream(new FileInputStream("Data/people.dat"));
			ArrayList<Person> aux =  (ArrayList<Person>) getData.readObject();
			getData.close();
			return aux;
			//System.out.println(a);
		} catch (EOFException e) {
			return null;
		}catch(IOException e) {
			return null;
		}
	}
	
	public boolean addPeople(ArrayList<Person> people) {
		try {
			ObjectOutputStream setData = new ObjectOutputStream(new FileOutputStream("Data/people.dat"));
			setData.writeObject(people);
			setData.close();
			return true;
		} catch (Exception e) {
			return false;
			
		}
	}

}
