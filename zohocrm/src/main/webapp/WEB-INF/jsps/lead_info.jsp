<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead info</title>
</head>
<body>
<h2>LEAD INFORMATION</h2>
first name:${lead.firstname}<br/>
last name:${lead.lastname}<br/>
email:${lead.email}<br/>
mobile:${lead.mobile}<br/>
source:${lead.source}<br/>
</body>
<form action="composemail" method="post">
<input type="hidden" name="email" value="${lead.email}"/>
<input type ="submit" value="sendemail"/>
</form>
<form action="convert_lead" method="post">
<input type="hidden" name="id" value="${lead.id}"/>
<input type="submit" value="covert"/>
</form>
</html>

