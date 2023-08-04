<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	width: 40px;
	text-align:left;
	display:inline-block;
}

input[type=text] {
	width: 200px;
	padding: 5px;
}

button {
	padding: 0.4em 2em;
	margin-top: 10px;
	margin-left: 45px;
}
</style>
</head>
<body>
	<div class="container">
		<form method="post">
			<div>
				<label>학번</label> <input type="text" class="text" name="myNum"
					value="${ myNum }" />
			</div>
			<div>
				<label>이름</label> <input type="text" class="text" name="myName"
					value="${myName }" />
			</div>
			<button type="submit">확인</button>
		</form>
	</div>
</body>
</html>