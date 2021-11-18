<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body>

	<h1>홍길동이 만든 페이지(jsp)입니다.</h1>
	
	<%
		int sum = 0;
		
		for(int i=0; i <= 10; i++){
			sum += i;
		}
	%>
	
	<%= sum %>

</body>
</html>