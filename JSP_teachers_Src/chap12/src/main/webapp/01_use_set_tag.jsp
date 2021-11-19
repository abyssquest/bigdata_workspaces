<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Member" %>
<%@ page import="java.util.HashMap" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
	Member member = new Member();
	//request.setAttribute("coreMember", member);
	
	HashMap<String, String> pref = new HashMap<String, String>();
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl - set 태그</title>
</head>
<body>

	<c:set var="coreMember" value="<%= member %>" scope="request" />
	<c:set target="${ coreMember }" property="name" value="홍길동"/>
	회원 이름 : ${ coreMember.name }<br><br>

	<c:set var="pref" value="<%= pref %>"/><%-- pageContext.setAttribute("pref", pref) --%>
	<c:set var="favoriateColor" value="#{ pref.color }"/><%-- value="${ pref.color } --%>
	좋아하는 색 : ${ favoriateColor }<br>
	
	<c:set target="${ pref }" property="color" value="red"/>
	설정 이후 좋아하는 색 : ${ favoriateColor }<br>
	
	<c:remove var="coreMember" scope="request"/>
	회원 이름 : ${ coreMember.name }<br><br>
	
</body>
</html>









