<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl - out tag</title>
</head>
<body>

	<%
		FileReader reader = null;
	
		try {
			String path = request.getParameter("path");
			System.out.println(application.getRealPath(""));
			System.out.println(application.getRealPath(path));
			reader = new FileReader(application.getRealPath(path));
	%>
<pre>
* 소스코드 = <%= path %>

<c:out value="<%= reader %>" escapeXml="false"/>
</pre>
	<%
		}catch(IOException e){
			out.println(e.getMessage());
		}finally{
			if(reader != null){
				try {
					reader.close();
				}catch(IOException e){
					out.println(e.getMessage());
				}
			}
		}
	%>

</body>
</html>









