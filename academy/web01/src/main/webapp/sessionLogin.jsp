<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
    
<%
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	if(id.equals(password)){
		session.setAttribute("memid", id);
		session.setMaxInactiveInterval(60 * 10); // 세션의 유효시간
		
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="keywords" content="여기에 중요한 키워드 8개정도 나열" />
<meta name="description" content="이 페이지를 설명하는 키워드를 문장형식으로 나열" />
<title>Insert title here</title>

</head>
<body>
	<h1>로그인 성공</h1>

</body>
</html>

<%
	}else{ 
%>
<script>
	alert("로그인 실패!!!");
	history.go(-1) // 로그인을 실패하면 전 페이지로 이동해라
</script>
<%
	}
%>