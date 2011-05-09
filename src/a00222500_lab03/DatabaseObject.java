package a00222500_lab03;

import java.util.*;
import java.sql.*;

public class DatabaseObject {

	protected Connection conn = null;
	protected Statement stmt = null;
	private ResultSet queryResults = null;
	private String driver = "";
	private String dbname = "";
	private String url = "";
	private String user = "";
	private String password = "";
	
	private void setURL(String url){
		this.url = url;
	}
	
	private void setDriver(String driver){
		this.driver = driver;
	}
	
	private void setDBName(String dbname){
		this.dbname = dbname;
	}
	
	private void setUser(String user){
		this.user = user;
	}
	
	private void setPassword(String password){
		this.password = password;
	}
	
	public DatabaseObject(String url, String driver, String dbname, String user, String password) {
		this.setURL(url);
		this.setDriver(driver);
		this.setDBName(dbname);
		this.setUser(user);
		this.setPassword(password);
	}
	
	
	@SuppressWarnings("rawtypes")
	public Vector getRecords(String selectQuery){
		Vector<Vector<String>> rows = new Vector<Vector<String>>();
			
		try{
			Class.forName(this.driver);
			Connection connection = DriverManager.getConnection(this.url, this.user, this.password);
			Statement stmt = connection.createStatement();
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
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return rows;	
	}
	
	public void cleanup() {
		/*try {
			//stmt.close();
			//conn.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}*/
	}
	
	
}
