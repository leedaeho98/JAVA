<%@page import="com.leedaeho.webexam01.vo.DataVO"%>
<%@page import="java.util.List"%>
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
<h2>포워딩된 페이지 입니다</h2>
<% List<DataVO> requestAtt = ( List<DataVO> )request.getAttribute("requestAtt");%>
<h3>request영역 만들어진 속성값의 List자료에 대한 각각의 데이터 :  : <%=requestAtt.get(1)%> </h3>
<h3>request영역 만들어진 속성값의 List자료에 대한 각각의 데이터1 age 필드 값 :  : <%=requestAtt.get(1).getAge() %> </h3>
<h3>request영역 만들어진 속성값의 List자료에 대한 각각의 데이터1 iname 필드 값 :  : <%=requestAtt.get(1).getIname() %> </h3>
<h3>request영역 만들어진 속성값의 List자료에 대한 각각의 데이터1 gender 필드 값 :  : <%=requestAtt.get(1).getGender() %> </h3>
<h3>request영역 만들어진 속성값의 List자료에 대한 각각의 데이터1 address 필드 값 :  : <%=requestAtt.get(1).getAddress() %> </h3>
<h3>session영역 만들어진 속성값 : <%=session.getAttribute("sessionAtt") %> </h3>
<h3>application영역 만들어진 속성값 : <%=application.getAttribute("applicationAtt") %> </h3>

<script>
 //여기에 jquery 코드 작성
</script>
</body>
</html>