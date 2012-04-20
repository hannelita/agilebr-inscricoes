<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Agile Brazil - <fmt:message key="registration.title" /></title>
	<link href="<c:url value='/css/jquery.ui.all.css' />" rel="stylesheet" />
	<link href="<c:url value='/css/agilebrazil.css' />" rel="stylesheet" />
	<script src="<c:url value='/js/agilebrazil.js' />"></script>
	<script src="<c:url value='/js/jquery-1.4.3.min.js' />"></script>
	<script src="<c:url value='/js/jquery-ui-1.8.5.min.js' />"></script>
</head>
<body>
	<div class="header">
		<h1><fmt:message key="attendee.created" /></h1>
	</div>
	
	<div class="main">
		<h2>What to do next?</h2>
		
		<ul>
			<li><a href="parte-da-hanneli.jsp">Confirm payment</a></li>
			<li><a href="parte-da-hanneli.jsp">Add courses</a></li>
			<li>Contact us</li>
		</ul>		
	</div>
</body>
</html>