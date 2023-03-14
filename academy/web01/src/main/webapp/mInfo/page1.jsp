<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%
    String logId = (String)session.getAttribute("memid");
	if(logId == null){ // 로그인을 하지않은 상태면 로그인페이지로 넘어간다
		response.sendRedirect("/web01/loginForm.jsp");
	}
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
	<h1>이 페이지는 회원 전용 첫번째 페이지입니다</h1>
<script>
 //여기에 jquery 코드 작성
</script>
</body>
</html>