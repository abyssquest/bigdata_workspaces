<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 체크여부 판단</title>
</head>
<body>

<%
	boolean isCheck = false;
	Cookie[] cookies = request.getCookies();
	
	if(cookies != null){
		for(int i = 0; i < cookies.length; i++){
			if(cookies[i].getName().equals("AUTH")){
				isCheck = true;
			}
		}
	}
	
	if(isCheck){
		out.println("카페 홈 페이지 이동");
	}else{
		response.sendRedirect("loginForm.jsp");
	}
%>


</body>
</html>