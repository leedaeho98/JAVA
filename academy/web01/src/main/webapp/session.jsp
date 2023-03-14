<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
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
	<!--<%= session.getId() %> 
	  <%= new Date( session.getCreationTime()).toString()%>-->
	  
	<!--  <% 	Date sessionData1 = new Date();
		out.print(sessionData1 + "<br />");
		sessionData1.setTime(111111111111111111L);
		out.print(sessionData1);
	%> -->
	
<% 
	Date sessionData2 = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 hh시-mm분-ss초");
%>
발급된 세션 아이디 : <%=session.getId() %> <br />
최초 세션 아이디 발급된 시간 : <%= dateFormat.format(session.getCreationTime()) %> <br />
가장 최근에 접속한 시간 : <%= dateFormat.format(session.getLastAccessedTime()) %> <br /> <!-- 가장 최근에 접속한 시간이 뜬다(session.getL -->
===================<br />
<%
request.getAttribute("reqLog");  
session.getAttribute("sesLog");
%>
<script>
 // 여기에 jquery 코드 작성
</script>
</body>
</html>