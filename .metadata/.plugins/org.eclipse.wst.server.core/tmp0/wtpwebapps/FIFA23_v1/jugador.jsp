<%@page import="javax.swing.text.Document"%>
<%@page import="FIFA.Jugador"%>
<%@page import="FIFA.BDController"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="FIFA.*" %>
<%@ page import="java.util.*" %>
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
		<%
		
		%>
			<!-- Header -->
				<div id="header">

					<!-- Logo -->
						<h1><a href="index.html" id="logo">FIFA23</a></a></h1>

					<!-- Nav -->
						<nav id="nav">
							<ul>
								<li class="current"><a href="index.html">Inicio</a></li>
								<li>
									<a href="#">Listados</a>
									<ul>
										<li><a href="jugadores.jsp">FIFA 23 Jugadores</a></li>
										<li><a href="ligas.jsp">FIFA 23 Ligas</a></li>
										<li><a href="equipos.jsp">FIFA 23 Equipos</a></li>
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
										<table style="background-color:white; border-color: white; margin:0;padding: 0 0em 0em 0em;">
											<tr style="background-color:white; border-color: white; margin:0;padding: 0 0em 0em 0em;">
											<td width="100" style="background-color:white; border-color: black;text-align:center; margin:0;padding: 0 0em 0em 0em;"><h2></h2></td>
											</tr>
										</table>
									</header>
							<%
							%>		
							<!-- Grid -->
							
							<%
							BDController conexion = new BDController();
							int codJuga = Integer.parseInt(request.getParameter("codJuga").trim());
							
							Jugador juga = conexion.dameJugador(codJuga);
							Carta carta = conexion.dameCarta("simple", codJuga);
							
							//
							try {
								String nombreCarta = request.getParameter("nombreCarta").trim();
								
								if (!nombreCarta.isBlank()) {
									carta = conexion.dameCarta(nombreCarta, codJuga);
								}
								
							} catch (Exception e) {
							// TODO: handle exception
							}
							
							%>
							<h1 style="text-align: center; font-weight: bold; font-size: 2rem;"><%=juga.getNombre() %></h1>
							<div class="grid-containerGeneral">
							  <div class="c1">
								  <div class="grid-container" style="background-image: url('images/cartas/<%=carta.getNombre()%>.png');<%= Utilidades.returnTextColorOfCardXNomCarta(carta.getNombre())%>">
									  <div class="A"><%=carta.getRat() %></div>
									  <div class="B"><%=carta.getPos() %></div>
									  <div class="C"><img src = 'images/paises/<%=juga.getPais() %>.png' style="width: 100%; position: relative; float: right; padding-left: 2.25rem;"></div>
									  <div class="D"><img src = 'images/equipos/<%=juga.getCod_equipo() %>.png' style="width: 100%; position: relative; float: right; padding-left: 2.35rem;"></div>
									  <div class="E"><img src = 'images/jugadores/<%=juga.getCod_jugador() %>.png' style="width: 100%; position: relative; float: left; padding-right: 1rem;"></div>
									  <div class="F"><%=juga.getNombre() %></div>
									  <div class="G"><%=carta.getPac() %> PAC &nbsp;&nbsp;|&nbsp;&nbsp; <%=carta.getDri() %> DRI<br> <%=carta.getSho() %> SHO   &nbsp;|&nbsp;&nbsp; <%=carta.getDef() %> DEF<br> <%=carta.getPas() %> PAS   &nbsp;&nbsp;|&nbsp;&nbsp; <%=carta.getPhy() %> PHY</div>
								</div>
							  </div>
							  <div class="b">
							  <% 
								
							   %>
								  <div class="grid-container2" >
									  <div class="grid-container2">
										  <div class="a2">PACE</div>
										  <div class="b2" style="<%=Utilidades.devolverColorXNum(carta.getPac())%>"><%=carta.getPac() %></div>
										  <div class="c2" style="<%=Utilidades.devolverEstilosXNum(carta.getPac()) %> width:<%=carta.getPac() %>%;"></div>
										  
										  <% 
											
										   %>
										  <div class="d2">SHOOTING</div>
										  <div class="e2" style="<%=Utilidades.devolverColorXNum(carta.getSho())%>"><%=carta.getSho() %></div>
										  <div class="f2" style="<%=Utilidades.devolverEstilosXNum(carta.getSho()) %> width:<%=carta.getSho() %>%;"></div>
										  <% 
											
										   %>
										  
										  <div class="g2">PASSING</div>
										  <div class="h2" style="<%=Utilidades.devolverColorXNum(carta.getPas()) %>"><%=carta.getPas() %></div>
										  <div class="i2" style="<%=Utilidades.devolverEstilosXNum(carta.getPas()) %> width:<%=carta.getPas() %>%;"></div>
										  <% 
											
										   %>
										  <div class="j2">DRIBBLING</div>
										  <div class="k2" style="<%=Utilidades.devolverColorXNum(carta.getDri())%>"><%=carta.getDri() %></div>
										  <div class="l2" style="<%=Utilidades.devolverEstilosXNum(carta.getDri()) %> width:<%=carta.getDri() %>%;"></div>
										  <% 
											
										   %>
										  <div class="m2">DEFENDING</div>
										  <div class="n2" style="<%=Utilidades.devolverColorXNum(carta.getDef())%>"><%=carta.getDef() %></div>
										  <div class="o2" style="<%=Utilidades.devolverEstilosXNum(carta.getDef()) %> width:<%=carta.getDef() %>%;"></div>
										  <% 
											
										   %>
										  <div class="p2">PHYSICALITY</div>
										  <div class="q2" style="<%=Utilidades.devolverColorXNum(carta.getPhy())%>"><%=carta.getPhy() %></div>
										  <div class="r2" style="<%=Utilidades.devolverEstilosXNum(carta.getPhy()) %> width:<%=carta.getPhy() %>%;"></div>
									</div>
								 </div>
							  </div>
							</div>
							<div class="grid-containerGeneral">
								<div class="c1"  style="padding-left:5px; padding-top:5px;text-align: center;">
									<table style="border-color:white; background-color:white;">
										<tr style="border-color:white; background-color:white;">
											<%
											ArrayList<Carta> cartasDeJuga = conexion.devolverCartasXNombreYCodJuga(carta.getNombre(), codJuga);
											
											for(int i = 0; i < cartasDeJuga.size(); i++) {
												out.print("<td style='border-color:white; background-color:white;'><a href = 'jugador.jsp?nombreCarta=" + cartasDeJuga.get(i).getNombre() + "&codJuga= " + codJuga + "'><div class='Simple' style='text-align: center;" + Utilidades.returnBGCXNomCarta(cartasDeJuga.get(i).getNombre()) + "'>" + cartasDeJuga.get(i).getRat() + "</div></a></td>");
											}
											%>
											
										</tr>
									</table>
								</div>
								
								
								<div class="b"></div>
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

</body>

</html>