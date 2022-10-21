<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UPDATE</title>
</head>
<body>
<form action="update_lead" method="post">
<h1>update Lead</h1>
<pre>
<INPUT TYPE="hidden" name="id" value="${lead.id}"/>
FirstNAME<INPUT TYPE="TEXT" name= firstname placeholder="${lead.firstname}" value="${lead.firstname}"/>
LASTNAME<input type="text" name=lastname placeholder="${lead.lastname}"value="${lead.lastname}"/>
EMAIL<input type="EMAIL" name=email placeholder="${lead.email}" value="${lead.email}"/>
MOBILENUMBER<input type="number" name=mobile placeholder="${lead.mobile}" value="${lead.mobile}"required/>
<select name="source">
<option value="newspaper">newspaper</option>
<option value="facebook">face</option>
<option value="whatsapp">what</option>
<option value="seminar">seminar</option>
</select>
<input type="submit" value="UPDATE"/>
</pre>
</form>
</body>
</html>