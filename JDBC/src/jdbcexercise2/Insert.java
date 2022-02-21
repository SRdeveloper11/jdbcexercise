//Write a JAVA program to insert 5 records in BANK table with column ("AccountNo","AccountBal")  using prepared statement.
package jdbcexercise2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

	public static void main(String[] args) throws SQLException, NumberFormatException, IOException {
		// TODO Auto-generated method stub
		 String dbURL = "jdbc:mysql://localhost/bankdetails";
		 String username = "root";
		 String password = "shivam@123";
		  
		  Connection conn = DriverManager.getConnection(dbURL, username, password);
		  PreparedStatement ps=conn.prepareStatement("insert into bank values(?,?,?,?,?)"); 
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		    for(int k=0;k<5;k++)
		    {
		    System.out.println("enter Bankid:"); 
		    int id=Integer.parseInt(br.readLine()); 
		    System.out.println("enter Name:"); 
		    String name=br.readLine(); 
		    System.out.println("enter Emailid:"); 
		    String emailID=br.readLine(); 
		    System.out.println("enter Accountno:"); 
		    int accountno=Integer.parseInt(br.readLine()); 
		    System.out.println("enter Accountbal:"); 
		    int accountbal=Integer.parseInt(br.readLine()); 
		    
		    ps.setInt(1,id); 
		    ps.setString(2,name); 
		    ps.setString(3,emailID); 
		    ps.setInt(4,accountno); 
		    ps.setInt(5,accountbal);  
		    System.out.println("5 Record Inserted");  
		    }
		    conn.close(); 
	}

}
