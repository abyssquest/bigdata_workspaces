<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
	String id = request.getParameter("userid");
	String pw = request.getParameter("userpw");
	
	if(id.equals(pw)){
		System.out.println("로그인 성공.");
%>	
		안녕하세요. <%= id%>
<% 
	}else{
		out.println("로그인 실패.");
	}
%>