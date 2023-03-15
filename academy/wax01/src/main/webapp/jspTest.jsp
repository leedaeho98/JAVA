<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="keywords" content="여기에 중요한 키워드 8개정도 나열" />
<meta name="description" content="이 페이지를 설명하는 키워드를 문장형식으로 나열" />
<title>Insert title here</title>

</head>
<body>
<c:set var="member" value ="Honggildong"/>

멤버변수에 저장된 값 : ${member } <br />
<c:forEach var ="no" begin="1" end="10">
영구없다. ${no }<br />
</c:forEach>
<script>
 //여기에 jquery 코드 작성
</script>
</body>
</html>