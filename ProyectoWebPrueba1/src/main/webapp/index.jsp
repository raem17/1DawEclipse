<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Titulo</title>
</head>
<body>

<table border="1">
<%
int cont = 0;
for (int i = 0; i < 10; i++) {
	out.print("<tr>");
	
	for (int j = 0; j < 10; j++) {
		cont++;
		out.print("<td>" + cont + "</td>");
	}
	
	out.print("</tr>");
}
%>
</table>



</body>
</html>