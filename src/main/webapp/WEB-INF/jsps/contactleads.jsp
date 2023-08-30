<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>contacts here</title>
</head>
<body>
<h2>contact leading</h2>
<h2>leads contact</h2>

<table>
<tr>
<th>firstname</th>
<th>lastname </th>
<th>email </th>
<th>mobile </th>
<th>source </th>
<th>Billing</th>
</tr>

<c:forEach var="contact" items="${contact}">
<tr>
<td>${contact.firstname }</td>
<td>${contact.lastname }</td>
<td>${contact.email }</td>
<td>${contact.mobile }</td>
<td>${contact.source }</td>
<td><a href="createbill?id=${contact.id }">billing</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>