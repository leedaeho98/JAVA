<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="keywords" content="여기에 중요한 키워드 8개정도 나열" />
<meta name="description" content="이 페이지를 설명하는 키워드를 문장형식으로 나열" />
<title>Insert title here</title>

</head>
<body>
<%= session.getId() %> <!--  세션값이 나옴 -->
<% 
	session.setAttribute("sesLog", "leedaeho");
	request.setAttribute("reqLog", "gildong");
%>
<%
	String logId = (String)session.getAttribute("memid");
	if(logId != null){
		out.print("로그인한 상태입니다...!!! <br />");
		out.print(logId + "님 반갑습니다...<br />");
		out.print("<a href=\"loginout.jsp\">로그아웃</a><br />");
	}else{
		out.print("로그인이 되지않은 상태입니다");
		out.print("<a href=\"loginForm.jsp\">로그인화면</a><br/>");
	}
%>
<div>
	<p>001의 내용들이 여기에 나옵니다. 일반적인정보입니다.</p>
	<p>002의 내용들이 여기에 나옵니다. 일반적인정보입니다.</p>
	<p>003의 내용들이 여기에 나옵니다. 일반적인정보입니다.</p>
	<p>004의 내용들이 여기에 나옵니다. 일반적인정보입니다.</p>
	<p>005의 내용들이 여기에 나옵니다. 일반적인정보입니다.</p>
	<p>006의 내용들이 여기에 나옵니다. 일반적인정보입니다.</p>
	<p>007의 내용들이 여기에 나옵니다. 일반적인정보입니다.</p>
	<p>008의 내용들이 여기에 나옵니다. 일반적인정보입니다.</p>
	<p>009의 내용들이 여기에 나옵니다. 일반적인정보입니다.</p>
	<p>010의 내용들이 여기에 나옵니다. 일반적인정보입니다.</p>
	<p>011의 내용들이 여기에 나옵니다. 일반적인정보입니다.</p>
	<p>012의 내용들이 여기에 나옵니다. 일반적인정보입니다.</p>
	<p>013의 내용들이 여기에 나옵니다. 일반적인정보입니다.</p>
	<p>014의 내용들이 여기에 나옵니다. 일반적인정보입니다.</p>
	<p>015의 내용들이 여기에 나옵니다. 일반적인정보입니다.</p>
</div>
<script>
</script>
</body>
</html>