package a00222500_lab03;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.DriverManager;

public class dbconnect {
	
	java.sql.Connection con = null;
	
	public void init(ServletConfig config) throws ServletException { 
		super.init(config); 
		String host = getInitParameter("host"); 
		int port = Integer.parseInt(getInitParameter("port")); 
		String db = getInitParameter("db"); 
		String user = getInitParameter("user"); 
		String password = getInitParameter("password"); 
		String proxy = getInitParameter("proxy"); 
		con = establishConnection(host, port, db, user, password, proxy); 
	}

	public void connectToDB()
	{
		try {
			
			Class.forName(driver);
			conn = DriverManager.getConnection(URL);
			
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
}
