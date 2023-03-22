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
<script>
	function replyboard(){
		document.boardForm.submit();
	}
</script>
</head>
<body>
<h1>${boardData.boardSubject}답변글 작성</h1>
<form action="${pageContext.request.contextPath}/BoardReplyAction.bo" name="boardForm" method = "post">
	<input type="text" name="boardNum"  hidden="hidden" value="${ boardData.boardNum}"/>
	<input type="text" name="boardReRef"  hidden="hidden" value="${boardData.boardReRef}"/>
	<input type="text" name="boardReLev"  hidden="hidden" value="${boardData.boardReLev}"/>
	<input type="text" name="boardReSeq"  hidden="hidden" value="${ boardData.boardReSeq}"/>
	
	<table>
		<tr>
			<th colspan="2">답변글쓰기</th>
		</tr>
		
		<tr>
			<td>글쓴이</td>
			<td><input type="text" name="boardName" /></td>
		</tr>
		
		<tr>
			<td>제목</td>
			<td><input type="text" name="boardSubject" value ="Re : ${boardData.boardSubject}"/></td>
		</tr>
		
		<tr>
			<td>내용</td>
			<td><textarea name="boardContent" id="" cols="60" rows="10"></textarea></td>
		</tr>
		
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="boardPass" /></td>
		</tr>
		<tr>
			<td colspan="2">
				<!-- 웹브라우저에 history.go(-1)은 뒤로가기 go(+1) 앞으로가기다  -->
				<a href="javascript:replyboard()">등록</a>&nbsp;&nbsp;
				<a href="javascript:history.go(-1)">뒤로가기</a>
			</td>
		</tr>
	</table>

</form>
<script>
 //여기에 jquery 코드 작성
</script>
</body>
</html>