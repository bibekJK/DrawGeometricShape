<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="spring"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"></link>
<style>
#lengthDiv {
	display: none;
}

.myClass {
	display: inline-block;
	overflow: auto;
	white-space: nowrap;
}
</style>
<title>Draw Shapes</title>
</head>
<body>
	<h1>Demo Project</h1>
	<hr></hr>

	<div class="container myClass">
		<div class="row">

			<div class="col-md-6">
				<form:form method="POST" modelAttribute="userInputs">
					<div class="form-group">
						<label for="shape" class="col-md-6">Shape:</label> <select
							name="shape" onChange="showDiv(this)" path="shape"
							class="form-control" style="width: auto;">
							<c:forEach items="${lstOfShapes}" var="shape">
								<option value="${shape}">${shape}</option>
							</c:forEach>
						</select>
					</div>
					<div class="form-group">
						<label for="height" class="col-md-6">Height:</label> <input
							type="number" name="height" id="height" path="height" value="" />
							<div id ="errorHeight">
						<form:errors path="height" cssStyle="color:red" />
						</div>
					</div>

					<div class="lengthDiv form-group" id="lengthDiv">
						<label for="length" class="col-md-6">Breadth:</label> <input
							type="number" name="breadth" id="length" path="breadth" value="" />
						<%-- <form:errors path="breadth" cssStyle="color:red" class="error"/> --%>
					</div>

					<div class="form-group">
						<label for="row" class="col-md-6">Row:</label> <input type="number"
							name="row" id="row" path="row" value="" />
							<div id ="errorRow"><form:errors path="row" cssStyle="color:red"  /></div>
						
					</div>

					<div class="form-group">
						<label for="text" class="col-md-6">Text:</label> <input
							type="text" name="text" id="text" path="text" value="" />
					</div>
					<div class="form-group">
						<div class="col-md-6">
							<input type="submit" value="DRAW" class="btn btn-default" />
						</div>
					</div>
				</form:form>
			</div>

			<div class="col-md-6">
				<h2>Result</h2>
				<div id="result">
				<h1>
					<tt>${result}</tt>
					</h1>
				</div>
			</div>
		</div>
		<script>
			function showDiv(elem) {
				document.getElementById('result').innerHTML = "";
				document.getElementById('errorRow').innerHTML = "";
				document.getElementById('errorHeight').innerHTML = "";
				
				if (elem.value == "RECTANGLE") {
					document.getElementById('lengthDiv').style.display = "block";
				} else {
					document.getElementById('lengthDiv').style.display = "none";
				}
			}
		</script>

		<script
			src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		<script
			src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>