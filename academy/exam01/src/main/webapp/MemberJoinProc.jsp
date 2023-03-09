<%@page import="com.sample.exam01.dao.MemberDAO"%>
<%@page import="com.sample.exam01.dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	// 입력화면에서 넘어온 자료
	String mem_id= request.getParameter("mem_id"); // 데이터를 가져온다(모든 입력과 출력은 문자열로 된다 그러므로 String)
	String mem_pwd= request.getParameter("mem_pwd"); 
	String mem_name= request.getParameter("mem_name"); 
	String mem_phone= request.getParameter("mem_phone"); 
	String mem_addr= request.getParameter("mem_addr");
	// 넘겨받은 자료를 하나로 묶어서 DAO클래스에게 넘겨 주고 입력하라고 일 시키기
	// 1. 하나로 묶기
	Member member = new Member(mem_id, mem_pwd, mem_name, mem_phone , mem_addr);
	
	// 2. DAO에게 일 시키기
	MemberDAO dao = new MemberDAO(); // 일 하는 클래스를 데려오기
	int result = dao.insert(member); // insert의 자료타입은 int이므로 타입 int 변수에 넣는다
	if( result != 1){
		System.out.println("입력이 잘못되었습니다.!!!!"); 
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3><%= result %>명의 회원이 가입되었습니다.</h3>
	<h3>가입한 회원의 이름은 <%= mem_name  %>이며  아이디는 <%= mem_id %> 입니다 </h3>
</body>
</html>