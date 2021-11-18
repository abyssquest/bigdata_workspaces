<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="Cache-Control" content="no-cache"/> 
<meta http-equiv="Expires" content="0"/> 
<meta http-equiv="Pragma" content="no-cache"/> 

<title>Insert title here</title>
</head>
<body>
<%
String id=(String)session.getAttribute("id");
System.out.println(id);
if(id==null){
	response.sendRedirect("/ShoppingMall/MemberLogin.me");
}
else{
%>
<a href="/ShoppingMall/MemberModifyAction_1.me">회원정보수정</a>
<%
}
%>
</body>
</html>
