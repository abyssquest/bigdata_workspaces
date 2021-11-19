<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<% 
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 처리</title>
</head>
<body>
	
<%
	if(id.equals(pw)){
		session.setAttribute("AUTH", id);
		out.println("로그인 성공 <br><br>");
%>
		<form action="<%= request.getContextPath()%>/member/logout.jsp">
			<input type="submit" value="로그아웃">
		</form>

<%	
	}else{
%>	
		<script type="text/javascript">
			alert("로그인 실패");
			history.go(-1);
		</script>
<%
	}
%>
	
</body>
</html>







