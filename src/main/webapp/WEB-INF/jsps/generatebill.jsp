<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>generatebill</title>
</head>
<body>
<h2>bill here</h2>
<form action="savebill" method="post">
<pre>
firstname<input type="text" name="firstname" value="${contact.firstname }"/>
lastname<input type="text" name="lastname" value="${contact.lastname }"/>
email<input type="text" name="email" value="${contact.email }"/>
mobile<input type="text" name="mobile" value="${contact.mobile }"/>
productname<input type="text" name="product" value="${contact.product }"/>
quantity<input type="text" name="quantity" value="${contact.quantity }"/>
amount<input type="text" name="amount" value="${contact.amount }"/>
<input type="submit" value="generate"/>
</pre>
</form>
</body>
</html>