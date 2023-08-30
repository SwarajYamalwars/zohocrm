<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>lead info</title>
</head>
<body>
<h2>lead here</h2>
firstname:${lead.firstname }<br/>
lastname:${lead.lastname }<br/>
email:${lead.email }<br/>
mobile:${lead.mobile }<br/>
source:${lead.source }<br/>
<form action="composeemail" method="post">
<input type="hidden" name="email" value="${lead.email}"/>
<input type="submit" value="email"/>
</form>
<form action="convertlead" method="post">
<input type="hidden" name="id" value="${lead.id }"/>
<input type="submit" value="convert"/>
</form>
</body>
</html>