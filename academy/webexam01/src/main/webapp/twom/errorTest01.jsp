<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
 <%@ page errorPage = "./errorMesege.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="keywords" content="여기에 중요한 키워드 8개정도 나열" />
<meta name="description" content="이 페이지를 설명하는 키워드를 문장형식으로 나열" />
<title>Insert title here</title>

</head>
<!-- 1234 1234 1234 1234 1234 1234 1234 1234 1234 1234 1234 1234 1234 1234 1234 1234 1234 1234 1234 1234 1234 -->
<body>
	<h1>이 페이지는 요청하신 정보가 들어 있어요</h1>
	<p>전달된 이름 자료는 <%= request.getParameter("iname").substring(1) %></p>
	
<script>
 //여기에 jquery 코드 작성
</script>
</body>
</html>