//Write a Java program  to insert a record with values taken from user into the table countries against each columns using prepared statement. We can use a string array to store our own values.


package jdbcexercise7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Input {

	public static void main(String[] args) throws SQLException, NumberFormatException, IOException {
		// TODO Auto-generated method stub
		 String dbURL = "jdbc:mysql://localhost/country";
		 String username = "root";
		 String password = "shivam@123";
		  
		  Connection conn = DriverManager.getConnection(dbURL, username, password);
		  PreparedStatement ps=conn.prepareStatement("insert into countries values(?,?,?)"); 
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
			    do{ 
		    System.out.println("enter country_id:"); 
		    int country_id=Integer.parseInt(br.readLine()); 
		    System.out.println("enter country_name:"); 
		    String name=br.readLine(); 
		    System.out.println("region_id:"); 
		    String region_id=br.readLine();  
		    ps.setInt(1,country_id); 
		    ps.setString(2,name); 
		    ps.setString(3,region_id); 
		    int i=ps.executeUpdate(); 
		    System.out.println("Do you want to continue: y/n"); 
		    String s=br.readLine(); 
		    if(s.startsWith("n")){ 
		    break; 
		    } 
		    }while(true); 
	}
}
