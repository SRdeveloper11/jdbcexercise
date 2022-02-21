package jdbcexercise4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Test {

	public void check() throws IOException {
		// TODO Auto-generated method stub
		Properties p=new Properties();
		InputStream is=new FileInputStream("dataConfig.properties");
		p.load(is);
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("url"));
		p.list(System.out);
	}
 
}
