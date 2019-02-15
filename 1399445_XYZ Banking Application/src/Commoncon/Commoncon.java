package Commoncon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Commoncon {
	 public static Connection getCon() throws Exception 
		{
			Connection c=null;
			try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
	        c= DriverManager.getConnection("jdbc:oracle:thin:@10.219.34.3:1521:orcl","trg609","training609");
	       System.out.println("Connected");
			
		}
			catch(SQLException se)
			{
				System.out.println(se);
			}
			return c;

}
}
