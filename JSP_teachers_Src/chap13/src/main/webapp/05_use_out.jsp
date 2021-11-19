<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tf" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>out 태그 사용</title>
</head>
<body>

	<tf:out>
		<u>현재 시간</u>은 <b>${ dateEL }</b>입니다.
	</tf:out>
	<br>
	
	<c:set var="dateEL" value="<%= new java.util.Date() %>"/>
	
	<tf:out>
		<%-- <u>현재 시간</u>은 <b>${ dateEL }</b>입니다. --%>
		<%= new java.util.Date() %><u>현재 시간</u>은 <b>${ dateEL }</b>입니다.
	</tf:out>


</body>
</html>





