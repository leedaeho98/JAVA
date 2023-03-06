<%@page import="com.sample.exam01.dto.Member"%>
<%@page import="com.sample.exam01.dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 입력화면에서 넘어온 자료
	String mem_id= request.getParameter("mem_id"); // 데이터를 가져온다(모든 입력과 출력은 문자열로 된다 그러므로 String)
	String mem_pwd= request.getParameter("mem_pwd");
	
	// 넘겨받은 아이디를 넘겨주면서 일 시키기
	
	MemberDAO dao = new MemberDAO(); // 일 하는 클래스를 데려오기 => 빨간줄이 그어져있으면 ctrl + space(import(불러온다))
	Member member = dao.selectOne(mem_id); // select의 타입은 Member이므로 타입은 Member로 한다
/*
	// 넘겨받은 자료가 없으면 그런 회원이 존재하지 않음(member = null)
	if (member != null){ // 회원이 존재한다 (null이 아니면?)
		// 반드시 비밀번호도 일치해야 한다.
		if (member.getMem_pwd().equals(mem_pwd)){ // 회원과 비밀번호가 일치(equals = 문자열 비교)하면 로그인 성공 (member 앞에 !을 붙이면 반대)
			System.out.println("로그인 성공했습니다");
		
		}else{ // 회원은 존재하지만 비밀번호는 일치하지 않음
			System.out.println("회원은 존재하지만 비밀번호는 일치하지 않음");
		}
			
		
	}else{ // 회원이 존재하지 않는다 (null)
		System.out.println("회원이 존재하지 않습니다");
	}
*/
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% // 자바코드는 <% 사용
if (member != null){ 

	if (member.getMem_pwd().equals(mem_pwd)){ 
		out.println("<h2>로그인 성공했습니다.</h3>"); // 웹 상에 출력
		out.println("<a href=\"./index.html \">Home.</h3>"); 
	
	}else{ 
		out.println("<h2>회원은 존재하지만 비밀번호는 일치하지 않음</h2>");
		out.println("<a href=\"./login.jsp \">Home.</h3>");
	}
		
	
}else{ 
	out.println("<h2>회원이 존재하지 않습니다.</h2>");
	out.println("<a href=\"./login.jsp \">Home.</h3>");
}
%>
</body>
</html>