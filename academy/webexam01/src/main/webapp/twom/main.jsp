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
<h1>고향의 봄</h1>
<jsp:include page="./sub.jsp"></jsp:include>
<br />=================== <br />
<%
request.setAttribute("aaa", "홍길동");

%>
<h2>청아한 사랑</h2>
<jsp:include page="./sub2.jsp">
	<jsp:param value="19" name="age"/>
	<jsp:param value="홍길동" name="userName"/>
</jsp:include>
<h1>메인의 마지막 내용임</h1>
<script>
 //여기에 jquery 코드 작성
</script>
</body>
</html>