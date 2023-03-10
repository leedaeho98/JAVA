<%@page import="java.util.Iterator"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="keywords" content="여기에 중요한 키워드 8개정도 나열" />
<meta name="description" content="이 페이지를 설명하는 키워드를 문장형식으로 나열" />
<title>헤더 정보 얻어오기</title>

</head>
<body>
<!-- 중요 -->
<h3>프로토콜 : <%= request.getProtocol() %></h3>
<h3>서버의 도메인 이름 : <%= request.getServerName() %></h3>
<h3>포트 번호 : <%= request.getLocalPort() %></h3>
<h3>요청 방식 : <%= request.getMethod() %></h3>
<h3>쿼리 스트링 : <%= request.getQueryString() %></h3> 
<h3>접속한 클라이언트의 ip주소 : <%= request.getRemoteAddr() %></h3> 
<h3>접속한 경로(ContextPath) : <%= request.getContextPath() %></h3> 
<h3>요청 URI : <%= request.getRequestURI() %></h3> 
<h3>요청 URL : <%= request.getRequestURL() %></h3> 
<h3>User-Agent헤더 값 : <%= request.getHeader("User-Agent") %></h3> 

<%
	String userAgentValue = request.getHeader("User-Agent");
	if (userAgentValue.toLowerCase().indexOf("window") != -1){
		out.println("<h1> 접속한 클라이언트의 운영체제는 윈도우를 사용하고 있습니다</h1>");
	}
%>

<h1>==============구분자	헤더 영역정보 알아보기 =============</h1>
<%
	Enumeration<String> headerNames=request.getHeaderNames();
	Iterator<String> iter = headerNames.asIterator();
	while (iter.hasNext()){
		String headName = iter.next(); // 이름을 얻어온다
		out.println("<h2>헤더명 => " + headName + ", 헤더값 =>"+request.getHeader(headName)+"</h2>");
	}
	
//	request.getIntHeader("헤더명"); request.getDateHeader("헤더명"); 
// Iterator => Iterator는 다음 내용이 있는지 확인하는 hasNext() 메서드와 
// 그 값을 가져오는 next() 메서드가 있습니다 또한 해당 컬렉션의 값을 삭제할 수 있는 remove() 메서드도 제공하게 됩니다.
%>


<script>
 //여기에 jquery 코드 작성
</script>
</body>
</html>