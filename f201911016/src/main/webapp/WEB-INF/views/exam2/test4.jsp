<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style>

.container {
	width: auto;
	height: auto;
}
table{
border-collapse:collapse;}
td {
	border: 1px solid black;
	background-color: white;
	padding:0.3em;
}
</style>
</head>
<body>
	<div class="container">
		<table>
			<tr>
				<td>학번</td>
				<td>${myNum }
			</tr>
			<tr>
				<td>이름</td>
				<td>${myName }</td>
			</tr>

		</table>
	</div>
</body>
</html>