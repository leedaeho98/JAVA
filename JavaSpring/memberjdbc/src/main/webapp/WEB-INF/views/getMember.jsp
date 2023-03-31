<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>회원 조회</h1>
	<form action="getMember" method="POST">
		<input type="text" name="memId" placeholder="아이디" /><br />
		<button>회원조회</button>
	</form>
</body>
</html>
