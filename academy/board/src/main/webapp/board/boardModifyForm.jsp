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
	function modifyBoard(){
		document.modifyForm.submit();
	}
</script>

</head>
<body>
<form action="${pageContext.request.contextPath}/BoardModifyAction.bo" name="modifyForm" method="post">  
	<input type="text" hidden = "hidden"  name= "boardNum" value="${vo.boardNum}">
	<table>
		<tr>
			<td colspan="2">게시글 수정</td>
		</tr>
		<tr>
			<td>제목</td>
			<td><input type="text" name="boardSubject"  value="${vo.boardSubject}"></td>
		</tr>
		<tr>
			<td>내용</td>
			<td>
			<textarea name="boardContent" cols="60" rows="10">${vo.boardContent}
			</textarea>
			</td>
		</tr>
	<c:if test="${!(vo.boardFile!=null || vo.boardFile=='')}">
		<tr>
			<td>파일첨부</td>
			<td><input type="text" name="boardFile" value="${vo.getBoardFile()}"></td>
		</tr>
	</c:if>
		<tr>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="boardPass" />	</td>
		</tr>
		<tr>
			<td colspan="2">
			<a href="javascript:modifyBoard()">수정</a>&nbsp;&nbsp;<a href="javascript:history.go(-1)">뒤로</a>
			</td>
			<td></td>
		</tr>
	</table>
</form>
<script>
 //여기에 jquery 코드 작성
</script>
</body>
</html>