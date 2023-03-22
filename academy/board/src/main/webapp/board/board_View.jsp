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
	<table>
		<tr>
			<td colspan="2">MVC 게시판 글 상세보기</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${vo.boardSubject}</td>
		</tr>
		<tr>
			<th>내용</th>
			<td><textarea cols = "60" rows="10" values="" readonly="readonly" name="" id="" cols="30" rows="10">${vo.boardContent}</textarea></td>
		</tr>
		<tr>
			<th>파일</th>
			<td>
				<c:if test="${vo.boardFile !=  null}">
					<a href="./fileupload/${vo.boardFile}">${vo.boardFile}</a>
				</c:if>
			</td>
		</tr>
		<tr>
			<th>조회수</th>
			<td>${vo.boardReadCount}</td>
		</tr>
		<tr>
			<td colspan="2">
				<a href="./BoardReplyView.bo?boardNum=${vo.boardNum}">답변글</a>&nbsp;&nbsp;&nbsp;
				<a href="./BoardModify.bo?boardNum=${vo.boardNum}">수정</a>&nbsp;&nbsp;&nbsp;
				<a href="./BoardDelete.bo?boardNum=${vo.boardNum}">삭제</a>&nbsp;&nbsp;&nbsp;
				<a href="./BoardList.bo">게시글목록보기</a>
			</td>
		</tr>
	</table>
<script>
 //여기에 jquery 코드 작성
</script>
</body>
</html>