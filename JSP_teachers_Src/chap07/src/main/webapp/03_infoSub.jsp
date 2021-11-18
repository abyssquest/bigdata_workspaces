<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
	String type = request.getParameter("type");

	if(type != null){
		out.println("타입 : " + type + "<br>");
		
		if(type.equals("A")){
			out.println("특징 : 강한 내구성..." + "<br>");
		}else if(type.equals("B")){
			out.println("특징 : 강한 불연성..." + "<br>");
		}
	}
%>