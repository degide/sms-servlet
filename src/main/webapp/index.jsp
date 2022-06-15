<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width; initial-scale=1.0">
	<meta charset="UTF-8">
	<title>SMS</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<%@ include file="navbar.jsp" %>
	<div class="container py-4">
		<br><br>
		<h5 class="">Enter your name:</h5>
		<form action="welcome.jsp" class="col-6">
			<input type="text" name="fullName" placeholder="Enter your full name" class="form-control" required/><br/><br/>
			<button type="submit" name="submit" class="btn btn-primary">SUBMIT</button>
		</form>
	</div>
</body>
</html>