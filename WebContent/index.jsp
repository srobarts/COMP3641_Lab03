<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="lab03styles.css" >
<title></title>
</head>

<body>

</body>
	<div id="wrapper">
		<div id="header">
			<h1>COMP 3641 Lab 03</h1>
			<h2>The Beatles Collection Database</h2>
			<hr />
		</div>
		
		<div id="applet_image">
			<img src="Let_it_be.jpg" />
			<APPLET CODE="PlayBeatlesTune" WIDTH="200" HEIGHT="300">
  				<B>Error! You must use a Java-enabled browser.</B>
			</APPLET>
		</div>
		
		<div id="content">
			<div id="stylized" class="myform">
				<form id="form" name="form" method="post" action="query_database">
					<p>Input a correct SQL statement below to query the database.<br />
					Query results will be show on the following page after submission.</p>
					
					<h3>Sample Query:</h3>
					<p>SELECT * FROM beatles<br />
					SELECT * FROM beatles WHERE title LIKE '%Help%'</p>
					
					
					<label>Query:
					<span class="small">Please input your query:</span><br />
					</label>
					<input SIZE=50 name="query" id="query" />
					
					<button type="submit">Submit</button>
					<div class="spacer"></div>
				</form>
			</div>
		</div>
		
		
		
		
		
		<div id="footer">
			<p>Copyright &copy;2011 Scott Robarts, COMP 3641</p>
		</div>
	
	</div>

</html>