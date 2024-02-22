package test;

import java.sql.Connection;
import java.sql.DriverManager;
import static test.DBInfo.*;

public class DBConnection 
{
	public static Connection con;
	
	private DBConnection()
	{
		super();
	}
	
	static
	{
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url,user,password);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static Connection getCon()
	{
		return con;
	}
}
