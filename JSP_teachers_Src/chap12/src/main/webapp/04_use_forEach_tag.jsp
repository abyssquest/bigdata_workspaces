<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.HashMap"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
	HashMap<String, Object> mapData = new HashMap<String, Object>();
	mapData.put("name", "홍길동");
	mapData.put("today", new java.util.Date());
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl - forEach 태그</title>
</head>
<body>

	<h3>Map</h3>
	<c:set var="map" value="<%= mapData %>"/>
	<c:forEach var="i" items="${ map }">
		<%-- 맵(map) 값을 읽어와 i 변수에 담아 줌. --%>
		${ i.key } = ${ i.value }<br>
	</c:forEach>
	
	<h3>1부터 100까지의 홀수의 합</h3>
	<c:set var="sum" value="0"/>
	<c:forEach var="i" begin="1" end="100" step="2">
		<c:set var="sum" value="${ sum + i }"/>
	</c:forEach>
	
	결과 : ${ sum }<br>
	
	<h3>구구단 : 7단</h3>
	<ul>
		<c:forEach var="i" begin="1" end="9">
			<li>7 * ${ i } = ${ 7 * i }</li>
		</c:forEach>
	</ul>
	
	<h3>배열</h3>
	<c:set var="intArray" value="<%= new int[]{1, 2, 3, 4, 5} %>"/>
	<c:forEach var="i" items="${ intArray }" begin="2" end="4" 
					   								varStatus="status" step="1">
		${ status.index } : ${ status.count } : ${ i }<br>
	</c:forEach>

</body>
</html>









