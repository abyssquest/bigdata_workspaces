<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl - if tag</title>
</head>
<body>

	<c:if test="true">
		무조건 실행<br>
	</c:if>
	
	<c:if test="${ param.id == 'hong' }"> <%-- <%= request.getParameter("id") %> --%>
		환영합니다, ${ param.id }님.<br>
	</c:if>
	
	<c:if test="${ 18 < param.age }">
		당신의 나이는 18세 이상입니다.
	</c:if>

</body>
</html>







