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
	margin: 20px auto;
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
			<h1>책&nbsp;등록</h1>
			<div>
				<label>제목</label> <input type="text" class="text" name="title"
					value="${ title }" />
			</div>
			<div>
				<label>저자</label> <input type="text" class="text" name="writer"
					value="${writer }" />
			</div>
			<div>
				<label>출판사</label> <input type="text" class="text" name="publisher"
					value="${publisher }" />
			</div>
			
				<label>카테고리</label>
			<div style="display: flex"> 
				<input type="radio" name="category" value="소설" ${ category == "novel" ? "checked" : "" }>소설<br> 
				<input type="radio" name="category" value="과학"${ category == "science" ? "checked" : "" }>과학<br>
				<input type="radio" name="category" value="역사"${ category == "history" ? "checked" : "" }> 역사
			</div>
			<button type="submit" class="btn">로그인</button>
		</form>
		<div class="error">${ errorMsg }</div>
		<hr />
		현재시각:
		<fmt:formatDate pattern="HH:mm:ss" value="${ now }" />
		<br /> 제목: ${ title } <br /> 저자: ${ writer } <br />
		출판사: ${ publisher } <br />
		카테고리: ${ category }<br/>
	</div>
</body>
</html>
