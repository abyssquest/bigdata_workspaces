<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% request.setCharacterEncoding("UTF-8"); %>

<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String msg = "";
	
	//request.setAttribute("id", id);
	//request.setAttribute("pw", pw);
	
	//session.setAttribute("id", id);
	//session.setAttribute("pw", pw);
	
	application.setAttribute("id", id);
	application.setAttribute("pw", pw);
	
	if(id.equals(pw)){
		msg = "로그인 성공 : ";
	}else{
		msg = "로그인 실패 : ";
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 처리 화면</title>
</head>
<body>

	<%
		//String readId = (String)request.getAttribute("id");
		//String readPw = (String)request.getAttribute("pw");
		
		//String readId = (String)session.getAttribute("id");
		//String readPw = (String)session.getAttribute("pw");
		
		String readId = (String)application.getAttribute("id");
		String readPw = (String)application.getAttribute("pw");
	%>
	
	처리결과 : <%= msg + "아이디-> " + readId + ", 비밀번호-> " + readPw %>
</body>
</html>






