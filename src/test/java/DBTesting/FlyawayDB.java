package DBTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class FlyawayDB {
	
	@Test
	public void DBTest() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flyaway","root","Cool@2197");
		System.out.println("Connected to MySql Db");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select* from f_user");
		
		while(rs.next()) {
			String names=rs.getString("name");
			System.out.println(names);
		}
	}

}
 