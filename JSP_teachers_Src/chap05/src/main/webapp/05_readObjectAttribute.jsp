<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영역 데이터 읽어오기</title>
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
	
	처리결과 : <%= "아이디-> " + readId + ", 비밀번호-> " + readPw %>

</body>
</html>