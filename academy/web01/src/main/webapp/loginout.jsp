<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

	<%
		session.invalidate();
		response.sendRedirect("/web01"); // 다시 접속을 하라는 의미다
	%>
