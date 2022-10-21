<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>compose email</title>
</head>
<body>
<form action="emailsent" method="post">
<pre>
TO:-<input type="text" name="to" value="${email}"/>
SUBJECT:-<input type="text" name="sub"/> 
COMPOSE:-<TEXTAREA NAME="emailbody" rows="20" cols="80"></TEXTAREA>
<input type="submit" value="sent"/>
</pre>



</form>
</body>
</html>