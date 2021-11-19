<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 체크여부 판단</title>
</head>
<body>

<%
	String checkIn = (String)session.getAttribute("AUTH");
	
	if(checkIn != null){
		out.println("카페 홈 페이지 이동");
	}else{
		response.sendRedirect("loginForm.jsp");
	}
%>


</body>
</html>