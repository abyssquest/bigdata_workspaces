<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl - catch 태그</title>
</head>
<body>

	<c:catch var="e">
		name 파라미터 값 = <%= request.getParameter("name") %><br>
		
		<%
			if(request.getParameter("name").equals("test")){
				out.println(request.getParameter("name"));
			}
		%>
	</c:catch>
	<p></p>
	<c:if test="${ e != null }">
		익셉션이 발생했습니다.<br>
		${ e }
	</c:if>

</body>
</html>








