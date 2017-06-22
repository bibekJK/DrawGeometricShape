<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"></link>
<style>
#lengthDiv {
	display: none;
}
</style>
<title>Draw Shapes</title>
</head>
<body>
	<h1>Demo Project</h1>
	<hr></hr>
	<div class="content">
		<div class="myForm">
			<form action="#" method="POST">
				<div>
					<label for="shape">Shape:</label> <select name="shape"
						onChange="showDiv(this)">
						<option value="triangle" id="triangle">Triangle</option>
						<option value="diamond" id="diamond">Diamond</option>
						<option value="square" id="square">Square</option>
						<option value="rectangle" id="rectangle">Rectangle</option>
					</select>
				</div>

				<div>
					<label for="height">Height:</label> <input type="text"
						name="height" id="height" />
				</div>

				<div class="lengthDiv" id="lengthDiv">
					<label for="length">Length:</label> <input type="text"
						name="length" id="length" />
				</div>

				<div>
					<label for="row">Row:</label> <input type="text" name="row"
						id="row" />
				</div>

				<div>
					<label for="text">Text:</label> <input type="text" name="text"
						id="text" />
				</div>

				<div>
					<input type="submit" value="DRAW" />
				</div>

			</form>
		</div>
	</div>

	<script>
		function showDiv(elem) {
			if (elem.value == "rectangle") {
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