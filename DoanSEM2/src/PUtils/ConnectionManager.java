package PUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static String url = "jdbc:sqlserver://LAPTOP-GLLMI5B7:1433;;databaseName=QLNHANSU;useUnicode=true;characterEncoding=UTF8";
	private static String user = "sa";
	private static String password = "1";
	private static Connection connect=null;
	
	public ConnectionManager()
	{}
	public static Connection getConnection ()
	{
		if(connect==null) connect=makeConnection();
		return connect;		
	}
	public static Connection makeConnection()
	{
		 try {
				Class.forName(driver);//nap driver
				Connection connect= DriverManager.getConnection(url, user, password);
				return connect; 
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				return null;
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				return null;
			}		
	}
}
