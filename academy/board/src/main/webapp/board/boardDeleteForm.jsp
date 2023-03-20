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
	<form action="./BoardDeleteAction.bo?boardNum=${param.boardNum}" name="deleteForm" method ="post">
		<label for="">글 비밀번호</label>
		<input type="password" name="boardPass" id="boardPass" /> <br />
		<a href="javascript:deleteForm.submit()">삭제</a>&nbsp;&nbsp;&nbsp;
		<a href="javascript:history.go(-1)">돌아가기</a>
		<br />
	</form>
<script>
 //여기에 jquery 코드 작성
</script>
</body>
</html>