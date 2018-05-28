<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Info</h1>
<table>
<tr>

	<th>Nazwa</th>
	<th>Opis</th>
	<th>Średnia ocen</th>
</tr>
<tr>
	<td>${pracodawca.ID} | ${pracodawca.nazwa}</td>
	<td>${pracodawca.opis}</td>
	<td>${avg}</td>
</tr>

</table>
<h2>Komentarze poszczególne oceny</h2>
<table>
<tr>
	<th>Komentarz</th>
	<th>Kategoria 1</th>
	<th>Kategoria 2</th>
	<th>Kategoria 3</th>
	<th>Kategoria 4</th>
	<th>Kategoria 5</th>
</tr>
<c:forEach var="tempPracodawca" items="${pracodawca.getOcenyList()}">
	<tr>
		<td>${tempPracodawca.komentarz}</td>
		<td>${tempPracodawca.kat1}</td>
		<td>${tempPracodawca.kat2}</td>
		<td>${tempPracodawca.kat3}</td>
		<td>${tempPracodawca.kat4}</td>
		<td>${tempPracodawca.kat5}</td>
	</tr>
</c:forEach>
</table>


</body>
</html>