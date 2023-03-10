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
<h1>각각의 영역에 저장된 속성 값 출력</h1>

<h3>page영역 만들어진 속성값 : <%=pageContext.getAttribute("pageAtt") %> </h3>
<h3>request영역 만들어진 속성값 : <%=request.getAttribute("requestAtt") %> </h3>
<h3>session영역 만들어진 속성값 : <%=session.getAttribute("sessionAtt") %> </h3>
<h3>application영역 만들어진 속성값 : <%=application.getAttribute("applicationAtt") %> </h3>


<script>
 //여기에 jquery 코드 작성
</script>
</body>
</html>