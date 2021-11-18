<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ page isELIgnored="true"%> --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL Object</title>
</head>
<body>

<%-- 표현 언어(산술 연산) --%>
	\${ 10 + 2 } = ${ 10 + 2 }<br> <%-- <%= 10 + 2 %> --%>
	\${ 10 - 2 } = ${ 10 - 2 }<br>
	\${ 10 * 2 } = ${ 10 * 2 }<br><br>
	
	\${ 10 / 2 } = ${ 10 / 2 }<br>
	\${ 10 div 2 } = ${ 10 div 2 }<br><br>
	
	\${ 10 % 3 } = ${ 10 % 3 }<br>
	\${ 10 mod 3 } = ${ 10 mod 3 }<br><br>
	
	
<%-- 표현 언어(비교 연산) --%>
	\${ 10 > 2 } = ${ 10 > 2 }<br>
	\${ 10 gt 2 } = ${ 10 gt 2 }<br><br>
	
	\${ 10 >= 2 } = ${ 10 >= 2 }<br><br>
	
	\${ 10 < 2 } = ${ 10 < 2 }<br>
	\${ 10 lt 2 } = ${ 10 lt 2 }<br><br>
	
	\${ 10 <= 2 } = ${ 10 <= 2 }<br><br>
	
	\${ 10 == 2 } = ${ 10 == 2 }<br>
	\${ 10 eq 2 } = ${ 10 eq 2 }<br><br>
	
	\${ 10 != 2 } = ${ 10 != 2 }<br>
	
	\${ empty("") } = ${ empty("") }<br><br>


<%-- 주의 --%>
	\${ "2" + 5 } = ${ "2" + 5 }<br>
	\${ "2" * 5 } = ${ "2" * 5 }<br>
	\${ 10 + null } = ${ 10 + null }<br>

<%-- error
	\${ "일" + 5 } = ${ "일" + 5 }<br>
--%>

<%-- error
	\${ "더조은 " + "IT 아카데미" } = ${ "더조은 " + "IT 아카데미" }<br>
--%>

<%-- 문자열 연결(EL 3.0(JSP2.3 -> tomcat 8.5) 추가) : += --%>
	\${ "문자" += "열" += " 연결" } = ${ "문자" += "열" += " 연결" }<br>


<%-- 표현 언어(논리 연산) --%>
	\${ (2 > 5) && (5 != 4) } = ${ (2 > 5) && (5 != 4) }<br>
	\${ (2 > 5) and (5 != 4) } = ${ (2 > 5) and (5 != 4) }<br>
	
	\${ (2 > 5) || (5 != 4) } = ${ (2 > 5) || (5 != 4) }<br>
	\${ (2 > 5) or (5 != 4) } = ${ (2 > 5) or (5 != 4) }<br>
	
	\${ !(5 != 4) } = ${ !(5 != 4) }<br>
	\${ not(5 != 4) } = ${ not(5 != 4) }<br>


	<%
		request.setAttribute("name", "홍길동");
		pageContext.setAttribute("name", "강감찬");
	%>
	
	<%= request.getAttribute("name") %><br>
	\${ name } = ${ name }<br><br>
	
	요청 URI(표현식) : 
	<%= ((HttpServletRequest)pageContext.getRequest()).getRequestURI() %><br>
	
	요청 URI(EL) : ${ pageContext.request.requestURI }<br>
	
	request의 name 속성 : ${ requestScope.name }<br>
	
	code 파라미터(스크립트) : <%= request.getParameter("code") %><br>
	code 파라미터(EL) : ${ param.code }<br>
	
</body>
</html>








