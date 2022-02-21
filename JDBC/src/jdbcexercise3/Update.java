/* Exercise 3 : Write a JAVA program to update the records in BANK table using Statement.executeUpdate().*/
package jdbcexercise3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		 String dbURL = "jdbc:mysql://localhost/bankdetails";
		   String username = "root";
		   String password = "shivam@123";
		   Connection conn = DriverManager.getConnection(dbURL, username, password);
		   Statement statement=conn.createStatement();
		   String sql = "update  bank set emailID='atharv@gmail.com' where id=201";
		   String sql1 = "update  bank set emailID='nikhil@gmail.com' where id=202";
		   String sql2 = "update  bank set emailID='harry@gmail.com' where id=203";
		   String sql3 = "update  bank set emailID='luna@gmail.com' where id=204";
		         statement.executeUpdate(sql);
		         statement.executeUpdate(sql1);
		         statement.executeUpdate(sql2);
		         statement.executeUpdate(sql3);
		         
		         
		     System.out.println("Updated Successfully");
	}

}
