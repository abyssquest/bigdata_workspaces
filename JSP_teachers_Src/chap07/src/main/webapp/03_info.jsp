<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Info</title>
</head>
<body>
	<table width="100%" border="1" cellpadding="0" cellspacing="0">
		<tr>
			<th>제품번호</th><td>XXXX</td>
		</tr>
		<tr>
			<th>가격</th><td>10,000원</td>
		</tr>
	</table>
	
	<jsp:include page="03_infoSub.jsp">
		<jsp:param name="type" value="A" />
	</jsp:include>
	
	<h3>수행 끝.</h3>
	
</body>
</html>








