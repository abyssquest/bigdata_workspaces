<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>

<%
	String id = request.getParameter("memberId");
	if(id != ""){
		session.setAttribute("MEMBER", id);
	}
	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 처리 화면</title>
</head>
<body>

	로그인 처리 화면

</body>
</html>