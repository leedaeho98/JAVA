<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
<h1>나의 살던 고향은</h1>
<table>
	<tr>
		<th>아이디</th>
		<td id=id></td>
	</tr>
	<tr>
		<th>비밀번호</th>
		<td id=pwd></td>
	</tr>
	<tr>
		<th>이름</th>
		<td id=name> </td>
	</tr>
	<tr>
		<th>주소</th>
		<td id=address></td>
	</tr>
	<tr>
		<th>나이</th>
		<td id=age></td>
	</tr>
</table>
<button>정보 가져오기</button>
<script>
var objItem = ['id','아이디', 'password','비밀번호','name','이름','address','주소','age','나이'];
var target = $('table');
var innerHTML = '';
for(let i =0; i < objItem.length ; i=i+2){
	innerHTML = innerHTML + '<tr><th>' + objItem[i+1] + '</th><td id="' +objItem[i]+'"</td><tr><th><나이</th></tr>'
}
var target = $('table');
$('button').click(function(){
$.ajax({
    url: "http://127.0.0.1/conex/databind", // 클라이언트가 HTTP 요청을 보낼 서버의 URL 주소
    method: "GET",   
})
.done(function(json) {
	for(let i = 0 ; i < objItem.length ; i=i+1){
		$('#'+ objItem[i]).text(json[objItem[i] ]);	
	})

	/*$('#memId').text(json.id))/
	$('#memPwd').text(json.password))
	$('#memName').text(json.name))
	$('#memAddress').text(json.address))
	$('#memAge').text(json.age */

</script>
</body>
</html>