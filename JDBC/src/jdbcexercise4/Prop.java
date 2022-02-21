//Exercise 4 : Write a JAVA program to get  connection object using hostname , user,password stored in external properties file. 
package jdbcexercise4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class Prop {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Properties p=new Properties();
OutputStream os=new FileOutputStream("dataConfig.properties");
p.setProperty("url", "localhost:3306/myDb");
p.setProperty("username", "root");
p.setProperty("password", "shivam@123");
p.store(os, null);
Test t=new Test();
t.check();
}
}
