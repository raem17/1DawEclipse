<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ejercicio 1</title>
</head>
<body>

<%
int[][] numeros = new int[6][6];

int num = 36;
for (int i = 0; i < numeros.length; i++) {
	for (int j = 0; j < numeros[i].length; j++) {
		numeros[i][j] = num;
		num--;
		
		if (i == 5 && j == 5) {
			out.print(numeros[i][j] + ".");
		} else {
			out.print(numeros[i][j] + ", ");
		}
	}
}
%>

</body>
</html>