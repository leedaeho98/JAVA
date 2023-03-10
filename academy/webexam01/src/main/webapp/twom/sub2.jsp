 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%
	request.setCharacterEncoding("utf-8");
	int age = Integer.parseInt(request.getParameter("age")); // 값이 정수형 형변환 해야함,값을 받는다
	String userName = request.getParameter("userName");
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
<p>너 내곁에 없으면 나 혼자 설 수 없나니 너 나의 구원이요 난 가늘한 실바람이라</p>
나이는 : <%= age  %> <br />
이름은 : <%= userName %> <br />
<%= request.getAttribute("aaa")%>
<script>
 //여기에 jquery 코드 작성
</script>
</body>
</html>