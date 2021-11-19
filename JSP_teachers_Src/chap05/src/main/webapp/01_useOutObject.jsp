<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Out 객체</title>
</head>
<body>

	<%
		int sum = 0;
		for(int i = 1; i <= 100; i++){
			sum += i;
		}
		
		out.println("1~100까지의 합 : " + sum + "<br>");

		sum = 0;
		for(int i = 1; i <= 1000; i++){
			if(i % 2 == 0){
				sum += i;
			}
		}
		
		out.println("1~1000까지의 짝수 합 : " + sum + "<br>");
	%>

</body>
</html>






