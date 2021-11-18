<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%!
	public int multiply(int a, int b){
		int result = a * b;
		return result;
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스크립트요소-선언부</title>
</head>
<body>

	10 * 25 = <%= multiply(10, 25) %>

</body>
</html>




