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
	<script src="<c:url value='/js/jquery-1.4.3.min.js' />"></script>
	<script src="<c:url value='/js/jquery-ui-1.8.5.min.js' />"></script>
</head>
<body>
	<div class="header">
		<h1><fmt:message key="attendee.form" /></h1>
	</div>

	<c:if test="${not empty errors }">
		<div id="errors">
			<c:forEach var="error" items="${errors}">
				<fmt:message key="${error.message }" />
			</c:forEach>
		</div>
	</c:if>
	
	<form action="create" method="POST">
		<label for="firstName"><fmt:message key="attendee.firstName" /></label> <input name="attendee.firstName" id="firstName" /><br />
		<label for="lastName"><fmt:message key="attendee.lastName" /></label> <input name="attendee.lastName" id="lastName" /><br />
		<label for="badgeName"><fmt:message key="attendee.badgeName" /></label> <input name="attendee.badgeName" id="badgeName"/><br />
		<label for="email"><fmt:message key="attendee.email" /></label> <input name="attendee.email" id="email" /><br />
		<label for="emailConfirmation"><fmt:message key="form.emailConfirmation" /></label> <input name="emailConfirmation" class="required" id="emailConfirmation" /><br />
		<label for="phone"><fmt:message key="attendee.phone" /></label> <input name="attendee.phone" id="phone"  /><br />
		<label for="gender" ><fmt:message key="attendee.gender" /></label> <select name="attendee.gender" id="gender">
			<c:forEach var="gender" items="${genders }">
				<option value="${gender.name }"><fmt:message key="gender.${gender.name }"/></option>
			</c:forEach>
		</select><br />
		<label for="twitter"><fmt:message key="attendee.twitter" /></label> <input name="attendee.twitter" id="twitter" /><br />
		<label for="organization"><fmt:message key="attendee.organization" /></label> <input name="attendee.organization" id="organization" /><br />
		<label for="address"><fmt:message key="attendee.address" /></label> <input name="attendee.address" id="address" /><br />
		<label for="zipcode"><fmt:message key="attendee.zipcode" /></label> <input name="attendee.zipcode" id="zipcode"  /><br />
		<label for="neighbourhood" ><fmt:message key="attendee.neighbourhood" /></label> <input name="attendee.neighbourhood" id="neighbourhood" /><br />
		<label for="city"><fmt:message key="attendee.city" /></label> <input name="attendee.city" id="city" /><br />
		<label for="state" ><fmt:message key="attendee.state" /></label> <select name="attendee.state" id="state">
			<c:forEach var="state" items="${states }">
				<option value="${state.name }"><fmt:message key="state.${state.name }"/></option>
			</c:forEach>
		</select><br />
		<label for="country"><fmt:message key="attendee.country" /></label> <input name="attendee.country" id="country" /><br />

		<button class="ui-button ui-button-text-only" type="submit">
		<span class="ui-button-text"><fmt:message key="form.register" /></span>
		</button>
	</form>

	<script type="text/javascript">
		var confirmation = $("#emailConfirmation");
		confirmation.blur(function() {
			if (confirmation.val() != $("#email").val()) {
				confirmation.css({background: "#FFBBBB"});
			} else {
				confirmation.css({background: "#FFFFFF"});
			}
		});
	</script>

</body>
</html>