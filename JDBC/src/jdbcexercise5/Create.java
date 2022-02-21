/* Write a Java program to create  a table  countries including columns country_id,country_name and region_id .*/
package jdbcexercise5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		 String dbURL = "jdbc:mysql://localhost/country";
		 String username = "root";
		 String password = "shivam@123";
		  
		  Connection conn = DriverManager.getConnection(dbURL, username, password);
	         Statement stmt = conn.createStatement();
	      
	         String sql = "CREATE TABLE countries " +
	                   "(country_id INTEGER not NULL, " +
	                   " country_name VARCHAR(255), " + 
	                   "region_ID VARCHAR(255), " +  
	                   " PRIMARY KEY ( country_id ))";
	         stmt.executeUpdate(sql);
	        		 System.out.println("table created");   		
	}

}
