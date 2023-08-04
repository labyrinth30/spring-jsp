<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style>
div.container {
	width: 400px;
	margin: 20px;
}

form div {
	margin-bottom: 20px;
}

label {
	display: block;
}

input[type=text], input[type=password] {
	width: 200px;
	padding: 5px;
}

.btn {
	border: 1px solid gray;
	text-decoration: none;
	padding: 0.4em 1em;
	color: black;
	background-color: #eee;
	cursor: pointer;
	font-size: 10pt;
}

hr {
	margin-top: 80px;
}

.error {
	color: red;
	margin: 5px;
}
</style>
</head>
<body>
	<div class="container">
		<form method="post">
			<div>
			<input type="text" class="text" name="color1"
					value="${color1 }" />
			</div>

			<div style="display: flex"> 
				<input type="radio" name="color2" value="yellow" ${ color2 == "yellow" ? "checked" : "" }>yellow<br> 
				<input type="radio" name="color2" value="red"${ color2 == "red" ? "checked" : "" }>red<br>
				<input type="radio" name="color2" value="blue"${ color2 == "blue" ? "checked" : "" }> blue
			</div>
			<button type="submit" class="btn">확인</button>
		</form>
		<div class="error">${ errorMsg }</div>
	</div>
</body>
</html>
