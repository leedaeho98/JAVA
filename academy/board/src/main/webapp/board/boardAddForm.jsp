<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="keywords" content=" 여기에 중요한 키워드 8개정도 나열" />
<meta name="description" content="이페이지를 설명하는 키워드를 문장형식으로 나열" />
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
<h1>게시글 작성</h1>
<form action="${pageContext.request.contextPath}/BoardInsertAction.bo" method="post" enctype="multipart/form-data">
	<input type="text" name="boardName" placeholder="작성자 명" />	<br />
	<input type="password" name="boardPass" placeholder="비밀번호" />	<br />
	<input type="text" name="boardSubject" placeholder="게시글 제목" />	<br />
	<label for="boardContent">게시글 내용</label><br />
	<textarea name="boardContent" id="boardContent" cols="80" rows="10"></textarea>	<br />
	<input type="file" name="boardFile" placeholder="첨부파일" />	<br />
	<input type="submit" value="게시글 등록" />&nbsp;&nbsp;<input type="reset" value="입력 취소" />
</form>	
<script>
	//여기에 jquery 코드 작성
</script>
</body>
</html>