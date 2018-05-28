<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>

</head>
<body>
<h3>Logowanie (to do)</h3>
<div class="login">
	<form:form>
	<table>
		<tr>
			<td>Login lub email</td>
			<td><input type="text"/>
		</tr>
		<tr>
			<td>Hasło</td>
			<td><input type="password"/></td>
		</tr>
	</table>
			<button>Login</button>
	</form:form>
</div>



<h3>Rejestracja </h3>
<div class="register">
	<form:form action="registerUser" modelAttribute="user" method="POST">
		<table>
		<tr>
			<td>Login</td>
			<td><form:input path="login"/></td>
		</tr>
		<tr>
			<td>Imie</td>
			<td><form:input path="imie"/></td>
		</tr>
		<tr>
			<td>Nazwisko</td>
			<td><form:input path="nazwisko"/></td>
		</tr>
		<tr>
			<td>Pesel</td>
			<td><form:input path="pesel"/></td>
		</tr>
		<tr>
			<td>E-mail</td>
			<td><form:input path="email"/></td>
		</tr>
		<tr>
			<td>Hasło</td>
			<td><form:password path="password"/></td>
		</tr>
		<tr>
			<td>Powtórz hasło</td>
			<td><input type="password"/></td>
		</tr>
		</table>
		<input type="submit" value="Save"/>
	</form:form>
	
</div>
</body>
</html>