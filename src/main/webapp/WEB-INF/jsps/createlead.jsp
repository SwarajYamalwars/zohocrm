<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LeadHere</title>
<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
<h2>leadhEre</h2>
<form action="SAVELEAD" method="post">
<pre>
firstname<input type="text" name="firstname"/>
lastname<input type="text" name="lastname"/>
email<input type="text" name="email"/>
mobile<input type="text" name="mobile"/>
source:
<select name="source" >
  <option value="newspaper">newspaper</option>
  <option value="online">online</option>
  <option value="webinar">webinar</option>
  <option value="radio">radio</option>
</select>
<input type="submit" value="save"/>
</pre>
</form>
</body>
</html>