<%@page import="FIFA.Jugador"%>
<%@page import="FIFA.Equipo"%>
<%@page import="FIFA.BDController"%>
<%@page import="FIFA.Liga"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
	<link rel="stylesheet" href="assets/css/main.css" />
	<title>Proyecto Web FIFA23</title>
</head>

<body class="is-preload">
		<div id="page-wrapper">
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
										<li><a href="ligas.jsp">Opción 1</a></li>
										
									</ul>
								</li>
								<li>
									<a href="#">Operaciones</a>
									<ul>
										<li>
											<a href="#">Opción 1</a>
											<ul>
												<li><a href="altajugador.jsp">Opción 1</a></li>
												
											</ul>
										</li>
										<li>
											<a href="#">Opción 2</a>
											<ul>
												<li><a href="#">Opción 1</a></li>
												
											</ul>
										</li>
										<li>
											<a href="#">Opción 3</a>
											<ul>
												<li><a href="#">Opción 1</a></li>
												
											</ul>
										</li>
										<li>
											<a href="#">Opción 4</a>
											<ul>
												<li><a href="#">Opción 1</a></li>
												
											</ul>
										</li>
									</ul>
								</li>
								<li ><a href="#">Simulador</a>
									<ul>
										<li><a href="creador.jsp">Opción 1</a></li>
									</ul>
								</li>
							</ul>
						</nav>

				</div>

			<!-- Main -->
			<%
			BDController conexion = new BDController();
			
			int cod_liga = Integer.parseInt(request.getParameter("cod_liga"));
			String nombreLiga = request.getParameter("nombreLiga");
			ArrayList<Equipo> equipos = conexion.devolverEquiposXCodLiga(cod_liga);
			%>
			
				<section class="wrapper style1">
					<div class="container">
						<div id="content">

							<!-- Content -->
							
								<article>
									<header>
										<h2><%=nombreLiga%></h2>
									</header>
									
									<div class="table-wrapper">
								<table class="alt">
									<thead>
										<tr>
											<th>Equipo</th>
											<th width='195' colspan="3"></th>
											<th colspan="19">Plantilla</th>
											
										</tr>
									</thead>
									
									<tbody>
											<%
											

																				for (int i = 0; i < equipos.size(); i++) {
																					out.print("<tr>");
																					
																					// escudo de equipo
																					out.print("<td width='5%' rowspan='2'><a href = 'equipo.jsp?codEquipo=" + equipos.get(i).getCod_equipo() + "&nombreEquipo=" + equipos.get(i).getNombre()+"'><img src = 'images/equipos/"+equipos.get(i).getCod_equipo()+".png' style='float: left; position: relative; width: 100%; padding: 0.3rem;'></a></td>");
																					
																					// nombre
																					out.print("<td width='10%' colspan='3' style='padding-left: 15px; font-weight:bold; color:#B93A4B; font-size: 1rem;'>"+ equipos.get(i).getNombre() + "</td>");
																					
																					// fotos de jugadores
																					ArrayList<Jugador> jugas = conexion.devolverJugadoresXCodEquipo(equipos.get(i).getCod_equipo());
																					for (int j = 0; j < jugas.size(); j++) {
																						out.print("<td rowspan='2' width='3%' style='text-align: center;'><a href = 'jugador.jsp?codJuga= "+ jugas.get(j).getCod_jugador() +"'><img src = 'images/jugadores/"+ jugas.get(j).getCod_jugador() +".png' style='float: left; position: relative; width: 100%; padding: 0;' title='"+ jugas.get(j).getNombre() +"'></a></td>");

																					}
																					
																					out.print("</tr>");
																					
																					out.print("<tr>");
																					
																					// bandera liga
																					out.print("<td width='50' style='text-align: left; padding-left: 0px;  padding-top: 0px;  padding-bottom: 0px;'><img src = 'images/ligas/"+ equipos.get(i).getCod_liga() + ".png' style='float: left; position: relative; width: 100%; padding: 0.25rem;'></td>");
																					
																					// bandera país
																					out.print("<td width='120' style='text-align: left; padding-left: 0px;  padding-top: 0px;  padding-bottom: 0px;'><img src = 'images/paises/"+ conexion.devolverNombrePaisXCodLiga(equipos.get(i).getCod_liga()) + ".png' style='float: left; position: relative; width: 50%; padding: 0.5rem;'></td>");
																					
																					out.print("</tr>");
																					
																				}
											%>
										
									</tbody>
									
								</table>
							</div>

									
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
									<li><a href="jugadores.asp">Listado de Ligas</a></li>
									
								
								</ul>
							</section>
							<section class="col-3 col-6-narrower col-12-mobilep">
								<h3>Más Opciones</h3>
								<ul class="links">
									<li><a href="operaciones.jsp?tipo=altaJugador">Opción 1</a></li>
									
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
</body>
</html>