<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
	<title>Agile Brazil - Inscrições</title>
	<link href="<c:url value='/css/html5forms.layout.css'/>" rel="stylesheet" />
	<link href="<c:url value='/css/jquery.ui.all.css' />" rel="stylesheet" />
	<script src="<c:url value='/js/jquery-ui-1.8.5.min.js' />"></script>
</head>
<body>

	<form action="create">
		<label for="firstName">Nome</label> <input name="attendee.firstName" id="firstName" /><br />
		<label for="lastName">Sobrenome</label> <input name="attendee.lastName" id="lastName" /><br />
		<label for="badgeName">Nome para o crachá</label> <input name="attendee.badgeName" id="badgeName"/><br />
		<label for="gender">Sexo</label> <input name="attendee.gender" id="gender" /><br />
		<label for="email">Email</label> <input name="attendee.email" id="email" /><br />
		<label for="emailConfirmation">Confirme o email</label> <input name="emailConfirmation" id="emailConfirmation" /><br />
		<label for="twitter">Twitter</label> <input name="attendee.twitter" id="twitter" /><br />
		<label for="organization">Empresa</label> <input name="attendee.organization" id="organization" /><br />
		<label for="phone">Telefone de contato</label> <input name="attendee.phone" id="phone" /><br />
		<label for="address">Endereço</label> <input name="attendee.address" id="address" /><br />
		<label for="zipcode">CEP</label> <input name="attendee.zipcode" id="zipcode" /><br />
		<label for="neighbourhood">Bairro</label> <input name="attendee.neighbourhood" id="neighbourhood" /><br />
		<label for="city">Cidade</label> <input name="attendee.city" id="city" /><br />
		<label for="state">Estado</label> <input name="attendee.state" id="state" /><br />
		<label for="country">País</label> <input name="attendee.country" id="country" /><br />

		<button class="ui-button ui-button-text-only" type="submit">
		<span class="ui-button-text">Cadastre-se</span>
		</button>
	</form>

</body>
</html>