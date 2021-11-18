<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page errorPage="errorPage/viewErrorMsg.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파라메터 출력</title>
</head>
<body>

	<%
		String id = request.getParameter("id");
	%>

	아이디 : <%= id.toUpperCase() %>
</body>
</html>