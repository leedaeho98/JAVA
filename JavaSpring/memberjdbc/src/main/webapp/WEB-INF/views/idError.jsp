<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	a{
		text-decoration:none;
		display: inline-block;
		width: 150px;
		height: 30px;
		background: #ccc;
		border: solid blue 2px;
		border-radius: 10px;
		line-height: 20px;
		text-align: center;
	}
</style>
</head>
<body>
<h1>${memId}회원이 존재하지 않습니다....</h1>
<a href="/member/">확인</a>

</body>
</html>