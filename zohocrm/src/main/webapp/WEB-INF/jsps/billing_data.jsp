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
<form action="GENERATE_BILL" method="post">
<H1>GENERATE BILL DATA</H1>
<pre>
FirstNAME<INPUT TYPE="TEXT" name= firstname value="${bill.firstname}"/>
LASTNAME<input type="TEXT" name=lastname value="${bill.lastname}"/>
EMAIL<input type="EMAIL" name=email value="${bill.email}"/>
MOBILENUMBER<input type="NUMBER" name=mobile value="${bill.mobile}"/>
AMOUNT<input type="NUMBER" name="amount" placeholder="enter the amount"/>
PRODUCT<input type="text" name="product" placeholder="enter the product"/>
<input type="submit" value="GENERATE BILL"/>
</pre>
</form>
</body>
</html>