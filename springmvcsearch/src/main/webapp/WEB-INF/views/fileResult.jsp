<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>File Upload Result</title>
</head>
<body>
<h1>${msg }</h1>
<img alt="${file }" src="<c:url value="/resources/images/${file }" />">

</body>
</html>