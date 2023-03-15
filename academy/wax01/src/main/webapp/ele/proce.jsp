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
<c:forEach var="mem" items="${list}">
	회원명 :${mem.aa} ==== 회원주소 :${mem.bb}==== 회원 메일 :${mem.cc}<br />
	</c:forEach>
	
<hr /><hr />

넘겨받은 첫번째자료 : ${list.get(0).aa}<br />
넘겨받은 첫번째자료 : ${list.get(0).bb}<br />
넘겨받은 첫번째자료 : ${list.get(0).cc}<br />
넘겨받은 두번째자료 : ${list.get(1).aa}<br />
넘겨받은 두번째자료 : ${list.get(1).bb}<br />
넘겨받은 두번째자료 : ${list.get(1).cc}<br />
넘겨받은 세째자료 : ${list.get(2).aa}<br />
넘겨받은 세번째자료 : ${list.get(2).bb}<br />
넘겨받은 세번째자료 : ${list.get(2).cc}<br />

<script>
 //여기에 jquery 코드 작성
</script>
</body>
</html>