<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="NBA.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<%
BDController conexion = new BDController();

String tipo = request.getParameter("tipo");
%>

</head>
<body>

<%
String mensaje = "";

if (tipo.equalsIgnoreCase("bajaJuga")) {
	int codJuga = Integer.parseInt(request.getParameter("codJuga"));
	
	if(conexion.existeJuga(codJuga)) {
		conexion.bajaJuga(codJuga);
		mensaje = "Se ha dado de baja al jugador correctamente.";
		
	} else {
		mensaje = "El jugador no existe.";
	}
	
} else if(tipo.equalsIgnoreCase("altaEquipo")) {
	String nombre = "";
	String ciudad = "";
	String division = request.getParameter("division");
	String conferencia = request.getParameter("conferencia");
	
	try {
		nombre = request.getParameter("nombre").trim();
		ciudad = request.getParameter("ciudad").trim();
	} catch (Exception e) {
		// TODO Auto-generated catch block
	}
	
	if (!nombre.isBlank() && !ciudad.isBlank()) {
		if(!conexion.existeEquipo(nombre)) {
			conexion.altaEquipo(nombre, ciudad, conferencia, division);
			mensaje = "Se ha dado de alta el equipo correctamente.";
			
		} else {
			mensaje = "El equipo " + nombre + " ya existe.";
		}
		
	} else {
		mensaje = "Introduzca correctamente los datos.";
	}
} else if(tipo.equalsIgnoreCase("modificarEquipo")) {
	String nombre = request.getParameter("nombre");
	String ciudad = "";
	String division = request.getParameter("division");
	String conferencia = request.getParameter("conferencia");
	
	try {
		ciudad = request.getParameter("ciudad").trim();
	} catch (Exception e) {
		// TODO Auto-generated catch block
	}
	
	if (!ciudad.isBlank()) {
		conexion.modificarEquipo(nombre, ciudad, conferencia, division);
		mensaje = "Se ha modificado el equipo correctamente.";
		
	} else {
		mensaje = "Introduzca correctamente los datos.";
	}
}

%>

<h2><%=mensaje %></h2>


</body>
</html>