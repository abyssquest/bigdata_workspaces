<%@ tag language="java" body-content="scriptless" pageEncoding="UTF-8"%>
<%@ tag trimDirectiveWhitespaces="true"%>
<%@ attribute name="trim"%>
<%@ attribute name="length" type="java.lang.Integer"%>
<%@ attribute name="trail"%>

<%@ attribute name="var" required="true" rtexprvalue="false"%>
<%@ variable name-from-attribute="var" alias="result" 
				variable-class="java.lang.String" scope="AT_END"%>
				
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:doBody var="content" scope="page"/>

<%
	String content = (String)jspContext.getAttribute("content");
	if(trim.equals("true")){
		content = content.trim();
	}
	
	content = content.replaceAll("<(/)?([a-zA-Z]*)(\\s[a-zA-Z]*=[^>]*)?>", "");
	
	if((length != null) && (length.intValue() > 0) 
			&& (content.length() > length.intValue())){
		content = content.substring(0, length.intValue());
		
		if(trail != null){
			content = content + trail;
		}
	}
%>

<%-- ${ content } --%>
<%-- <%= content %> --%>

<c:set var="result" value="<%= content %>"/>














