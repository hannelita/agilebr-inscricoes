<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<title>Agile Brazil - Inscrições</title>
	<link href="<c:url value='/css/html5forms.layout.css'/>" rel="stylesheet" />
	<link href="<c:url value='/css/jquery.ui.all.css' />" rel="stylesheet" />
	<link href="<c:url value='/css/agilebrazil.css' />" rel="stylesheet" />
	<script src="<c:url value='/js/jquery-1.4.3.min.js' />"></script>
	<script src="<c:url value='/js/jquery-ui-1.8.5.min.js' />"></script>
</head>
<body>

	<div id="errors">
		<c:forEach var="error" items="${errors}">
			<fmt:message key="${error.message }" />
		</c:forEach>
	</div>

	<form action="create" method="POST">
		<label for="firstName"><fmt:message key="attendee.firstName" /></label> <input name="attendee.firstName" id="firstName" /><br />
		<label for="lastName">Sobrenome</label> <input name="attendee.lastName" id="lastName" /><br />
		<label for="badgeName">Nome para o crachá</label> <input name="attendee.badgeName" id="badgeName"/><br />
		<label for="gender">Sexo</label> <input name="attendee.gender" id="gender" /><br />
		<label for="email">Email</label> <input name="attendee.email" id="email" /><br />
		<label for="emailConfirmation">Confirme o email</label> <input name="emailConfirmation" class="required" id="emailConfirmation" /><br />
		<label for="twitter">Twitter</label> <input name="attendee.twitter" id="twitter" /><br />
		<label for="organization">Empresa</label> <input name="attendee.organization" id="organization" /><br />
		<label for="phone">Telefone de contato</label> <input name="attendee.phone" id="phone" /><br />
		<label for="address">Endereço</label> <input name="attendee.address" id="address" /><br />
		<label for="zipcode">CEP</label> <input name="attendee.zipcode" id="zipcode" /><br />
		<label for="neighbourhood">Bairro</label> <input name="attendee.neighbourhood" id="neighbourhood" /><br />
		<label for="city">Cidade</label> <input name="attendee.city" id="city" /><br />
		<label for="state">Estado</label> <select name="attendee.state" id="state">
			<c:forEach var="state" items="${states }">
				<option value="${state.name }">${state.name }</option>
			</c:forEach>
		</select><br />
		<label for="country">País</label> <input name="attendee.country" id="country" /><br />

		<button class="ui-button ui-button-text-only" type="submit">
		<span class="ui-button-text">Cadastre-se</span>
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