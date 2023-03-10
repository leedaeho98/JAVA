<%@page import="java.util.ArrayList"%>
<%@page import="com.leedaeho.webexam01.vo.DataVO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="keywords" content="여기에 중요한 키워드 8개정도 나열" />
<meta name="description" content="이 페이지를 설명하는 키워드를 문장형식으로 나열" />
<title>Insert title here</title>

</head>
<body>
<h1>여기에서 4개의 영역에 속성을 만듭니다</h1>
<%
	List<DataVO> list = new ArrayList<DataVO>();
	list.add(new DataVO(120,"aa","aaa","aaaa"));
	list.add(new DataVO(130,"bbbbb","bbbb","bbb"));
	list.add(new DataVO(150,"asdfg","qwert","yuiop"));
	pageContext.setAttribute("pageAtt", "페이지영역에 만들어진 속성값");
	request.setAttribute("requestAtt", list);
	session.setAttribute("sessionAtt", new Date());
	application.setAttribute("applicationAtt", "application영역에 만들어진 속성값");
%>
<jsp:forward page = "./to.jsp"></jsp:forward>
<h3>요청페이지!!!! page영역 만들어진 속성값 : <%=pageContext.getAttribute("pageAtt") %> </h3>
<h3>요청페이지!!!! request영역 만들어진 속성값 : <%=request.getAttribute("requestAtt") %> </h3>
<h3>요청페이지!!!! session영역 만들어진 속성값 : <%=session.getAttribute("sessionAtt") %> </h3>
<h3>요청페이지!!!! application영역 만들어진 속성값 : <%=application.getAttribute("applicationAtt") %> </h3>

<script>
 //여기에 jquery 코드 작성
</script>
</body>
</html>