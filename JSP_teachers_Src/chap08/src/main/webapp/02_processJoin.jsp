<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="member.MemberInfo" %>

<%
	request.setCharacterEncoding("UTF-8");
%>

<%-- 
<%
	MemberInfo memInfo = new MemberInfo();

	/*
	String id = request.getParameter("id");
	String pw = request.getParameter("password");
	String name = request.getParameter("name");
	String addr = request.getParameter("address");
	String email = request.getParameter("email");
	
	memInfo.setId(id);
	memInfo.setPassword(pw);
	memInfo.setName(name);
	memInfo.setAddress(addr);
	memInfo.setEmail(email);
	*/
	
	memInfo.setId(request.getParameter("id"));
	memInfo.setPassword(request.getParameter("password"));
	memInfo.setName(request.getParameter("name"));
	memInfo.setAddress(request.getParameter("address"));
	memInfo.setEmail(request.getParameter("email"));
	
	request.setAttribute("member", memInfo);
%> 
--%>

<jsp:useBean id="memInfo" class="member.MemberInfo" scope="request"/>
<%-- 
<jsp:setProperty name="memInfo" property="id" param="id"/>
<jsp:setProperty name="memInfo" property="password" param="password"/>
<jsp:setProperty name="memInfo" property="name" param="name"/>
<jsp:setProperty name="memInfo" property="address" param="address"/>
<jsp:setProperty name="memInfo" property="email" param="email"/>
 --%>
 
<jsp:setProperty name="memInfo" property="*" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 처리</title>
</head>
<body>

<%
	String forwardPage = null;
	String id = memInfo.getId();
	
	if(id.equals("admin")){
		forwardPage = "adminPage.jsp";
	}else{
		forwardPage = "memberPage.jsp";
	}
%>

	<jsp:forward page="<%= forwardPage %>" />
	
</body>
</html>





