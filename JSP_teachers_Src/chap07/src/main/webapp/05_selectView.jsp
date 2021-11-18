<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String code = request.getParameter("code");
	String forwardPage = null;

	if(code.equals("a")){
		forwardPage = "/viewModule/cafe_a_page.jsp";
	}else if(code.equals("b")){
		forwardPage = "/viewModule/cafe_b_page.jsp";
	}else if(code.equals("c")){
		forwardPage = "/viewModule/cafe_c_page.jsp";
	}else{
		forwardPage = null;
	}
%>

<jsp:forward page="<%= forwardPage%>" />












