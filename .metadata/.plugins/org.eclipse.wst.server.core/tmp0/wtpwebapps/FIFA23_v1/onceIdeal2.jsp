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
	<link rel="stylesheet" href="assets/css/style.css" />	
	
	<title>Proyecto Web FIFA23</title>
</head>

<body class="is-preload">
		<div id="page-wrapper">
		
		<%
		BDController conexion = new BDController();
		
		// Portero
		int codPortero = Integer.parseInt(request.getParameter("codPortero"));
		Jugador portero = conexion.dameJugador(codPortero);
		Carta cartaPortero = conexion.dameCarta("simple", codPortero);
		
		// Def central 1
		int codDefCentral1 = Integer.parseInt(request.getParameter("codDefCentral1"));
		Jugador defCentral1 = conexion.dameJugador(codDefCentral1);
		Carta cartaDefCentral1 = conexion.dameCarta("simple", codDefCentral1);
		
		// Def central 2
		int codDefCentral2 = Integer.parseInt(request.getParameter("codDefCentral2"));
		Jugador defCentral2 = conexion.dameJugador(codDefCentral2);
		Carta cartaDefCentral2 = conexion.dameCarta("simple", codDefCentral2);
		
		// Lateral derecho
		int codLatDer = Integer.parseInt(request.getParameter("codLatDer"));
		Jugador latDer = conexion.dameJugador(codLatDer);
		Carta cartaLatDer = conexion.dameCarta("simple", codLatDer);
		
		// Lateral izquierdo
		int codLatIzq = Integer.parseInt(request.getParameter("codLatIzq"));
		Jugador latIzq = conexion.dameJugador(codLatIzq);
		Carta cartaLatIzq = conexion.dameCarta("simple", codLatIzq);
		
		// Delantero 1
		int codDelantero1 = Integer.parseInt(request.getParameter("codDelantero1"));
		Jugador delantero1 = conexion.dameJugador(codDelantero1);
		Carta cartaDelantero1 = conexion.dameCarta("simple", codDelantero1);
		
		// Delantero 2
		int codDelantero2 = Integer.parseInt(request.getParameter("codDelantero2"));
		Jugador delantero2 = conexion.dameJugador(codDelantero2);
		Carta cartaDelantero2 = conexion.dameCarta("simple", codDelantero2);
		
		// Centrocampista 1
		int codCentrocampista1 = Integer.parseInt(request.getParameter("codCentrocampista1"));
		Jugador centrocampista1 = conexion.dameJugador(codCentrocampista1);
		Carta cartaCentrocampista1 = conexion.dameCarta("simple", codCentrocampista1);
		
		// Centrocampista 2
		int codCentrocampista2 = Integer.parseInt(request.getParameter("codCentrocampista2"));
		Jugador centrocampista2 = conexion.dameJugador(codCentrocampista2);
		Carta cartaCentrocampista2 = conexion.dameCarta("simple", codCentrocampista2);
		
		// Extremo izquierda
		int codExtIzq = Integer.parseInt(request.getParameter("codExtIzq"));
		Jugador extIzq = conexion.dameJugador(codExtIzq);
		Carta cartaExtIzq = conexion.dameCarta("simple", codExtIzq);
		
		// Extremo derecha
		int codExtDer = Integer.parseInt(request.getParameter("codExtDer"));
		Jugador extDer = conexion.dameJugador(codExtDer);
		Carta cartaExtDer = conexion.dameCarta("simple", codExtDer);
		
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

    			<!-- TODO -->
    			<main class="wrapper style1">
        			<section class="campo">
            			
            			<!-- Portero -->
            			<div class="grid-container juga portero" style="background-image: url('images/cartas/<%=cartaPortero.getNombre()%>.png');">
							<div class="A"><%=cartaPortero.getRat() %></div>
							<div class="B"><%=cartaPortero.getPos() %></div>
							<div class="C"><img src = 'images/paises/<%=portero.getPais() %>.png' style="width: 100%; position: relative; float: right; padding-left: 2.25rem;"></div>
							<div class="D"><img src = 'images/equipos/<%=portero.getCod_equipo() %>.png' style="width: 100%; position: relative; float: right; padding-left: 2.35rem;"></div>
							<div class="E"><img src = 'images/jugadores/<%=portero.getCod_jugador() %>.png' style="width: 100%; position: relative; float: left; padding-right: 1rem;"></div>
							<div class="F"><%=portero.getNombre() %></div>
							<div class="G"><%=cartaPortero.getPac() %> PAC &nbsp;&nbsp;|&nbsp;&nbsp; <%=cartaPortero.getDri() %> DRI<br> <%=cartaPortero.getSho() %> SHO   &nbsp;|&nbsp;&nbsp; <%=cartaPortero.getDef() %> DEF<br> <%=cartaPortero.getPas() %> PAS   &nbsp;&nbsp;|&nbsp;&nbsp; <%=cartaPortero.getPhy() %> PHY</div>
						</div>
            			
            			<!-- Def central 1 -->
            			<div class="grid-container juga defCentral1" style="background-image: url('images/cartas/<%=cartaDefCentral1.getNombre()%>.png');">
							<div class="A"><%=cartaDefCentral1.getRat() %></div>
							<div class="B"><%=cartaDefCentral1.getPos() %></div>
							<div class="C"><img src = 'images/paises/<%=defCentral1.getPais() %>.png' style="width: 100%; position: relative; float: right; padding-left: 2.25rem;"></div>
							<div class="D"><img src = 'images/equipos/<%=defCentral1.getCod_equipo() %>.png' style="width: 100%; position: relative; float: right; padding-left: 2.35rem;"></div>
							<div class="E"><img src = 'images/jugadores/<%=defCentral1.getCod_jugador() %>.png' style="width: 100%; position: relative; float: left; padding-right: 1rem;"></div>
							<div class="F"><%=defCentral1.getNombre() %></div>
							<div class="G"><%=cartaDefCentral1.getPac() %> PAC &nbsp;&nbsp;|&nbsp;&nbsp; <%=cartaDefCentral1.getDri() %> DRI<br> <%=cartaDefCentral1.getSho() %> SHO   &nbsp;|&nbsp;&nbsp; <%=cartaDefCentral1.getDef() %> DEF<br> <%=cartaDefCentral1.getPas() %> PAS   &nbsp;&nbsp;|&nbsp;&nbsp; <%=cartaDefCentral1.getPhy() %> PHY</div>
						</div>
            			
            			<!-- Def central 2 -->
            			<div class="grid-container juga defCentral2" style="background-image: url('images/cartas/<%=cartaDefCentral2.getNombre()%>.png');">
							<div class="A"><%=cartaDefCentral2.getRat() %></div>
							<div class="B"><%=cartaDefCentral2.getPos() %></div>
							<div class="C"><img src = 'images/paises/<%=defCentral2.getPais() %>.png' style="width: 100%; position: relative; float: right; padding-left: 2.25rem;"></div>
							<div class="D"><img src = 'images/equipos/<%=defCentral2.getCod_equipo() %>.png' style="width: 100%; position: relative; float: right; padding-left: 2.35rem;"></div>
							<div class="E"><img src = 'images/jugadores/<%=defCentral2.getCod_jugador() %>.png' style="width: 100%; position: relative; float: left; padding-right: 1rem;"></div>
							<div class="F"><%=defCentral2.getNombre() %></div>
							<div class="G"><%=cartaDefCentral2.getPac() %> PAC &nbsp;&nbsp;|&nbsp;&nbsp; <%=cartaDefCentral2.getDri() %> DRI<br> <%=cartaDefCentral2.getSho() %> SHO   &nbsp;|&nbsp;&nbsp; <%=cartaDefCentral2.getDef() %> DEF<br> <%=cartaDefCentral2.getPas() %> PAS   &nbsp;&nbsp;|&nbsp;&nbsp; <%=cartaDefCentral2.getPhy() %> PHY</div>
						</div>
            			
            			<!-- Lateral derecho -->
            			<div class="grid-container juga latDer" style="background-image: url('images/cartas/<%=cartaLatDer.getNombre()%>.png');">
							<div class="A"><%=cartaLatDer.getRat() %></div>
							<div class="B"><%=cartaLatDer.getPos() %></div>
							<div class="C"><img src = 'images/paises/<%=latDer.getPais() %>.png' style="width: 100%; position: relative; float: right; padding-left: 2.25rem;"></div>
							<div class="D"><img src = 'images/equipos/<%=latDer.getCod_equipo() %>.png' style="width: 100%; position: relative; float: right; padding-left: 2.35rem;"></div>
							<div class="E"><img src = 'images/jugadores/<%=latDer.getCod_jugador() %>.png' style="width: 100%; position: relative; float: left; padding-right: 1rem;"></div>
							<div class="F"><%=latDer.getNombre() %></div>
							<div class="G"><%=cartaLatDer.getPac() %> PAC &nbsp;&nbsp;|&nbsp;&nbsp; <%=cartaLatDer.getDri() %> DRI<br> <%=cartaLatDer.getSho() %> SHO   &nbsp;|&nbsp;&nbsp; <%=cartaLatDer.getDef() %> DEF<br> <%=cartaLatDer.getPas() %> PAS   &nbsp;&nbsp;|&nbsp;&nbsp; <%=cartaLatDer.getPhy() %> PHY</div>
						</div>
            			
            			<!-- Lateral Izquierdo -->
            			<div class="grid-container juga latIzq" style="background-image: url('images/cartas/<%=cartaLatIzq.getNombre()%>.png');">
							<div class="A"><%=cartaLatIzq.getRat() %></div>
							<div class="B"><%=cartaLatIzq.getPos() %></div>
							<div class="C"><img src = 'images/paises/<%=latIzq.getPais() %>.png' style="width: 100%; position: relative; float: right; padding-left: 2.25rem;"></div>
							<div class="D"><img src = 'images/equipos/<%=latIzq.getCod_equipo() %>.png' style="width: 100%; position: relative; float: right; padding-left: 2.35rem;"></div>
							<div class="E"><img src = 'images/jugadores/<%=latIzq.getCod_jugador() %>.png' style="width: 100%; position: relative; float: left; padding-right: 1rem;"></div>
							<div class="F"><%=latIzq.getNombre() %></div>
							<div class="G"><%=cartaLatIzq.getPac() %> PAC &nbsp;&nbsp;|&nbsp;&nbsp; <%=cartaLatIzq.getDri() %> DRI<br> <%=cartaLatIzq.getSho() %> SHO   &nbsp;|&nbsp;&nbsp; <%=cartaLatIzq.getDef() %> DEF<br> <%=cartaLatIzq.getPas() %> PAS   &nbsp;&nbsp;|&nbsp;&nbsp; <%=cartaLatIzq.getPhy() %> PHY</div>
						</div>
            			
            			<!-- Delantero 1 -->
            			<div class="grid-container juga delantero1" style="background-image: url('images/cartas/<%=cartaDelantero1.getNombre()%>.png');">
							<div class="A"><%=cartaDelantero1.getRat() %></div>
							<div class="B"><%=cartaDelantero1.getPos() %></div>
							<div class="C"><img src = 'images/paises/<%=delantero1.getPais() %>.png' style="width: 100%; position: relative; float: right; padding-left: 2.25rem;"></div>
							<div class="D"><img src = 'images/equipos/<%=delantero1.getCod_equipo() %>.png' style="width: 100%; position: relative; float: right; padding-left: 2.35rem;"></div>
							<div class="E"><img src = 'images/jugadores/<%=delantero1.getCod_jugador() %>.png' style="width: 100%; position: relative; float: left; padding-right: 1rem;"></div>
							<div class="F"><%=delantero1.getNombre() %></div>
							<div class="G"><%=cartaDelantero1.getPac() %> PAC &nbsp;&nbsp;|&nbsp;&nbsp; <%=cartaDelantero1.getDri() %> DRI<br> <%=cartaDelantero1.getSho() %> SHO   &nbsp;|&nbsp;&nbsp; <%=cartaDelantero1.getDef() %> DEF<br> <%=cartaDelantero1.getPas() %> PAS   &nbsp;&nbsp;|&nbsp;&nbsp; <%=cartaDelantero1.getPhy() %> PHY</div>
						</div>
            			
            			<!-- Delantero 2 -->
            			<div class="grid-container juga delantero2" style="background-image: url('images/cartas/<%=cartaDelantero2.getNombre()%>.png');">
							<div class="A"><%=cartaDelantero2.getRat() %></div>
							<div class="B"><%=cartaDelantero2.getPos() %></div>
							<div class="C"><img src = 'images/paises/<%=delantero2.getPais() %>.png' style="width: 100%; position: relative; float: right; padding-left: 2.25rem;"></div>
							<div class="D"><img src = 'images/equipos/<%=delantero2.getCod_equipo() %>.png' style="width: 100%; position: relative; float: right; padding-left: 2.35rem;"></div>
							<div class="E"><img src = 'images/jugadores/<%=delantero2.getCod_jugador() %>.png' style="width: 100%; position: relative; float: left; padding-right: 1rem;"></div>
							<div class="F"><%=delantero2.getNombre() %></div>
							<div class="G"><%=cartaDelantero2.getPac() %> PAC &nbsp;&nbsp;|&nbsp;&nbsp; <%=cartaDelantero2.getDri() %> DRI<br> <%=cartaDelantero2.getSho() %> SHO   &nbsp;|&nbsp;&nbsp; <%=cartaDelantero2.getDef() %> DEF<br> <%=cartaDelantero2.getPas() %> PAS   &nbsp;&nbsp;|&nbsp;&nbsp; <%=cartaDelantero2.getPhy() %> PHY</div>
						</div>
            			
            			<!-- Centrocampista 1 -->
            			<div class="grid-container juga centro1" style="background-image: url('images/cartas/<%=cartaCentrocampista1.getNombre()%>.png');">
							<div class="A"><%=cartaCentrocampista1.getRat() %></div>
							<div class="B"><%=cartaCentrocampista1.getPos() %></div>
							<div class="C"><img src = 'images/paises/<%=centrocampista1.getPais() %>.png' style="width: 100%; position: relative; float: right; padding-left: 2.25rem;"></div>
							<div class="D"><img src = 'images/equipos/<%=centrocampista1.getCod_equipo() %>.png' style="width: 100%; position: relative; float: right; padding-left: 2.35rem;"></div>
							<div class="E"><img src = 'images/jugadores/<%=centrocampista1.getCod_jugador() %>.png' style="width: 100%; position: relative; float: left; padding-right: 1rem;"></div>
							<div class="F"><%=centrocampista1.getNombre() %></div>
							<div class="G"><%=cartaCentrocampista1.getPac() %> PAC &nbsp;&nbsp;|&nbsp;&nbsp; <%=cartaCentrocampista1.getDri() %> DRI<br> <%=cartaCentrocampista1.getSho() %> SHO   &nbsp;|&nbsp;&nbsp; <%=cartaCentrocampista1.getDef() %> DEF<br> <%=cartaCentrocampista1.getPas() %> PAS   &nbsp;&nbsp;|&nbsp;&nbsp; <%=cartaCentrocampista1.getPhy() %> PHY</div>
						</div>
            			
            			<!-- Centrocampista 2 -->
            			<div class="grid-container juga centro2" style="background-image: url('images/cartas/<%=cartaCentrocampista2.getNombre()%>.png');">
							<div class="A"><%=cartaCentrocampista2.getRat() %></div>
							<div class="B"><%=cartaCentrocampista2.getPos() %></div>
							<div class="C"><img src = 'images/paises/<%=centrocampista2.getPais() %>.png' style="width: 100%; position: relative; float: right; padding-left: 2.25rem;"></div>
							<div class="D"><img src = 'images/equipos/<%=centrocampista2.getCod_equipo() %>.png' style="width: 100%; position: relative; float: right; padding-left: 2.35rem;"></div>
							<div class="E"><img src = 'images/jugadores/<%=centrocampista2.getCod_jugador() %>.png' style="width: 100%; position: relative; float: left; padding-right: 1rem;"></div>
							<div class="F"><%=centrocampista2.getNombre() %></div>
							<div class="G"><%=cartaCentrocampista2.getPac() %> PAC &nbsp;&nbsp;|&nbsp;&nbsp; <%=cartaCentrocampista2.getDri() %> DRI<br> <%=cartaCentrocampista2.getSho() %> SHO   &nbsp;|&nbsp;&nbsp; <%=cartaCentrocampista2.getDef() %> DEF<br> <%=cartaCentrocampista2.getPas() %> PAS   &nbsp;&nbsp;|&nbsp;&nbsp; <%=cartaCentrocampista2.getPhy() %> PHY</div>
						</div>
            			
            			<!-- Extremo izq -->
            			<div class="grid-container juga extIzq" style="background-image: url('images/cartas/<%=cartaExtIzq.getNombre()%>.png');">
							<div class="A"><%=cartaExtIzq.getRat() %></div>
							<div class="B"><%=cartaExtIzq.getPos() %></div>
							<div class="C"><img src = 'images/paises/<%=extIzq.getPais() %>.png' style="width: 100%; position: relative; float: right; padding-left: 2.25rem;"></div>
							<div class="D"><img src = 'images/equipos/<%=extIzq.getCod_equipo() %>.png' style="width: 100%; position: relative; float: right; padding-left: 2.35rem;"></div>
							<div class="E"><img src = 'images/jugadores/<%=extIzq.getCod_jugador() %>.png' style="width: 100%; position: relative; float: left; padding-right: 1rem;"></div>
							<div class="F"><%=extIzq.getNombre() %></div>
							<div class="G"><%=cartaExtIzq.getPac() %> PAC &nbsp;&nbsp;|&nbsp;&nbsp; <%=cartaExtIzq.getDri() %> DRI<br> <%=cartaExtIzq.getSho() %> SHO   &nbsp;|&nbsp;&nbsp; <%=cartaExtIzq.getDef() %> DEF<br> <%=cartaExtIzq.getPas() %> PAS   &nbsp;&nbsp;|&nbsp;&nbsp; <%=cartaExtIzq.getPhy() %> PHY</div>
						</div>
            			
            			<!-- Extremo der -->
            			<div class="grid-container juga extDer" style="background-image: url('images/cartas/<%=cartaExtDer.getNombre()%>.png');">
							<div class="A"><%=cartaExtDer.getRat() %></div>
							<div class="B"><%=cartaExtDer.getPos() %></div>
							<div class="C"><img src = 'images/paises/<%=extDer.getPais() %>.png' style="width: 100%; position: relative; float: right; padding-left: 2.25rem;"></div>
							<div class="D"><img src = 'images/equipos/<%=extDer.getCod_equipo() %>.png' style="width: 100%; position: relative; float: right; padding-left: 2.35rem;"></div>
							<div class="E"><img src = 'images/jugadores/<%=extDer.getCod_jugador() %>.png' style="width: 100%; position: relative; float: left; padding-right: 1rem;"></div>
							<div class="F"><%=extDer.getNombre() %></div>
							<div class="G"><%=cartaExtDer.getPac() %> PAC &nbsp;&nbsp;|&nbsp;&nbsp; <%=cartaExtDer.getDri() %> DRI<br> <%=cartaExtDer.getSho() %> SHO   &nbsp;|&nbsp;&nbsp; <%=cartaExtDer.getDef() %> DEF<br> <%=cartaExtDer.getPas() %> PAS   &nbsp;&nbsp;|&nbsp;&nbsp; <%=cartaExtDer.getPhy() %> PHY</div>
						</div>
            			
       				</section>
    			</main>
										
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
