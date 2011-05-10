package a00222500_lab03;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		String sqlResult = "";
		String sqlStatement =  request.getParameter("query");
		
		//fetch init parameters
		String url = getInitParameter("url"); 
		String driver = getInitParameter("driver"); 
		String username = getInitParameter("username"); 
		String password = getInitParameter("password"); 

		try {
			Class.forName(driver);
			Connection connection = DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sqlStatement);
			sqlResult = ServletUtilities.getHTMLTable(resultSet);
			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		
		
		HttpSession session = request.getSession();
		session.setAttribute("sqlResult", sqlResult);
		session.setAttribute("sqlStatement", sqlStatement);
		String url2 = "/output.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url2);
		dispatcher.forward(request, response);
		 
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	} 
	
}
