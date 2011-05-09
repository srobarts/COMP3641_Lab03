package a00222500_lab03;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class utlities {
	
	public static final String DOCTYPE =
	    "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +
	    "Transitional//EN\">";

	  public static String headWithTitle(String title) {
	    return(DOCTYPE + "\n" +
	           "<HTML>\n" +
	           "<HEAD><TITLE>" + title + "</TITLE></HEAD>\n");
	  }
	  
	  /*public void outputResultSet(ResultSet rs) {
		  response.setContentType("text/html");
		  PrintWriter out = response.getWriter();
		  String title = "Order Form Confirmation";
		  out.println(
		        "<BODY BGCOLOR=\"#FDF5E6\">\n" +
		        "<H1 ALIGN=CENTER>" + title + "</H1>\n" +
		        "<TABLE BORDER=1 ALIGN=CENTER>\n" +
		        "<TR BGCOLOR=\"#FFAD00\">\n" +
		        "<TH>Item</TH><TH>Value(s)</TH>" +
		        //"<tr><td>Member ID</td><td>" + memberID + "</td></tr>" +
		        //"<tr><td>Name</td><td>" + name + "</td></tr>" +
		        //"<tr><td>Address</td><td>" + address + "</td></tr>" +
		        //"<tr><td>Country</td><td>" + country + "</td></tr>" +
		        //"<tr><td>Phone</td><td>" + phone + "</td></tr>" +
		        //"<tr><td>Email</td><td>" + email + "</td></tr>" +
		        "</table></body>");
	  }*/
	
	
	

}
