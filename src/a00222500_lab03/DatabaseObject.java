package a00222500_lab03;

import java.sql.*;

public class DatabaseObject {

	private String driver = "";
	private String url = "";
	private String user = "";
	private String password = "";
	
	private void setURL(String url){
		this.url = url;
	}
	
	private void setDriver(String driver){
		this.driver = driver;
	}
	
	private void setUser(String user){
		this.user = user;
	}
	
	private void setPassword(String password){
		this.password = password;
	}
	
	public DatabaseObject() {
	}
	
	
	/*@SuppressWarnings("rawtypes")
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
	}*/
	
	/*public void cleanup() {
		try {
			stmt.close();
			conn.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}*/
	
	
}
