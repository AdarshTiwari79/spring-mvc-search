<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Complex Form</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<div class="container mt-5">
		<div class="card">
			<div class="card-body">
				<form action="submit" method="post">
					<h1 class="d-flex justify-content-center mt-3 mb-3">Registration
						Form</h1>
					<div class="alert alert-danger" role="alert">
						<form:errors path="user.*" />
					</div>
					<div class="mb-3">
						<label for="name" class="form-label">Name</label> <input
							type="text" class="form-control" id="name"
							placeholder="Enter your name" name="name">
					</div>
					<div class="mb-3">
						<label for="email" class="form-label">Email address</label> <input
							type="email" class="form-control" id="email"
							placeholder="Enter your email" name="email">
					</div>
					<div class="mb-3">
						<label for="dob" class="form-label">DOB</label> <input type="text"
							class="form-control" id="dob" placeholder="dd/MM/yyyy" name="dob">
					</div>
					<div class="mb-3">
						<label for="courses" class="form-label">Courses</label> <select
							multiple class="form-select" id="courses" name="courses">
							<option value="Java Programming">Java Programming</option>
							<option value="Python Programming">Python Programming</option>
							<option value="Mathematics Foundation">Mathematics
								Foundation</option>
							<option value="Data Structure">Data Structure</option>
						</select>
					</div>
					<div class="mb-3">
						<label class="form-label">Gender</label>
						<div class="form-check">
							<input class="form-check-input" type="radio" name="gender"
								id="male" value="male"> <label class="form-check-label"
								for="male"> Male </label>
						</div>
						<div class="form-check">
							<input class="form-check-input" type="radio" name="gender"
								id="female" value="female"> <label
								class="form-check-label" for="female"> Female </label>
						</div>
					</div>
					<div class="card mb-3">
						<div class="card-body">
							<h5 class="card-title">Address</h5>
							<div class="mb-3">
								<label for="street" class="form-label">Street</label> <input
									type="text" class="form-control" id="street"
									placeholder="Enter your street" name="address.street">
							</div>
							<div class="mb-3">
								<label for="city" class="form-label">City</label> <input
									type="text" class="form-control" id="city"
									placeholder="Enter your city" name="address.city">
							</div>
						</div>
					</div>
					<div class="d-flex justify-content-center">
						<button type="submit" class="btn btn-primary">Submit</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>
