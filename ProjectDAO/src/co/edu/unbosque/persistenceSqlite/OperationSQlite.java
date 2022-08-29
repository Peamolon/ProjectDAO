package co.edu.unbosque.persistenceSqlite;
import java.sql.*;
import java.util.*;

import co.edu.unbosque.model.Person;
public class OperationSQlite {
	
	public OperationSQlite() {
		
	}
	
	private Connection connect() {
		Connection conn = null;
		
		//Please put your own path 
		String dataBaseURL = "jdbc:sqlite:/Users/sergiopena/Documents/software2/ProjectDAO/ProjectDAO/Data/people.db";
		
		try {
			conn = DriverManager.getConnection(dataBaseURL);
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return null;
	}
	
	public boolean addPerson(Person p) {
		String sql = "INSERT INTO Person (name,age,id_number,sex) VALUES "
				+ "('"+p.getName()+"', "+p.getAge()+", "+p.getIdNumber()+", '"+p.getSex()+"');";
		int numRowsInserted = 0;
		System.out.println(sql);
		
		PreparedStatement ps = null;
		
		try {
			ps = connect().prepareStatement(sql);
			numRowsInserted = ps.executeUpdate();
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}finally {
			close(ps);
		}
	}
	
	public void close(Statement statement) {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
	
	public List<Person> getAll(){
		List<Person> people = new ArrayList<Person>();
		String sql = "SELECT * FROM Person";
		try (Connection conn = connect();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql)){
			
			while(rs.next()) {
				Person aux = new Person(rs.getString("name"),
						Integer.parseInt(rs.getString("age")),
						Integer.parseInt(rs.getString("id_number")),
						rs.getString("sex").charAt(0));
				people.add(aux);
			}
			return people;
		}catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		 
	}
	
}
