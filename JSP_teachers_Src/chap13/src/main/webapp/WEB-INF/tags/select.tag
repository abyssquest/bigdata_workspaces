<%@ tag language="java" body-content="empty" pageEncoding="UTF-8"%>
<%@ tag trimDirectiveWhitespaces="true"%>
<%@ tag dynamic-attributes="optionMap"%>
<%@ attribute name="name" required="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<select name="${ name }">
	<c:forEach var="option" items="${ optionMap }">
		<option value="${ option.key }">${ option.value }</option>
	</c:forEach>

</select>
