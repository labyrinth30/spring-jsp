<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style>
div.container {
	width: 800px;
	margin: 50px auto;
}

thead th {
	background-color: #eee;
}

table {
	border-collapse: collapse;
	width: 100%;
}

td, th {
	padding: 4px;
	border: 1px solid lightgray;
}

td:nth-child(4) {
	text-align: right;
}
td:nth-child(5) {
	text-align: right;
}

.btn {
	padding: 0.4em 1em;
	border: 1px solid gray;
	border-radius: 0.5em;
	background: linear-gradient(#fff, #ddd);
	text-decoration: none;
	color: black;
	display: inline-block;
}

a.btn {
	float: right;
	margin: -20px 0 5px 0;
}
</style>
</head>
<body>
	<div class="container">
		<h1>도시목록</h1>
		<a href="create" class="btn">도시등록</a>
		<table class="table table-bordered table-condensed">
			<thead>
				<tr>
					<th>ID</th>
					<th>도시명</th>
					<th>도</th>
					<th>인구</th>
					<th>면적</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="city" items="${ cities }">
					<tr>
						<td>${ city.id }</td>
						<td><a href="edit?id=${ city.id }">${ city.name }</a></td>
						<td>${ city.districtName }</td>
						<td>${ city.population }</td>
						<td>${ city.area }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>