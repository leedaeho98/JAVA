<%@page import="com.leedaeho.webexam01.dao.DBConnection"%>
<%@page import="java.sql.Connection"%>
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
<%
	String driver = application.getInitParameter("dbDriver");
	String url = application.getInitParameter("url");
	String userName = application.getInitParameter("userName");
	String password = application.getInitParameter("password");
	
	Connection con = DBConnection.getConnection(driver, url , userName , password);
%>
<h1>넘겨받은 초기화 파라메타1 : <%= driver %></h1>
<h1>넘겨받은 초기화 파라메타2 : <%= url %></h1>
<h1>넘겨받은 초기화 파라메타3 : <%= userName %></h1>
<h1>넘겨받은 초기화 파라메타4 : <%= password %></h1>
<h1>연결된 커넥션 : <%=con  %></h1>
<script>
 //여기에 jquery 코드 작성
</script>
</body>
</html>