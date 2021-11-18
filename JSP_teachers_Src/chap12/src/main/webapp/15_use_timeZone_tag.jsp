<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl - timeZone tag</title>
</head>
<body>

	<c:set var="now" value="<%= new java.util.Date() %>"/>

	<fmt:formatDate value="${ now }" type="both" 
					dateStyle="full" timeStyle="full"/>
					
	<br>
	
	<%-- 한국 시간 -> Los_Angeles 시간으로 계산 후 출력 --%>
	<fmt:timeZone value="America/Los_Angeles">
		<fmt:formatDate value="${ now }" type="both"
							dateStyle="full" timeStyle="full"/><br>
	</fmt:timeZone>
	
	<c:forEach var="id" items="<%= java.util.TimeZone.getAvailableIDs() %>">
		${ id }<br>
	</c:forEach>
	
</body>
</html>











