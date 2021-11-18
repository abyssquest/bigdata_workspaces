<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 화면</title>
</head>
<body>

	<form action="<%= request.getContextPath()%>/loginProcess.jsp" method="post">
		아 이 디 : <input type="text" name="memberId" size="20"><br>
		비밀번호 : <input type="password" name="memberPw" size="20"><br>
		<input type="submit" value="로그인">
	</form>

</body>
</html>





