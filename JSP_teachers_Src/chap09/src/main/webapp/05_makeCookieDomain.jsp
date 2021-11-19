<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	Cookie cookie1 = new Cookie("only", "onlycookie");
	response.addCookie(cookie1);
	
	Cookie cookie2 = new Cookie("id", "hong");
	cookie2.setDomain("somehost.com");
	response.addCookie(cookie2);
	
	Cookie cookie3 = new Cookie("invalid", "invalidcookie");
	cookie3.setDomain("javacan.sometest.com");
	response.addCookie(cookie3);

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 생성</title>
</head>
<body>
	생성 쿠기 정보:<br>
	
	<%= cookie1.getName() %> : <%= cookie1.getValue() %>
	[<%= cookie1.getDomain() %>]<br><br>
	
	<%= cookie2.getName() %> : <%= cookie2.getValue() %>
	[<%= cookie2.getDomain() %>]<br><br>
	
	<%= cookie3.getName() %> : <%= cookie3.getValue() %>
	[<%= cookie3.getDomain() %>]<br><br>

</body>
</html>





