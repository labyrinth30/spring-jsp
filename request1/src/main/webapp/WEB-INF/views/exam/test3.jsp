<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style>
<
body>div.container {
	width: 400px;
	margin: 20px;
}

form div {
	margin-bottom: 20px;
}

h3 {
	color: blue;
}
</style>
</head>
<body>
	<div class="container">
		<h3><fmt:formatDate pattern="HH:mm:ss" value="${ myTime }" /></h3>
	</div>
</body>
</html>