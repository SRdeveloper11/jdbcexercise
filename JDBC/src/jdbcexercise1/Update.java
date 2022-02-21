//Exercise 1 : Write a JAVA program to update the Bank table with column ("AccountNo","AccountBal") using resultset object.
package jdbcexercise1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Update {
	public static void main(String[] args) throws SQLException {

			// TODO Auto-generated method stub
			//getConnection();
			 String dbURL = "jdbc:mysql://localhost/bankdetails";
			 String username = "root";
			 String password = "shivam@123";
			  
			  Connection conn = DriverManager.getConnection(dbURL, username, password);
			         Statement stmt = conn.createStatement();
			     
			{
			         Scanner sc =new Scanner(System.in);
			         System.out.println("Enter the records you want to insert");
			         int k=sc.nextInt();
					 for(int i=0;i<k;i++ )
					 {
					 	System.out.println("Enter bankid");
					     int	id=sc.nextInt();
					 	System.out.println("Enter Name");
				         String Name=sc.next();
				         System.out.println("Enter emailID");
					 	String emailID=sc.next();
					 	System.out.println("Enter accountno");
					 	int accountno=sc.nextInt();
					 	System.out.println("Enter accountbal");
					 	int accountbal=sc.nextInt();
					 	stmt.executeUpdate("insert into bank values('"+id+"','"+Name+"','"+emailID+"','"+accountno+"',"+accountbal+")");
					 }
					 System.out.println("Record Get Inserted");
					 String selectSql = "SELECT * FROM bank";
					   stmt=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
					    ResultSet rs=stmt.executeQuery(selectSql);
					    rs.absolute(2);
					    rs.updateInt(4, 1005);
					    rs.updateInt(5,30000);
					    rs.updateRow();
					    System.out.println("RowUpdated");
			} 
			      } 
			
	}
		

		   
	

				
	

