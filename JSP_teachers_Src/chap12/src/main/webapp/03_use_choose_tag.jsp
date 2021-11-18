<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl - choose 태그</title>
</head>
<body>

	<c:choose>
		<c:when test="${ param.id == 'hong' }">
			<li>당신의 아이디는 ${ param.id }입니다.</li>
		</c:when>
		<c:when test="${ param.age > 20 }">
			<li>당신의 나이는 ${ param.age }입니다.</li>
		</c:when>
		<c:otherwise>
			<li>당신은 hong도 아니고, 20세 이하군요.</li>
		</c:otherwise>
	</c:choose>

</body>
</html>









