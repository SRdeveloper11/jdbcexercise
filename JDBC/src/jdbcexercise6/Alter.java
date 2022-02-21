//Write a Java program to  alter table countries including columns country_id,country_name and region_id  to add a column region_id .
package jdbcexercise6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Alter {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		 String dbURL = "jdbc:mysql://localhost/country";
		 String username = "root";
		 String password = "shivam@123";
		  
		  Connection conn = DriverManager.getConnection(dbURL, username, password);
		  Statement stmt = conn.createStatement();
		  String query1 = "ALTER TABLE countries DROP COLUMN region_ID ";
	      String query2 = "ALTER TABLE countries ADD COLUMN region_ID varchar(250)";
	      stmt.executeUpdate(query1);
	      System.out.println("Cloumn Drop");
	      stmt.executeUpdate(query2);
	      System.out.println("Colomn Added");
	      
	}

}
