package a00222500_lab03;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class lab03_servlet
 */
@WebServlet("/lab03_servlet")
public class lab03_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Cache-Control", "no-cache");
		//fetch init parameters
		String url = getInitParameter("url"); 
		String driver = getInitParameter("driver"); 
		String dbname = getInitParameter("dbname"); 
		String user = getInitParameter("user"); 
		String password = getInitParameter("password"); 
		
		DatabaseObject db = new DatabaseObject();
		
		db.setURL(url);
		db.setDriver(driver);
		db.setDBName(dbname);
		db.setUser(user);
		db.setPassword(password);
		db.cleanup();
		 
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	} 
	
}
