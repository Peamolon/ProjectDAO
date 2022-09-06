package co.edu.unbosque.persistenceCassandra;
import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;

public class OperationCassandra {
	
	public OperationCassandra() {
		// TODO Auto-generated constructor stub
		
		//cluster connects to the address of the node provided.One contact point is required.Good to have multiple
		Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
		Session session = cluster.connect("person");
		session.execute("INSERT INTO users (idnumber, age, name ,sex) VALUES ('12321312', '14', 'Marta', 'F')");
		System.out.println("melo");
	}

}
