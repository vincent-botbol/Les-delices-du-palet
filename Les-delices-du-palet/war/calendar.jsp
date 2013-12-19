<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<%@include file="WEB-INF/templates/head.jsp"%>
<%@ page import="com.delices.model.Match" %>
<title>Les Délices du Palet - Calendrier</title>
</head>
<body>
	<%@include file="WEB-INF/templates/menu.jsp"%>
	<div id="main-content">
		<div class="left-panel">
			<h1>Calendar</h1>
			<%
				List<Match> matchs = new ArrayList<Match>();
			
				for (int i=0;i<5;i++) {
			%>
					<div class="calendar-match">
						 <%="Match" + i%>
					</div>
			<%
				}
			%>
		</div>
		
		<%@include file="WEB-INF/templates/dayMatches.jsp"%>
		<div class="clear"></div>
		
	</div>
	<%@include file="WEB-INF/templates/footer.jsp"%>
</body>
</html>