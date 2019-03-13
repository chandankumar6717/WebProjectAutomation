<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>this is O2c Page</h1>
</body>
<form action="OrdrToCashController" method="post">
	<table style="with: 50%">
		<tr>
			<td>SSO</td>
			<td><input type="text" name="User_SSO" /></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="password" name="SsoPassword" /></td>
		</tr>
		<tr><td>
	<input	type="submit" value="Download" name="DownlaodFile" />
</tr>
	</table>
	
	<input type="submit" value="Submit" />
	
</form>



</body>
</html>