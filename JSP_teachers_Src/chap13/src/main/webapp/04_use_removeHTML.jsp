<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tf" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>removeHTML</title>
</head>
<body>

	<c:set var="dateEL" value="<%= new java.util.Date() %>"/>
	
	<tf:removeHTML trim="true">
		<font size="10" width="10">현재 시간은 <b>${ dateEL }</b>입니다.</font>
	</tf:removeHTML>
	
	<br><br>
	
	<tf:removeHTML trim="true" length="15" trail="...">
		<u>현재 시간</u>은 <b>${ dateEL }</b>입니다.</font>
	</tf:removeHTML>

</body>
</html>







