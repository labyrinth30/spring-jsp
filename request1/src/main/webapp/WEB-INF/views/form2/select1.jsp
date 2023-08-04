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

form div {
	margin-bottom: 10px;
}

label {
	display: block;
	width: 70px;
	text-align: left;
}

input {
	width: 150px;
	padding: 4px;
}

select {
	width: 50px;
	padding: 4px;
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
			<h1>학생</h1>
			<div>
				<label>학번</label> <input type="text" name="stuNum"
					value="${ stuNum }" />
			</div>

			<div>	
				<label>이름:</label> <input type="text" name="stuName"
					value="${ stuName }" />
			</div>
			<div>
				<button type="submit">저장</button>
			</div>
		</form>
		<p>
	</div>
</body>
</html>
