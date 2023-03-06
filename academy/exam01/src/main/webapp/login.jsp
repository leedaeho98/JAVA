<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원로그인</h1>
	<form action="./loginProc.jsp" method="post">
		<input type="text" name="mem_id" placeholder="아이디 입력" /><br/>
		<input type="password" name="mem_pwd" placeholder="비번 입력" />
		<button>로그인</button>
	</form>
</body>
</html>