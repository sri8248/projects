<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CREATE NEW LEAD</title>
</head>
<body>
<form action="save" method="post">
<pre>
<h1>CREATE NEW LEAD</h1>
FirstNAME<INPUT TYPE="TEXT" name= firstname placeholder="enter the firstname"/>
LASTNAME<input type="text" name=lastname placeholder="enter the lastname"/>
EMAIL<input type="EMAIL" name=email placeholder="enter the email"/>
MOBILENUMBER<input type="number" name=mobile placeholder="enter the mobilenumber"required/>
<select name="source">
<option value="newspaper">newspaper</option>
<option value="facebook">face</option>
<option value="whatsapp">what</option>
<option value="seminar">seminar</option>
</select>
<input type="submit" value="save"/>
</pre>
</form>
</body>
</html>