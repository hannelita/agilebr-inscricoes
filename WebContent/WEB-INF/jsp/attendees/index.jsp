<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="create">
	Nome: <input name="attendee.firstName"><br />
	Sobrenome: <input name="attendee.lastName"><br />
	Nome para o crachá: <input name="attendee.badgeName"><br />
	Sexo: <input name="attendee.gender"><br />
	Email: <input name="attendee.email"><br />
	Confirme o email: <input><br />
	Twitter: <input name="attendee.twitter"><br />
	Empresa: <input name="attendee.organization"><br />
	Telefone de contato: <input name="attendee.phone"><br />
	Endereço <input name="attendee.address"><br />
	CEP: <input name="attendee.zipcode"><br />
	Bairro: <input name="attendee.neighbourhood"><br />
	Cidade: <input name="attendee.city"><br />
	Estado: <input name="attendee.state"><br />
	País: <input name="attendee.country"><br />
	
	<input type="submit" value="Cadastrar">
	
</form>

</body>
</html>