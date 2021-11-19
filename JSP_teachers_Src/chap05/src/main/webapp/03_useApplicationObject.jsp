<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.Enumeration" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>application 파라미터 초기화 정보 읽기</title>
</head>
<body>

	초기화 파라미터 목록 : 
	<ul>
	<%
		Enumeration<String> initParam = application.getInitParameterNames();
	
		while(initParam.hasMoreElements()){
			String initParamName = initParam.nextElement();
			
			out.write("<li>" + initParamName + " : ");
			out.write(application.getInitParameter(initParamName)+"</li>");
		}
	%>
	</ul>
	
</body>
</html>



