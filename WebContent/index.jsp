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
			<h1>COMP 3641 Temperature Converter</h1>
			<hr />
		</div>
		
		<div id="content">
			<div id="stylized" class="myform">
				<form id="form" name="form" method="post" action="convert">
					<h1>Temperature Converter</h1>
					<p>Convert any temperature between Celsius and Fahrenheit</p>
					
					<label>Temperature:
					<span class="small">Input temperature:</span>
					</label>
					<input SIZE=5 MAXLENGTH=25 name="inputTemp" id="inputTemp" />
					
					<label>Select Conversion:
					<span class="small">Convert temperature to:</span>
					</label>
					<div id="radioblock">
						<input type="radio" name="convertTo" value="C" />Celsius <br />
						<input type="radio" name="convertTo" value="F" />Fahrenheit
					</div>
					
					<button type="submit">Convert</button>
					<div class="spacer"></div>
				</form>
			</div>
		</div>
		
		
		
		
		
		<div id="footer">
			<p>Copyright &copy;2011 Scott Robarts, COMP 3641</p>
		</div>
	
	</div>

</html>