<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl - url 태그</title>
</head>
<body>

	<c:url var="searchUrl" value="https://www.youtube.com/results">
		<c:param name="search_query" value="코로나"/>
	</c:url>
	
	<ul>
		<li><a href="${ searchUrl }">${ searchUrl }</a></li>
		<li><c:url value="/02_use_if_tag.jsp"/></li>
		<li><c:url value="./02_use_if_tag.jsp"/></li>
	</ul>

</body>
</html>









