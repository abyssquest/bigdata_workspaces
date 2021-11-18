<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% request.setCharacterEncoding("UTF-8"); %>
    
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String msg = "";
	
	//System.out.println(id);
	//System.out.println(pw);
	
	if(id.equals(pw)){
		msg = "로그인 성공";
		
		response.sendRedirect("08_cafeMainPage.jsp");
		
	}else{
		msg = "로그인 실패 : " + id + ", " + pw;
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 처리 화면</title>
</head>
<body>
	
	처리 결과 : <%= msg %>

</body>
</html>