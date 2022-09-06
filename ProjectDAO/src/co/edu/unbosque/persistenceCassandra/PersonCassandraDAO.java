package co.edu.unbosque.persistenceCassandra;
import java.util.ArrayList;
import java.util.List;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

import co.edu.unbosque.model.Person;

import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;

public class PersonCassandraDAO {
	
	public PersonCassandraDAO() {
	
	}
	
	private Session getSession() {
		Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
		Session session = cluster.connect("person");
		return session;
	}
	
	
	
	public void addPerson(Person p) {
		Session session = getSession();
		String query = "INSERT INTO users (idnumber, age, name ,sex) VALUES "
						+ "('"+p.getIdNumber()+"', '"+ p.getAge()+"', '"+p.getName()+"', '"+p.getSex()+"')";
		session.execute(query);
		
	}
	
	public List<Person> getAll(){
		Session session = getSession();
		ResultSet resultSet=session.execute("select * from users");
		List <Person> people = new ArrayList<>();
		for(Row row:resultSet)
		{
			int idnumber = Integer.parseInt(row.getString("idnumber"));
			String name = row.getString("name");
			int age = Integer.parseInt(row.getString("age"));
			char sex = row.getString("sex").charAt(0);
			
			Person p = new Person(name, age, idnumber, sex);
			people.add(p);
			
		}
		return people;
		
	}

}
