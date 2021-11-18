<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl - 함수 사용</title>
</head>
<body>

	<c:set var="str" value="Functions<a></a>를 사용합니다."/>
	
	length(str) = ${ fn:length(str) }<br>
	toUpperCase(str) = ${ fn:toUpperCase(str) }<br>
	
	escapeXml(str) = ${ fn:escapeXml(str) }

</body>
</html>






