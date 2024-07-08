<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Processed Form</title>
</head>
<body>
	<h1>Complete data from the form : </h1>
	<h2>${user }</h2>
	<h2>Address Stree : ${user.address.street }</h2>
</body>
</html>