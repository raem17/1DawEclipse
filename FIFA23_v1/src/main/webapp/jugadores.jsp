<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="FIFA.*" %>
<%@ page import="java.util.*" %>
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
				<section class="wrapper style1">
					<div class="container">
						<div id="content">

							<!-- Content -->
						
								<article>
									<header>
										<table >
											<tr style="border:0px;" >	
												<td style="background-color: white;"><h2>Jugadores</h2></td><td style="text-align: right;background-color: white;""></td>
											</tr>
										</table>
									</header>
									
									<div class="table-wrapper">
								<table class="alt">
									<thead>
										<tr>
											<th>Nombre</th>
											<th width='325' colspan="3"></th>
											<th style="text-align: center;">RAT</th>
											<th style="text-align: center;">POS</th>
											<th style="text-align: center;">CARTA</th>
											<th style="text-align: center;">PRECIO</th>
											<th style="text-align: center;">SKI</th>
											<th style="text-align: center;">WF</th>
											<th style="text-align: center;">PAC</th>
											<th style="text-align: center;">SHO</th>
											<th style="text-align: center;">PAS</th>
											<th style="text-align: center;">DRI</th>
											<th style="text-align: center;">DEF</th>
											<th style="text-align: center;">PHI</th>
											<th style="text-align: center;">ALTURA</th>
										</tr>
									</thead>
									<tbody>
									<!-- Empieza -->
									<%
									BDController conexion = new BDController();
									ArrayList<Jugador> jugas = conexion.todosJugadores();
									
									for(int i = 0; i < jugas.size(); i++) {
										Carta cartaActual = conexion.dameCarta("simple", jugas.get(i).getCod_jugador());
										
										out.print("<tr>");
										// Foto juga
										out.print("<td width='10' rowspan='2'><a href = 'jugador.jsp?codJuga= "+ jugas.get(i).getCod_jugador() +"'><img src = 'images/jugadores/"+jugas.get(i).getCod_jugador()+".png' style='float: right; position: relative; width: 100%;'></a></td>");
										
										// nombre
										out.print("<td width='325' colspan='3' style='padding-left: 15px;font-weight: bold;'><a href = 'jugador.jsp?codJuga= "+ jugas.get(i).getCod_jugador() + "'>" + jugas.get(i).getNombre() + "</a></td>");
									
		
										out.print("<td rowspan='2' width='60' style='text-align: center;'>"+ "<span style='padding:0.55rem;background-color:#E9BC0B;color:black;'>" + cartaActual.getRat()+ "</span>" + "</td>"); 
										out.print("<td rowspan='2' width='60' style='text-align: center;'>"+ "<span style='padding:0.55rem;" + "" + "'>" + cartaActual.getPos()+ "</span>" + "</td>");
										out.print("<td rowspan='2' width='60' style='text-align: center;'>"+ "<span style='padding:0.55rem;" + "" + "'>" + cartaActual.getNombre()+ "</span>" + "</td>");
										out.print("<td rowspan='2' width='60' style='text-align: center;'>"+ "<span style='padding:0.55rem;" + "" + "'>" + cartaActual.getPrecio()+ "</span>" + "</td>");
										out.print("<td rowspan='2' width='60' style='text-align: center;'>"+ "<span style='padding:0.55rem;" + "" + "'>" + cartaActual.getFiligranas()+ "*</span>" + "</td>");
										out.print("<td rowspan='2' width='60' style='text-align: center;'>"+ "<span style='padding:0.55rem;" + "" + "'>" + cartaActual.getPierna_mala()+ "*</span>" + "</td>");
										out.print("<td rowspan='2' width='60' style='text-align: center;'>"+ "<span style='padding:0.55rem;" + Utilidades.devolverEstilosXNum(cartaActual.getPac()) + "'>" + cartaActual.getPac()+ "</span>" + "</td>");
										out.print("<td rowspan='2' width='60' style='text-align: center;'>"+ "<span style='padding:0.55rem;" + Utilidades.devolverEstilosXNum(cartaActual.getSho()) + "'>" + cartaActual.getSho()+ "</span>" + "</td>");
										out.print("<td rowspan='2' width='60' style='text-align: center;'>"+ "<span style='padding:0.55rem;" + Utilidades.devolverEstilosXNum(cartaActual.getPas()) + "'>" + cartaActual.getPas()+ "</span>" + "</td>");
										out.print("<td rowspan='2' width='60' style='text-align: center;'>"+ "<span style='padding:0.55rem;" + Utilidades.devolverEstilosXNum(cartaActual.getDri()) + "'>" + cartaActual.getDri()+ "</span>" + "</td>");
										out.print("<td rowspan='2' width='60' style='text-align: center;'>"+ "<span style='padding:0.55rem;" + Utilidades.devolverEstilosXNum(cartaActual.getDef()) + "'>" + cartaActual.getDef()+ "</span>" + "</td>");
										out.print("<td rowspan='2' width='60' style='text-align: center;'>"+ "<span style='padding:0.55rem;" + Utilidades.devolverEstilosXNum(cartaActual.getPhy()) + "'>" + cartaActual.getPhy()+ "</span>" + "</td>");
										out.print("<td rowspan='2' width='60' style='text-align: center;'>"+ "<span style='padding:0.55rem;" + "" + "'>" + jugas.get(i).getAltura() + "cm</span>" + "</td>");
										
										Liga ligaDeJuga = conexion.devolverLigaXCodJuga(jugas.get(i).getCod_jugador());
										
										out.print("</tr>" +
												"<tr>" +
												
												// foto equipo
												  "<td width='15'><a href= 'equipo.jsp?codEquipo=" + jugas.get(i).getCod_equipo() + "&nombreEquipo=" + conexion.devolverNombreEquipoXCod(jugas.get(i).getCod_equipo()) +"'><img src = 'images/equipos/"+ jugas.get(i).getCod_equipo() +".png' style='float: none; position: relative; width: 100%; padding: 0.15rem;'></a></td>" +
												
												// foto pais
												  "<td width='3%'><img src = 'images/paises/"+ jugas.get(i).getPais() +".png' style='float: left; position: relative; width: 100%;'></td>" +
												
												// foto liga
												  "<td width='90'><a href = 'liga.jsp?cod_liga="+ ligaDeJuga.getCod_liga() +"&nombreLiga="+ ligaDeJuga.getNombre() + "'><img src = 'images/ligas/"+ ligaDeJuga.getCod_liga() +".png' style='float: left; position: relative; width: 20%;'></a></td>" +
												
												"</tr>");
									}
									%>
									
										
										<!-- Fin tbody -->
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