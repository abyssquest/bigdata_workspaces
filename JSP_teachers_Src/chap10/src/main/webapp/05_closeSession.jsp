<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	session.invalidate(); /* 디폴트 세션 타임은 30분 */
	
	/* 세션 설정 - web.xml 참조 */
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 종료</title>
</head>
<body>

	세션을 종료하였습니다.

</body>
</html>