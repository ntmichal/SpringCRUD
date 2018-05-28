<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ page isELIgnored="false" %>
<h3>Wystawiamy oceny!</h3>
<hr>

<hr>
<form:form action="saveRating?comId=${idprac}" modelAttribute="ocena" method="POST">
	<table>
	<tr>
		<td>Komentarz <form:input path="Komentarz"/></td>
		<td>Kat1<form:input path="kat1"/></td>
		<td>Kat2<form:input path="kat2"/></td>
		<td>Kat3<form:input path="kat3"/></td>
		<td>Kat4<form:input path="kat4"/></td>
		<td>Kat4<form:input path="kat5"/></td>	
	</tr>
	<tr>
			<td><input type="submit" value="Save" /></td>
	</tr>
	</table>
</form:form>