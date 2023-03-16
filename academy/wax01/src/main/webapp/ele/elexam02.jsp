<%@page import="wax01VO.SampleVO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%
    String aa = request.getParameter("aa");
    String bb = request.getParameter("bb");
    String cc = request.getParameter("cc"); 
    SampleVO vo = new SampleVO(aa,bb,cc);
    // 데이터베이스에서 조회한 여러개의 자료 (EX : 서울에 사는 회원)
    List<SampleVO> list = new ArrayList<>();
    list.add(new SampleVO("서울강동구","bb","cc"));
    list.add(new SampleVO("서울강남구","qwert","yuip"));
    list.add(new SampleVO("서울강서구","asdfg","zxcv"));
    request.setAttribute("list", list);
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
<jsp:forward page = "proce.jsp"/> <!-- 자료를 proce.jsp에 넘겨준다 -->
<script>
 //여기에 jquery 코드 작성
</script>
</body>
</html>