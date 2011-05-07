package a00222500_lab03;

import java.io.IOException;
import java.sql.DriverManager;
import java.util.*;
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

	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	} 
	
	protected void getDatabaseParameters() {
			String url = getInitParameter("url"); 
			String driver = getInitParameter("driver"); 
			String dbname = getInitParameter("dbname"); 
			String user = getInitParameter("user"); 
			String password = getInitParameter("password"); 
			
			Properties props = new Properties();
			
		}
	}

}
