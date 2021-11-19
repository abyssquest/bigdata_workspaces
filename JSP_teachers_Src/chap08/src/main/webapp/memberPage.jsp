<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="member.MemberInfo" %>

<%-- 
<%
	MemberInfo info = (MemberInfo)request.getAttribute("memInfo");
%>
 --%>
<jsp:useBean id="memInfo" class="member.MemberInfo" scope="request" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 페이지</title>
</head>
<body>

	<h1>회원 정보</h1>
	
<%-- 
	아이디 : <%= info.getId() %><br>
	비밀번호 : <%= info.getPassword() %><br>
	이름 : <%= info.getName() %><br>
	주소 : <%= info.getAddress() %><br>
	이메일 : <%= info.getEmail() %><br>
 --%>	
 
	아이디 : <jsp:getProperty name="memInfo" property="id" /><br>
	비밀번호 : <jsp:getProperty name="memInfo" property="password" /><br>
	이름 : <jsp:getProperty name="memInfo" property="name" /><br>
	주소 : <jsp:getProperty name="memInfo" property="address" /><br>
	이메일 : <jsp:getProperty name="memInfo" property="email" /><br>
	
</body>
</html>