<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 폼</title>
</head>
<body>

	<form action="02_processJoin.jsp" method="post">
		<table border="1" align="center" cellpadding="5" cellspacing="0">
			<tr>
				<th>아이디</th>
				<td><input type="text" name="id" size="20"/></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="password" size="20"/></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input type="text" name="name" size="20"/></td>
			</tr>
			<tr>
				<th>주소</th>
				<td><input type="text" name="address" size="20"/></td>
			</tr>
			<tr>
				<th>이메일</th>
				<td><input type="text" name="email" size="20"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="회원가입"/>
					<input type="reset" value="취소">
				</td>
			</tr>
		</table>
	</form>

</body>
</html>






