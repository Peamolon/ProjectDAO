package co.edu.unbosque.persistenceBinary;

import java.io.*;
import java.util.*;

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
			File file = new File("Data\\people.dat");
			ObjectOutputStream setData = new ObjectOutputStream(new FileOutputStream(file));
			if(people != null) {
			setData.writeObject(people);
			setData.close();
			}
			return true;
		} catch (Exception e) {
			return false;
			
		}
	}

}
