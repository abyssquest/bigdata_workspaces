<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>요청 파라메터 출력</title>
</head>
<body>

	이름(name) : <%= request.getParameter("name") %><br>
	주소(addr) : <%= request.getParameter("addr") %><br>
	
	좋아하는 동물 선택 내용:
	<%
		String[] values = request.getParameterValues("pet");
	
		if(values != null){
			for(int i=0; i < values.length; i++){
				//System.out.println(values[i]);
	%>
				<%= values[i] %>
	<%			
			}
		}
	%>
	
</body>
</html>










