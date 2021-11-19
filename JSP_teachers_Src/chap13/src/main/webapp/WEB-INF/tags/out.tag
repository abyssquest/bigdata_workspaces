<%@ tag language="java" body-content="tagdependent" pageEncoding="UTF-8"%>
<%@ tag trimDirectiveWhitespaces="true"%>

<jsp:doBody var="bodyText" scope="page"/>

<% 
	String bodyText = (String)jspContext.getAttribute("bodyText");
%>

<%= bodyText %>