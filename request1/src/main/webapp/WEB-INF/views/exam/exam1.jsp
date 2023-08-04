<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style>
div.container {
	width: 400px;
	height: 130px;
	margin-top:20px;
	margin-right:20px;
	margin-left:20px;
	margin-bottom:0px; 
	background-color:${backgroundColor};
	padding: 20px;
	border: 1px solid gray;
}
div.color{
margin-left: 20px;
}
select{
width:100px;
height:2em;}
button {
	padding: 0.4em 2em;
	margin-top: 10px;
}
</style>
</head>
<body>
	<div class="container">
	<h1>Color</h1>
		<form method="post">
			<select name="backgroundColor">
				<option ${backgroundColor == "red" ? "selected" : "" }>red</option>
				<option ${backgroundColor == "green" ? "selected" : "" }>green</option>
				<option ${backgroundColor == "blue" ? "selected" : "" }>blue</option>
				<option ${backgroundColor == "yellow" ? "selected" : "" }>yellow</option>
			</select> 
			<button type="submit">저장</button>
		</form>
	</div>
	<div class="color">
	${backgroundColor}
	</div>
</body>
</html>