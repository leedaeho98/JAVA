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
	<h1>쿠키정보</h1>
	<% Cookie[] cookies = request.getCookies();
	int cookielength = cookies.length;
	for (int i = 0; i< cookielength ; i++){
		out.println("<p>쿠키 값 : " + cookies[i].getName() + "</p>");
		out.println("<p>쿠키 값 : " + cookies[i].getValue() + "</p>");
	}
	%>
	<h1>일반상품정보</h1>
	<p>상품목록들이0001들이 여기에 나옴</p>
	<p>상품목록들이0002들이 여기에 나옴</p>
	<p>상품목록들이0003들이 여기에 나옴</p>
	<p>상품목록들이0004들이 여기에 나옴</p>
	<p>상품목록들이0005들이 여기에 나옴</p>
<script>
 //여기에 jquery 코드 작성
</script>
</body>
</html>