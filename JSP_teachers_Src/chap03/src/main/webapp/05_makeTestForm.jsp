<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>폼 생성</title>
</head>
<body>

	<h3>폼에 데이터를 입력한 후 '전송' 버튼을 클릭하세요.</h3>
	
	<form action="05_viewParameter.jsp">
		이름 : <input type="text" name="name"><br>
		주소 : <input type="text" name="addr"><br>
		좋아하는 동물 :
			<input type="checkbox" name="pet" value="강아지">강아지
			<input type="checkbox" name="pet" value="고양이">고양이
			<input type="checkbox" name="pet" value="햄스터">햄스터<br>
		<input type="submit" value="전송">
	</form>
	
</body>
</html>