<%@page import="com.yangdoll.board.vo.BoardVO"%>
<%@page import="java.util.List"%>
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

<c:if test="${requestScope.list.size() == 0 }"> 
	<h1>게시글이 존재하지 않습니다.!!!</h1>
</c:if>

<c:if test="${requestScope.list.size() != 0 }"> 
	<h1>게시글이 존재합니다.!!!</h1>
	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>조회수</th>
			<th>비고</th>
		</tr>
		  <c:forEach items="${list}" var="vo">
	      <tr>
	      	<td>${vo.boardNum}</td>
	      	<td><a href="./BoardDetailAction.bo?boardNum=${vo.boardNum}">${vo.boardSubject}</a></td>
	      	<td>${vo.boardName}</td>
	      	<td>${vo.boardReadCount}</td>
	      	<td>${vo.boardContent}</td>
	      </tr>
		  </c:forEach>
	</table>
</c:if>	

	<a href="${pageContext.request.contextPath}/index.jsp">홈</a> <br />
	<a href="./BoardWrite.bo">새로운게시판글쓰기</a> <br />
	
	<hr />
	<p>
	<c:forEach begin="${beginPage}" end = "${endPage}" step="1" varStatus="status" >
		<c:choose>
			<c:when test= "${status.index==page}">
				${status.index}&nbsp;&nbsp;			
			</c:when>
			<c:otherwise>
				<a href="./BoardList.bo?page=${status.index }">${status.index }</a>&nbsp;&nbsp;
			</c:otherwise>
		</c:choose>
	</c:forEach>

	</p>
<script>
	//여기에 jquery 코드 작성
</script>
</body>
</html>