<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>/todo/register get방식 요청시 보여지는 register.jsp page</h1>
<form action="${pageContext.request.contextPath }/todo/register" method="post">
	<button type="submit">등록처리</button>
</form>
</body>
</html>