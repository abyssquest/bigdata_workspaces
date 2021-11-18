<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl - forTokens 태그</title>
</head>
<body>

	콤마와 점을 구분자로 사용 : <br>
	
	<c:forTokens items="빨강색, 주황색, 노랑색, 초록색, 파란색, 남색, 보라색" 
				 delims="," var="token">
		${ token }<br>
	</c:forTokens>

</body>
</html>







