<%@page import="java.util.Iterator"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.Map"%>
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
<%--
<%
	Map<String,String[]> paramMap = request.getParameterMap(); // 반환되는 타입 Map
	Iterator<String> iter = paramMap.keySet().iterator();
	/* Set<String> paramNameSet = paramMap.keySet(); 
	Iterator<String> iter = paramNameSet.iterator();*/
	while (iter.hasNext()){
		String paraName = iter.next();
		out.print("<h3> 파라매터 이름 : " + paraName + "</h3>");
		for (int i = 0 ; i < paramMap.get(paraName).length ; i++){
		out.print("<p> 파라매터 값 : " + paramMap.get(paraName) [i]+ "</p>");
		}
	}
%>
--%>

<%
	Map<String,String[]> paramMap = request.getParameterMap(); // 반환되는 타입 Map
	Iterator<String> iter = paramMap.keySet().iterator();
	/* Set<String> paramNameSet = paramMap.keySet(); 
	Iterator<String> iter = paramNameSet.iterator();*/
	while (iter.hasNext()){
		String paraName = iter.next(); %>
		<h3> 파라매터 이름 :   <%= paraName %>  </h3>
<%		for (int i = 0 ; i < paramMap.get(paraName).length ; i++){ %>
		<p> 파라매터 값 : <%= paramMap.get(paraName)[i] %>  </p>
<% 		}
	}
%>
<script>
 //여기에 jquery 코드 작성
</script>
</body>
</html>