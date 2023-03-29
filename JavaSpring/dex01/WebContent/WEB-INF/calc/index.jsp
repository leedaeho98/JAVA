<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body><!-- form>(input*2)+button{send}폼이라는 태그 밑에 인픗 태그 2개 생성 및 버튼 사이에 send 생성  -->
<form action="/dex01/calc/makeResult" method="post">
	<input type="text" name="num1" />
	<input type="text" name="num2" />
	<button>send</button>
</form>
</body>
</html>