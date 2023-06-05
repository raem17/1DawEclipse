<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.util.*" %>
    <%@ page import = "Pelicula.*" %>
<!DOCTYPE HTML>
<!--
Plantilla utilizada para prÃ¡cticas de ProgramaciÃ³n, Centro Nelson.
-->

<html>
	<head>
		<title>Práctica Programación</title>
		<meta charset="ISO-8859-1">
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<link rel="stylesheet" href="assets/css/main.css" />
	</head>
	<body class="is-preload">

		<!-- Header -->
			<header id="header">
				<a class="logo" href="index.html">Centro Nelson</a>
				<nav>
					<a href="#menu">Menú</a>
				</nav>
			</header>

		<!-- Nav -->
			<nav id="menu">
				<ul class="links">
					<li><a href="index.html">Inicio</a></li>
					<li><a href="">Enlace 1</a></li>
					<li><a href="">Enlace 2</a></li>
				</ul>
			</nav>

		<!-- Heading -->
			<div id="heading" >
				<h1>Práctica Peliculas</h1>
			</div>

		<!-- Main -->
			<section id="main" class="wrapper">
				<div class="inner">
					<div class="content">
						<header>
							<h2>Listado de Peliculas del archivo peliculas.txt</h2>
						</header>
						<!--  -->
						<%ArrayList<Pelicula> datosPelis = Main.devolverArrayPeliculas(); %>
						<%
						for (int i = 0; i < datosPelis.size(); i++) {
							out.print("<div class='pelicula'>");
							
							out.print("<h3><b>" + datosPelis.get(i).getTitulo() + "</b></h3>");
							out.print("<img src = 'images/caratulas/" + datosPelis.get(i).getCodigo() + ".jpg' style='float: right; position: relative; width: 20%;'>");
							out.print("<p><b>Año: " + datosPelis.get(i).getYear() + "</b></p>");
							out.print("<p><b>Duración: " + datosPelis.get(i).getDuracion() + " min</b></p>");
							
							// Pendiente
							out.print("<p><b>País:</b><span> <img src = 'images/banderas/" + datosPelis.get(i).getPais().replace(" ", "").toLowerCase() + ".png' style=\"width: 18px; height: 12px\"> </span></p>");
							out.print("<p><b>Dirección: " + datosPelis.get(i).getDireccion() + "</b></p>");
							out.print("<p><b>Guión: " + datosPelis.get(i).getGuion() + "</b></p>");
							out.print("<p><b>Fotografia: " + datosPelis.get(i).getFotografia() + "</b></p>");
							out.print("<p><b>Reparto: " + datosPelis.get(i).getReparto() + "</b></p>");
							
							out.print("</div>");
							out.print("<hr>");
						}
							
						%>
						<!--  -->
					</div>
				</div>
			</section>

		<!-- Footer -->
			<footer id="footer">
				<div class="inner">
					<div class="content">
						<section>
							<h3>Accumsan montes viverra</h3>
							<p>Nunc lacinia ante nunc ac lobortis. Interdum adipiscing gravida odio porttitor sem non mi integer non faucibus ornare mi ut ante amet placerat aliquet. Volutpat eu sed ante lacinia sapien lorem accumsan varius montes viverra nibh in adipiscing. Lorem ipsum dolor vestibulum ante ipsum primis in faucibus vestibulum. Blandit adipiscing eu felis iaculis volutpat ac adipiscing sed feugiat eu faucibus. Integer ac sed amet praesent. Nunc lacinia ante nunc ac gravida.</p>
						</section>
						<section>
							<h4>Sem turpis amet semper</h4>
							<ul class="alt">
								<li><a href="#">Dolor pulvinar sed etiam.</a></li>
								<li><a href="#">Etiam vel lorem sed amet.</a></li>
								<li><a href="#">Felis enim feugiat viverra.</a></li>
								<li><a href="#">Dolor pulvinar magna etiam.</a></li>
							</ul>
						</section>
						<section>
							<h4>Magna sed ipsum</h4>
							<ul class="plain">
								<li><a href="#"><i class="icon fa-twitter">&nbsp;</i>Twitter</a></li>
								<li><a href="#"><i class="icon fa-facebook">&nbsp;</i>Facebook</a></li>
								<li><a href="#"><i class="icon fa-instagram">&nbsp;</i>Instagram</a></li>
								<li><a href="#"><i class="icon fa-github">&nbsp;</i>Github</a></li>
							</ul>
						</section>
					</div>
					<div class="copyright">
						&copy;  <a href="https://www.centronelson.org">Centro Nelson</a>.
					</div>
				</div>
			</footer>

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/browser.min.js"></script>
			<script src="assets/js/breakpoints.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main.js"></script>

	</body>
</html>