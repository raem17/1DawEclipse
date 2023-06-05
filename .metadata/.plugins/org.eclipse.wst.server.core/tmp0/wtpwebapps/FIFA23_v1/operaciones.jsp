<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="FIFA.*" %>
<%@ page import="java.io.*,java.util.*" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html">
	
	<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
	<link rel="stylesheet" href="assets/css/main.css" />
	<title>Proyecto Web FIFA23</title>
</head>

<body class="is-preload">
		<div id="page-wrapper">
		
		<!-- JAVA -->
		<%
		BDController conexion = new BDController();
		String mensaje = "";
		
		String tipo = request.getParameter("tipo").trim();
		
		if (tipo.equalsIgnoreCase("altaJuga")) {
			String piernaJuga = request.getParameter("piernaJuga");
			int codEquipo = Integer.parseInt(request.getParameter("codEquipo"));
			
			String nombreJuga = "";
			String paisJuga = "";
			String alturaJugaStr = "";
			
			try {
				nombreJuga = request.getParameter("nombreJuga").trim();
				paisJuga = request.getParameter("paisJuga").trim();
				alturaJugaStr = request.getParameter("alturaJuga").trim();
				
			} catch (Exception e) {
				// TODO
			}
			
			if (!nombreJuga.isBlank() && !paisJuga.isBlank() && !alturaJugaStr.isBlank()) {
				if (conexion.existeEquipo(codEquipo)) {
					int alturaJuga = Integer.valueOf(alturaJugaStr);
					
					conexion.altaJugador(nombreJuga, piernaJuga, codEquipo, paisJuga, alturaJuga);
					mensaje = "Se ha dado de alta al jugador correctamente.";
					
				} else {
					mensaje = "El código de equipo " + codEquipo + " no existe.";
				}
				
			} else {
				mensaje = "No ha introducido correctamente los datos.";
			}

			// Fin de if altaJuga
		} else if (tipo.equalsIgnoreCase("bajaJuga")) {
			int codJuga = Integer.parseInt(request.getParameter("codJuga"));
			
			if (conexion.existeJugador(codJuga)) {
				conexion.bajaJugador(codJuga);
				mensaje = "El jugador se ha dado de baja correctamente.";
				
			} else {
				mensaje = "El jugador no existe.";
			}
			
			// Fin de else if bajaJuga
		} else if (tipo.equalsIgnoreCase("bajaEquipo")) {
			int codEquipo = Integer.parseInt(request.getParameter("codEquipo"));
			
			if (conexion.existeEquipo(codEquipo)) {
				conexion.bajaEquipo(codEquipo);
				mensaje = "El equipo se ha dado de baja correctamente.";
				
			} else {
				mensaje = "El equipo no existe.";
			}
			
			// Fin de else if bajaEquipo
		} else if (tipo.equalsIgnoreCase("bajaLiga")) {
			int codLiga = Integer.parseInt(request.getParameter("codLiga"));
			
			if (conexion.existeLiga(codLiga)) {
				conexion.bajaLiga(codLiga);
				mensaje = "La liga se ha dado de baja correctamente.";
				
			} else {
				mensaje = "La liga no existe.";
			}
			
			// Fin de else if bajaLiga
		} else if (tipo.equalsIgnoreCase("altaLiga")){
			String nombreLiga = "";
			String nombrePais = "";
			
			try {
				nombreLiga = request.getParameter("nombreLiga").trim();
				nombrePais = request.getParameter("nombrePais").trim();
				
			} catch (Exception e) {
				// TODO
			}
			
			if (!nombreLiga.isBlank() && !nombrePais.isBlank()) {
				conexion.altaLiga(nombreLiga, nombrePais);
				mensaje = "Se ha dado de alta la liga correctamente.";
				
			} else {
				mensaje = "No ha introducido correctamente los datos.";
			}
			
			// Fin de else if altaLiga
			
		} else if (tipo.equalsIgnoreCase("altaEquipo")) {
			String nombreEquipo = "";
			int codLiga = Integer.parseInt(request.getParameter("codLiga"));
			
			try {
				nombreEquipo = request.getParameter("nombreEquipo").trim();
				
			} catch (Exception e) {
				// TODO
			}
			
			if (!nombreEquipo.isBlank()) {
				if (conexion.existeLiga(codLiga)) {
					conexion.altaEquipo(nombreEquipo, codLiga);
					mensaje = "Se ha dado de alta al equipo correctamente.";
					
				} else {
					mensaje = "El código de la liga " + codLiga + " no existe.";
				}
				
			} else {
				mensaje = "No ha introducido correctamente los datos.";
			}
			
			// Fin de else if altaEquipo
		} else if (tipo.equalsIgnoreCase("modificarJuga")) {
			String nombre = "";
			String pierna = request.getParameter("piernaJuga");
			int codEquipo = Integer.parseInt(request.getParameter("codEquipo"));
			String pais = "";
			String alturaStr = "";
			
			try {
				nombre = request.getParameter("nombreJuga").trim();
				pais = request.getParameter("paisJuga").trim();
				alturaStr = request.getParameter("alturaJuga");
				
			} catch(Exception e) {
				// TODO
			}
			
			if (!nombre.isBlank() && !pais.isBlank() && !alturaStr.isBlank()) {
				int codJuga = Integer.parseInt(request.getParameter("codJuga"));
				conexion.modificarJuga(codJuga, nombre, pierna, codEquipo, pais, Integer.parseInt(alturaStr));
				
				mensaje = "Se ha modificado el jugador correctamente.";
				
			} else {
				mensaje = "No ha introducido correctamente los datos.";
			}
			
			// Fin de else if modificarJuga
			
		} else if (tipo.equalsIgnoreCase("modificarLiga")) {
			String nombreLiga = "";
			String nombrePais = "";
			
			try {
				nombreLiga = request.getParameter("nombreLiga").trim();
				nombrePais = request.getParameter("nombrePais").trim();
				
			} catch(Exception e) {
				// TODO
			}
			
			if(!nombreLiga.isBlank() && !nombrePais.isBlank()) {
				int codLiga = Integer.parseInt(request.getParameter("codLiga"));
				conexion.modificarLiga(codLiga, nombreLiga, nombrePais);
				
				mensaje = "Se ha modificado la liga correctamente.";
				
			} else {
				mensaje = "No ha introducido correctamente los datos.";
			}
			
			// Fin de else if modificarLiga
		} else if (tipo.equalsIgnoreCase("modificarEquipo")) {
			String nombreEquipo = "";
			int codLiga = Integer.parseInt(request.getParameter("codLiga"));
			
			try {
				nombreEquipo = request.getParameter("nombreEquipo").trim();
				
			} catch(Exception e) {
				// TODO
			}
			
			if(!nombreEquipo.isBlank()) {
				int codEquipo = Integer.parseInt(request.getParameter("codEquipo"));;
				conexion.modificarEquipo(codEquipo, nombreEquipo, codLiga);
				
				mensaje = "Se ha modificado el equipo correctamente.";
				
			} else {
				mensaje = "No ha introducido correctamente los datos.";
			}
		}

		
		%>
			<!-- Header -->
				<div id="header">

					<!-- Logo -->
						<h1><a href="index.jsp" id="logo">FIFA23</a></a></h1>

					<!-- Nav -->
						<nav id="nav">
							<ul>
								<li class="current"><a href="index.jsp">Inicio</a></li>
								<li>
									<a href="#">Listados</a>
									<ul>
										<li><a href="ligas.jsp">FIFA 23 Ligas</a></li>
										<li><a href="equipos.jsp">FIFA 23 Equipos</a></li>
										<li><a href="jugadores.jsp">FIFA 23 Jugadores</a></li>
									</ul>
								</li>
								<li>
									<a href="#">Operaciones</a>
									<ul>
										<li>
											<a href="#">Jugadores</a>
											<ul>
												<li><a href="operaciones.jsp?tipo=altajugador">Alta Jugador</a></li>
												<li><a href="#">Baja Jugador</a></li>
												<li><a href="#">Modificar Jugador</a></li>
											</ul>
										</li>
										<li>
											<a href="#">Equipos</a>
											<ul>
												<li><a href="#">Alta Equipo</a></li>
												<li><a href="#">Baja Equipo</a></li>
												<li><a href="#">Modificar Equipo</a></li>
											</ul>
										</li>
										<li>
											<a href="#">Ligas</a>
											<ul>
												<li><a href="#">Alta Liga</a></li>
												<li><a href="#">Baja Liga</a></li>
												<li><a href="#">Modificar Liga</a></li>
											</ul>
										</li>
										<li>
											<a href="#">Cartas</a>
											<ul>
												<li><a href="#">Alta Carta</a></li>
												<li><a href="#">Baja Carta</a></li>
												<li><a href="#">Modificar Carta</a></li>
											</ul>
										</li>
									</ul>
								</li>
								<li ><a href="#">Simulador</a>
									<ul>
										<li><a href="#">Construye tu Equipo</a></li>
									</ul>
								</li>
							</ul>
						</nav>
				</div>
				<!-- Main -->
				<section class="wrapper style1" style="height:500px;">
					<div class="container">
						<div id="content">

							<!-- Content -->
							
								<article>
									
									<section class="col-6 col-12-narrower">
									<!-- Mensaje -->
								<h3 style="text-align: center;"><%=mensaje %></h3>
								
							</section>
								</article>
						</div>
					</div>
				</section>
										
			<!-- Footer -->
				<div id="footer">
					<div class="container">
						<div class="row">
							<section class="col-3 col-6-narrower col-12-mobilep">
								<h3>Listados</h3>
								<ul class="links">
									<li><a href="jugadores.asp">Listado de Jugadores</a></li>
									<li><a href="equipos.asp">Listado de Equipos</a></li>
									<li><a href="ligas.asp">Listado de Ligas</a></li>
								
								</ul>
							</section>
							<section class="col-3 col-6-narrower col-12-mobilep">
								<h3>Más Opciones</h3>
								<ul class="links">
									<li><a href="altaJugador.jsp">Alta Jugador</a></li>
									<li><a href="altaEquipo.jsp">Alta Equipo</a></li>
									<li><a href="altaLiga.jsp">Alta Liga</a></li>
									<li><a href="altaCarta.jsp">Alta Carta</a></li>
									<li><a href="modifiJugador.jsp">Modificar Jugador</a></li>
									<li><a href="modifiEquipo.jsp">Modificar Equipo</a></li>
									<li><a href="modifiLiga.jsp">Modificar Liga</a></li>
									<li><a href="modifiCarta.jsp">Modificar Carta</a></li>
								</ul>
							</section>
							<section class="col-6 col-12-narrower">
								<h3>Solicita Información</h3>
								<form>
									<div class="row gtr-50">
										<div class="col-6 col-12-mobilep">
											<input type="text" name="name" id="name" placeholder="Name" />
										</div>
										<div class="col-6 col-12-mobilep">
											<input type="email" name="email" id="email" placeholder="Email" />
										</div>
										<div class="col-12">
											<textarea name="message" id="message" placeholder="Message" rows="5"></textarea>
										</div>
										<div class="col-12">
											<ul class="actions">
												<li><input type="submit" class="button alt" value="Enviar Email" /></li>
											</ul>
										</div>
									</div>
								</form>
							</section>
						</div>
					</div>

					<!-- Icons -->
						<ul class="icons">
							<li><a href="#" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
							<li><a href="#" class="icon fa-facebook"><span class="label">Facebook</span></a></li>
							<li><a href="#" class="icon fa-github"><span class="label">GitHub</span></a></li>
							<li><a href="#" class="icon fa-linkedin"><span class="label">LinkedIn</span></a></li>
							<li><a href="#" class="icon fa-google-plus"><span class="label">Google+</span></a></li>
						</ul>

					<!-- Copyright -->
						<div class="copyright">
							<ul class="menu">
								<li>&copy; FIFA 23. Todos los derechos reservados</li><li>Design: <a href="https://www.centronelson.org">Centro Nelson</a></li>
							</ul>
						</div>

				</div>

		</div>

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/jquery.dropotron.min.js"></script>
			<script src="assets/js/browser.min.js"></script>
			<script src="assets/js/breakpoints.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main.js"></script>
			<script src="assets/js/index.js"></script>
			<script src="assets/js/dropdown.js"></script>

</body>

</html>