﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="net.board.db.*" %>

<%
	BoardDTO board = (BoardDTO)request.getAttribute("boarddata");
%>

<!DOCTYPE html>
<html>
<head>
	<title>MVC 게시판</title>
	<script type="text/javascript">
		function modifyboard(){
			modifyform.submit();
		}
	</script>
</head>

<body>
<!-- 게시판 수정 -->
<form action="BoardModifyAction.bo" method="post" name="modifyform">
<input type="hidden" name="boardNum" value=<%=board.getBoardNum() %>>
<table cellpadding="0" cellspacing="0">
	<tr align="center" valign="middle">
		<td colspan="5">MVC 게시판</td>
	</tr>
	<tr>
		<td height="16" style="font-family:돋음; font-size:12">
			<div align="center">제 목</div>
		</td>
		<td>
			<input name="boardSubject" size="50" maxlength="100" 
				value="<%=board.getBoardSubject()%>">
		</td>
	</tr>
	<tr>
		<td style="font-family:돋음; font-size:12">
			<div align="center">내 용</div>
		</td>
		<td>
			<textarea name="boardContent" cols="67" rows="15"><%=board.getBoardContent() %></textarea>
		</td>
	</tr>
	<%if(!(board.getBoardFile()==null)){ %>
	<tr>
		<td style="font-family:돋음; font-size:12">
			<div align="center">파일 첨부</div>
		</td>
		<td>
			&nbsp;&nbsp;<%=board.getBoardFile() %>
		</td>
	</tr>
	<%} %>
	<tr>
		<td height="16" style="font-family:돋음; font-size:12">
			<div align="center">비밀번호</div>
		</td>
		<td>
			<input name="boardPass" type="password">
		</td>
	</tr>
	
	<tr bgcolor="cccccc">
		<td colspan="2" style="height:1px;">
		</td>
	</tr>
	<tr><td colspan="2">&nbsp;</td></tr>
	
	<tr align="center" valign="middle">
		<td colspan="5">
			<font size=2>
			<a href="javascript:modifyboard()">[수정]</a>&nbsp;&nbsp;
			<a href="javascript:history.go(-1)">[뒤로]</a>&nbsp;&nbsp;
			</font>
		</td>
	</tr>
</table>
</form>
<!-- 게시판 수정 -->
</body>
</html>