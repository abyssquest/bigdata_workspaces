<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String resourcePath = "/images/abcd.jpg";
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>application 기본 객체</title>
</head>
<body>

	<%= application.getRealPath(resourcePath) %>

</body>
</html>







