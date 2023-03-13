<%@page import="com.yangdoll.useck.CookieBox"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%
// 쿠키 이름은 spviewlist, 쿠키값으로는 0001저장하고자 한다.
// 쿠키자체가 있는지 따진다. O : 
	// spviewlist 쿠키명이 기존에 존재하는지 1) O(존재) : 기존에 추가 , X(없음) : 새로만들어서 0001을 할당
// 쿠키자체가 있는지 따진다. X :
	//새로 만들어서 0001을 할당한다
	CookieBox cookieBox = new CookieBox(request);
	String cookieName = "spviewlist";
	String cookieValue = "0003";
	String path ="/";
	int maxAge = 3600*24*30;
	Cookie cookie = null;
	
	
	
	if (cookieBox.existsCookie("spviewlist")){// 존재한다. 기존쿠키에 현재 상품추가
		cookie = cookieBox.cookieVlaueAppend(cookieBox.getCookie(cookieName), cookieValue);
		cookie.setPath(path);
		
	}else{ // 존재하지 않는다 => 새롭게 쿠키를 만든다
		cookie = CookieBox.createCookie(cookieName, cookieValue, path,maxAge);
	}
	response.addCookie(cookie);
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
<h1>신발상품상세페이지 입니다....</h1>
<script>
 //여기에 jquery 코드 작성
</script>
</body>
</html>