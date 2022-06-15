<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width; initial-scale=1.0">
	<meta charset="UTF-8">
	<title>Welcome</title>
	<!-- Latest compiled and minified CSS -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<!-- Latest compiled JavaScript -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<link rel="stylesheet" href="css/styles.css">
</head>
<body>
	<%@ include file="navbar.jsp" %>
	<br><br>
	<%
		String fullname = request.getParameter("fullName");
		session.setAttribute("fullName", fullname);
	%>
	<h1>Welcome Mr/Mrs <%= fullname %></h1>
	
	<a href="second.jsp">Go to second screen</a>
</body>
</html>