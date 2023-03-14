<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
    
<%
//	String id = request.getParameter("id"); // 넘어온 자료의 개수만큼
	
//	MemberInfoBEan bean = new MemberInfoBean();
//	bean setid(id);
%>

 <!-- 자바 빈 -->
<jsp:useBean id="member" class="web01.MemberInfoBean"/>
<jsp:setProperty name="member" property="*" />

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<meta name="keywords" content="여기에 중요한 키워드 8개정도 나열" />
<meta name="description" content="이 페이지를 설명하는 키워드를 문장형식으로 나열" />
<title>Insert title here</title>

</head>
<body>
<%= member.getId()  %>의 자료를 넘겨받았습니다...<br />
<jsp:getProperty property="id" name="member" />의 자료를 넘겨받았습니다 - 태그를 통해 가져온 자료 출력 <br />
<%= member.toString() %>의 자료를 넘겨받았습니다... <br />
등록일 : <%= member.getRegisterDate() %>의 자료를 넘겨받았습니다... <br />

<script>
 //여기에 jquery 코드 작성
</script>
</body>
</html>