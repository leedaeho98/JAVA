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
			<th>내용</th>
		</tr>
		  <c:forEach items="${list}" var="vo">
	      <tr>
	      	<td>${vo.boardNum }</td>
	      	<td>${vo.boardName }</td>
	      	<td>${vo.boardPass }</td>
	      	<td>${vo.boardSubject }</td>
	      	<td>${vo.boardContent }</td>
	      </tr>
		  </c:forEach>
	</table>
</c:if>	

<script>
	//여기에 jquery 코드 작성
</script>
</body>
</html>