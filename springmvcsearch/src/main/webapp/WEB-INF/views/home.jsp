<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">

<title>Home Page</title>
</head>
<body>
	<div class="container">

		<img alt="static image to check"
			class="image-size image-border image-hover"
			src="<c:url value="/resources/images/Lockscreen Walpaper.jpg" />">

		<div class="card mx-auto mt-5 bg-primary" style="width: 50%;">
			<div class="card-body py-5">
				<h3 class="text-center text-white"
					style="text-transform: uppercase;">Adarsh Search Engine</h3>
				<form class="mt-3" action="processform" method="post">
					<div class="form-group">
						<input type="text" class="form-control" name="querybox"
							placeholder="Search Here">
					</div>
					<div class="form-group text-center">
						<button type="submit" class="mt-3 btn btn-outline-light">Search</button>
					</div>
				</form>
			</div>
		</div>
	</div>


	<!-- Optional JavaScript; choose one of the two! -->

	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
	<script src="<c:url value="/resources/js/script.js" />"
		type="text/javascript"></script>

</body>
</html>