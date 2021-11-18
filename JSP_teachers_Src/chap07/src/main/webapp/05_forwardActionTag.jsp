<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>옵션 선택 화면</title>
</head>
<body>

	<form action="05_selectView.jsp">
		보고 싶은 페이지 선택 :
		<select name="code">
			<option value="a">Cafe A 페이지</option>
			<option value="b">Cafe B 페이지</option>
			<option value="c">Cafe C 페이지</option>
		</select>
		<br><br>
		<input type="submit" value="페이지 선택">
	</form>

</body>
</html>