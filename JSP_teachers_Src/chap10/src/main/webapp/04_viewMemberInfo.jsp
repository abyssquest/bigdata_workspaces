<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 정보 조회</title>
</head>
<body>

	<%
		Enumeration<String> key = session.getAttributeNames();
	
		while(key.hasMoreElements()){
			String name = key.nextElement();
			out.println(name + " : " + session.getAttribute(name) + "<br>");
		}
	%>

</body>
</html>