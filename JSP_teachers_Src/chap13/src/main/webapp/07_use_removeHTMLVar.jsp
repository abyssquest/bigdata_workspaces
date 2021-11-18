<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tf" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>removeHTMLVar</title>
</head>
<body>

	<c:set var="dateEL" value="<%= new java.util.Date() %>"/>
	
	<tf:removeHTMLVar trim="true" var="removed">
		<font size="10">현재 시간은 ${ dateEL }입니다.</font>
	</tf:removeHTMLVar>

	처리 결과 : ${ removed }
</body>
</html>





