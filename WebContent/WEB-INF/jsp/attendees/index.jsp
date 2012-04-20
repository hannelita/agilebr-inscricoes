<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<title>Agile Brazil - <fmt:message key="registration.title" /></title>
	<link href="<c:url value='/css/jquery.ui.all.css' />" rel="stylesheet" />
	<link href="<c:url value='/css/agilebrazil.css' />" rel="stylesheet" />
	<script src="<c:url value='/js/agilebrazil.js' />"></script>
	<script src="<c:url value='/js/jquery-1.4.3.min.js' />"></script>
	<script src="<c:url value='/js/jquery-ui-1.8.5.min.js' />"></script>
</head>
<body>
	<div class="header">
		<h1><fmt:message key="attendee.form" /></h1>
	</div>

	<c:if test="${not empty errors }">
		<div id="errors">
			<ul>
			<c:forEach var="error" items="${errors}">
				<li><fmt:message key="${error.message }" /></li>
			</c:forEach>
			</ul>
		</div>
	</c:if>
	
	<form action="create" method="POST">
		<label for="firstName"><fmt:message key="attendee.firstName" /></label> <input name="attendee.firstName" id="firstName" /><br />
		<label for="lastName"><fmt:message key="attendee.lastName" /></label> <input name="attendee.lastName" id="lastName" /><br />
		<label for="badgeName"><fmt:message key="attendee.badgeName" /></label> <input name="attendee.badgeName" id="badgeName"/><br />
		<label for="email"><fmt:message key="attendee.email" /></label> <input name="attendee.email" id="email" /><br />
		<label for="emailConfirmation"><fmt:message key="form.emailConfirmation" /></label> <input name="emailConfirmation" class="required" id="emailConfirmation" onblur="checkSimilarity('email')"/><br />
		<label for="phone"><fmt:message key="attendee.phone" /></label> <input name="attendee.phone" id="phone"  /><br />
		<label for="gender" ><fmt:message key="attendee.gender" /></label> <select name="attendee.gender" id="gender">
			<c:forEach var="gender" items="${genders }">
				<option value="${gender.name }"><fmt:message key="gender.${gender.name }"/></option>
			</c:forEach>
		</select><br />
		<label for="twitter"><fmt:message key="attendee.twitter" /></label> <input name="attendee.twitter" id="twitter" /><br />
		<label for="organization"><fmt:message key="attendee.organization" /></label> <input name="attendee.organization" id="organization" /><br />
		<label for="street"><fmt:message key="address.street" /></label> <input name="attendee.address.street" id="street" /><br />
		<label for="zipcode"><fmt:message key="address.zipcode" /></label> <input name="attendee.address.zipcode" id="zipcode"  /><br />
		<label for="neighbourhood" ><fmt:message key="address.neighbourhood" /></label> <input name="attendee.address.neighbourhood" id="neighbourhood" /><br />
		<label for="city"><fmt:message key="address.city" /></label> <input name="attendee.address.city" id="city" /><br />
		<label for="state" ><fmt:message key="address.state" /></label> <select name="attendee.address.state" id="state">
			<c:forEach var="state" items="${states }">
				<option value="${state.name }"><fmt:message key="state.${state.name }"/></option>
			</c:forEach>
		</select><br />
		<label for="country"><fmt:message key="address.country" /></label> <input name="attendee.address.country" id="country" /><br />

		<button class="ui-button ui-button-text-only" type="submit">
		<span class="ui-button-text"><fmt:message key="form.register" /></span>
		</button>
	</form>
	
</body>
</html>