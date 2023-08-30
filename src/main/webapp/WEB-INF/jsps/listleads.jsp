<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>get leads</title>
</head>
<body>
<h2>leding here</h2>

<table>
<tr>
<th>firstname</th>
<th>lastname</th>
<th>email</th>
<th>mobile</th>
<th>source</th>
</tr>

<c:forEach var="linclon" items="${leads}">
<tr>
<td><a href="Leadinfo?id=${linclon.id}">${linclon.firstname}</a></td>
<td>${linclon.lastname}</td>
<td>${linclon.email}</td>
<td>${linclon.mobile}</td>
<td>${linclon.source}</td>
</tr>
</c:forEach>
</table>
</body>
</html>