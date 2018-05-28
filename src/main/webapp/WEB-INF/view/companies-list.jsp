<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
	<title>Lista pracodawców</title>
</head>
<body>
	<table>
	<tr>
		<th>ID:</th><th>Nazwa</th>
	</tr>
	
	<c:forEach items="${pracodawcy}" var="pracodawca">
				<tr>
					<td>${pracodawca.ID}</td>
					<td>${pracodawca.nazwa}</td>
					<td><a href="./companies/showCompany?comId=${pracodawca.ID}">Szczegóły</a></td>
					<td><a href="./companies/addRating?comId=${pracodawca.ID}">Wystaw ocenę</a></td>

				</tr>
	</c:forEach>
	</table>
</body>
</html>
