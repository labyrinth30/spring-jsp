<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style>
div.container {
	width: 400px;
	margin: 20px auto;
}

select {
	display: block;
	width: 150px;
}

input {
	margin-top: 1em;
	display: block;
}

button {
	padding: 0.4em 2em;
	margin-top: 10px;
}
</style>
</head>
<body>
	<div class="container">
		<form method="post">
			<select name="value">
				<option ${value == "one" ? "selected" : "" }>one</option>
				<option ${value == "two" ? "selected" : "" }>two</option>
				<option ${value == "three" ? "selected" : "" }>three</option>
			</select> <input type="text" value="${value }" />
			<button type="submit">Ok</button>
		</form>
	</div>
</body>
</html>