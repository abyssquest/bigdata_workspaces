<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Web Page</title>
</head>
<body>

	<table border="1" width="1280" cellpadding="0" cellspacing="0">
		<tr>
			<td colspan="2">
				<jsp:include page="./module/header.jsp"></jsp:include>
			</td>
		</tr>
		<tr height="960">
			<td width="400" valign="top">
				<jsp:include page="./module/subMenu.jsp"></jsp:include>
			</td>
			<td valign="top">
				Contents<br><br><br><br>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<jsp:include page="./module/footer.jsp"></jsp:include>
			</td>
		</tr>
	</table>

</body>
</html>