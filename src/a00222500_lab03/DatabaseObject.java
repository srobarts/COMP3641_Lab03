package a00222500_lab03;

import java.util.*;
import java.sql.*;
import java.sql.DriverManager;

public class DatabaseObject {

	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet queryResults = null;
	private String url = "";
	private String driver = "";
	private String user = "";
	private String password = "";
	
	public void setURL(String url){
		this.url = url;
	}
	
	public void setDriver(String driver){
		this.driver = driver;
	}
	
	public void setDBName(String dbname){
	}
	
	public void setUser(String user){
		this.user = user;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public DatabaseObject() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		} catch(SQLException ex){
			ex.printStackTrace();
		}catch (ClassNotFoundException ex){
			ex.printStackTrace();
		} 
	}
	
	
	@SuppressWarnings("rawtypes")
	public Vector getRecords(String selectQuery){
		Vector<Vector<String>> rows = new Vector<Vector<String>>();
		
		try{
			stmt = conn.createStatement();
			queryResults = stmt.executeQuery(selectQuery);
			
			ResultSetMetaData meta = queryResults.getMetaData();
			int numCols = meta.getColumnCount();
			
			while(queryResults.next()) {
				Vector<String> oneRow = new Vector<String>();
				for(int i=1; i<=numCols; i++){
					oneRow.addElement(queryResults.getString(i));
				} 
				rows.addElement(oneRow);
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return rows;	
	}
	
	public void cleanup() {
		try {
			stmt.close();
			conn.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	
}
