<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.HashSet"%>
<%@page import="java.util.Set"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
<<<<<<< HEAD
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>

=======
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
    
>>>>>>> 42fbd3930dc7f7ba01f43beef42f786d7a169648
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<<<<<<< HEAD
<meta name="keywords" content=" 여기에 중요한 키워드 8개정도 나열" />
<meta name="description" content="이페이지를 설명하는 키워드를 문장형식으로 나열" />
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
<%
	// 쿠키 이름은 spviewlist, 쿠키값으로는 0001저장하고자 한다.
// 쿠키자체가 있는지 따진다. O : 
			// spviewlist쿠키명이 기존에 존재하는지 1) O : 기존에 추가, X : 새로만들어서 0001을 할당
// 쿠키자체가 있는지 따진다. X :	
	// 새로만들어서 0001을 할당
	Cookie[] cookies = request.getCookies();
	if( cookies != null){  // 쿠키자체가 있는지 따진다. O : 
		boolean isspviewlist = false;
		Cookie getCookie = null;
		for(Cookie cok : cookies){
			System.out.println("==");
		}
		System.out.println("====================================sjfkdsljfkdslafjdsklaf");
		for(int i = 0; i < cookies.length; i++){
			System.out.println("==" + cookies[i].getName() + ",####" + cookies[i].getValue() );
			isspviewlist = cookies[i].getName().equals("spviewlist");
			if(isspviewlist ){
=======
<meta name="keywords" content="여기에 중요한 키워드 8개정도 나열" />
<meta name="description" content="이 페이지를 설명하는 키워드를 문장형식으로 나열" />
<title>Insert title here</title>

</head>
<body>
<%
// 쿠키 이름은 spviewlist, 쿠키값으로는 0001저장하고자 한다.
// 쿠키자체가 있는지 따진다. O : 
	// spviewlist 쿠키명이 기존에 존재하는지 1) O(존재) : 기존에 추가 , X(없음) : 새로만들어서 0001을 할당
// 쿠키자체가 있는지 따진다. X :
	//새로 만들어서 0001을 할당한다
	Cookie[] cookies = request.getCookies();
	Map<String, Integer> resultlist = new HashMap<>();
	
	if (cookies != null){ // 쿠키자체가 있는지 따진다. 0:
		boolean isspviewlist = false;
		Cookie getCookie = null;
		for (int i = 0 ; i < cookies.length ; i++){
			isspviewlist = cookies[i].getName().equals("spviewlist");
			isspviewlist = true;
			if ( isspviewlist){ // isspviewlist => true가 되면 빠져나온다
>>>>>>> 42fbd3930dc7f7ba01f43beef42f786d7a169648
				getCookie = cookies[i];
				break;
			}
		}
<<<<<<< HEAD

		if( isspviewlist ){
			String[] spcodes = getCookie.getValue().split("/");
			Set<String> viCodeSet = new HashSet<>();
			for(String spcode : spcodes){
				viCodeSet.add(spcode);
			}
			Iterator<String> iter = viCodeSet.iterator();
			Map<String, Integer> resultList = new HashMap<>();
			while( iter.hasNext()){
				String code = iter.next();
				int codeCnt = 0;
				for(String spcode : spcodes){
					if( code.equals(spcode) ){
						codeCnt = codeCnt+1;
					}
				}
				resultList.put(code, codeCnt);
			}
			
			out.print("<li> 0001상품의 개수 : " + resultList.get("0001")+ "</li>");
			out.print("<li> 0002상품의 개수 : " + resultList.get("0002")+ "</li>");
			
		}else{
			out.print("<p>쿠키는 존재하지만 상품조회 내역이 없습니다..</p>");
		}
	}else{ //쿠키자체가 있는지 따진다. X :	
		out.print("<p>쿠키가 존재하지 않습니다.</p>");
	}
%>	
	<a href="./sp/sang.jsp">상품보기</a>
<script>
	//여기에 jquery 코드 작성
=======
		if( isspviewlist ){
			String[] spcodes = getCookie.getValue().split("/"); // 슬래쉬를 기준으로 나눠라
			Set<String> viCodeSet = new HashSet<>(); // 중복을 없앤다
			for (String spcode : spcodes){
				viCodeSet.add(spcode);
			}
			Iterator<String> iter = viCodeSet.iterator();
			
			
			while(iter.hasNext()){
				String code = iter.next();
				int codeCnt = 0;
				for (String spcode : spcodes){
					if( code.equals(spcode)){
						codeCnt = codeCnt+1;
					}
				}
				resultlist.put(code, codeCnt);
			}
			out.print("<li> 0001상품의 개수 : " + resultlist.get("0001") + "</li>");
			out.print("<li> 0002상품의 개수 : " + resultlist.get("0002") + "</li>");
		}else{
			out.print("<p>쿠키는 존재하지만 상품조회 내역이 없습니다 </p>");
		}
		
	}else{ // 쿠키자체가 있는지 따진다. X :
		out.print("<p>쿠키가 존재하지 않습니다</p>");
	}

%>
	<a href="./sp/sang.jsp">상품보기</a>
<script>
 //여기에 jquery 코드 작성
>>>>>>> 42fbd3930dc7f7ba01f43beef42f786d7a169648
</script>
</body>
</html>