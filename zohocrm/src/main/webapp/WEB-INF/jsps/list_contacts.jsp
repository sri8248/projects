<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LIST OF DATA</title>
</head>
<body>
<H1>LIST OF  CONTACTS DATA PRESENT</H1>
<a href="viewpage">create_new_leads</a>
<table border='5'>
<tr>
<th>Id</th>
<th>firstName</th>
<th>LastName</th>
<th>Email</th>
<th>Mobile</th>
<th>source</th>
<th>DELETE</th>
<th>Update</th>
<TH>MAILCOMPOSE</TH>
<th>Billing</th>
</tr>
<s:forEach var="msgg" items="${leads}">
<tr>
<td><a href="findid?id=${msgg.id}">${msgg.id}</a></td>
<td>${msgg.firstname}</td>
<td>${msgg.lastname}</td>
<td>${msgg.email}</td>
<td>${msgg.mobile}</td>
<td>${msgg.source}</td>
<td><a href="deletecontact?id=${msgg.id}">DELETECONTACT</a>
<td><a href="updatecontact?id=${msgg.id}">UPDATECONTACT</a>
<td><a href="mail?email=${msgg.email}">composeMail</a>
<td><a href="billing?id=${msgg.id}">BILLING</a>
</tr>
</s:forEach>
</table>
</body>
</html>