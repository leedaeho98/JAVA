<%@ page import="com.leedaeho.First.dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	// 자바코드가 들어간다...
	// 가져온 변수의 이름을 그대로 쓴다
	String userId= request.getParameter("userId"); // 익명으로 넘어온 자료(userId)를 가져오겠다
	String pwd= request.getParameter("pwd");
	String iname= request.getParameter("iname");
	String addr= request.getParameter("addr");
	
	System.out.println("입력한 아이디는 " +userId + " 입니다 => 이자료를 데이터베이스에 저장할거임...");
	Member insertData = new Member(userId, pwd, iname, addr);
	out.print("<h1>회원 가입이 완료되었습니다.!!!</h1>");
	// out.print는 회원가입을 다 했을경우 나오는 print문이다
%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>