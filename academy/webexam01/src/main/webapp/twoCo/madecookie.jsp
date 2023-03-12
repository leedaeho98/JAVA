<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%
	// 쿠키 생성
	Cookie sangpumInfo = new Cookie("viewsp","tv");
	sangpumInfo.setMaxAge(60*5); // 쿠키가 서버에 한시간동안 남아있는다
	Cookie loginInfo = new Cookie("loginInfo","leedaeho");
	loginInfo.setMaxAge(60*20*24*365);
	response.addCookie(sangpumInfo);
	response.addCookie(loginInfo);
	
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
	<h1>쿠키발급페이지</h1>
	<p>2개의 쿠키가 발급되었습니다</p>
	<a href="./spview.jsp">상품정보 보기</a>
<script>
 //여기에 jquery 코드 작성
</script>
</body>
</html>