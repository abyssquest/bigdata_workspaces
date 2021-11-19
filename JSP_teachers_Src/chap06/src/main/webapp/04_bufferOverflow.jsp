<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page buffer="1kb" %>
<%@ page errorPage="./errorPage/viewErrorMsg.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>버퍼 플러시 이후 예외 발생 결과</title>
</head>
<body>

	<%
		for(int i = 0; i < 256; i++){
			out.println(i);
		}
	%>
	
	<%= 1 / 0 %>

</body>
</html>







