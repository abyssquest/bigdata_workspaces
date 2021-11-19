<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 
	int sum = 0;

	for(int i=1; i <= 100; i++){
		sum += i;
	}
	
	System.out.println(sum);
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스크립트요소-스크립틀릿/표현식</title>
</head>
<body>
	<!-- HTML 주석문 -->
	
	
	<%-- JSP 주석문 --%>
	1부터 100까지의 합: <%= sum %><br>
	
	1부터 10까지의 합: <%= 1+2+3+4+5+6+7+8+9+10 %>
	
</body>
</html>







