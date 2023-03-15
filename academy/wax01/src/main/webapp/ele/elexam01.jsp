<%@page import="javax.print.attribute.standard.Severity"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%
	String uriData = request.getRequestURI(); //전체 경로를 가져옵니다. 
	System.out.println(uriData);
	ServletRequest requestObj = pageContext.getRequest();
	requestObj.getParameter("address");
	
	request.setAttribute("irum","leedaeho test");
	pageContext.setAttribute("irum", "Honggildong");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="keywords" content="여기에 중요한 키워드 8개정도 나열" />
<meta name="description" content="이 페이지를 설명하는 키워드를 문장형식으로 나열" />
<title>Insert title here</title>

</head>
<body>
넘겨받은 자료 : ${  param.address } <br />
요청한 URI :  ${  pageContext.request.requestURI } <br />
요청 URI : ${ requestScope.getRequestURI } ==== <br />
<%= request.getAttribute("irum")  %> <br />
${ requestScope.irum } <br />
${irum }!!!!!!!!!!! <br />

<p>내장객체의 메서드 값을 얻기 위해서는 표현 언어는 직접 접근이 불가능하다</p>
<p>PageContext객체를 이용해서 해당 내장객체를 얻고 그 얻어진 결과를 이용해서 접근(호출)</p>
<p>내장객체의 메서드가 get으로 시작할 경우 get을 생략하고 첫 글자를 소문자로 한다</p>
<script>
 //여기에 jquery 코드 작성
</script>
</body>
</html>