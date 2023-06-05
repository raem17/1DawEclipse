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
	<!-- 1 -->
	<link rel="stylesheet" href="assets/css/mainPersonal.css" />	
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/select2/4.0.5/css/select2.css" />
	
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
				<section class="wrapper style1"">
					<div class="container">
						<div id="content">

							<!-- Content -->
							
								<article>
									
								<section class="col-6 col-12-narrower">
								<h3>Elige a tu 11 ideal:</h3>
								
								<!-- Formulario -->
								<%
								BDController conexion = new BDController();
								
								ArrayList<Jugador> porteros = conexion.damePorteros();
								ArrayList<Jugador> defCentrales = conexion.dameDefensasCentrales();
								ArrayList<Jugador> latDrc = conexion.dameLateralesDerechos();
								ArrayList<Jugador> latIzq = conexion.dameLateralesIzquierdos();
								ArrayList<Jugador> delanteros = conexion.dameDelanteros();
								ArrayList<Jugador> centrocampistas = conexion.dameCentrocampistas();
								ArrayList<Jugador> extremosIzq = conexion.dameExtremosIzqdos();
								ArrayList<Jugador> extremosDrc = conexion.dameExtremosDrchos();
								%>
								
								<form action="onceIdeal2.jsp" method="post">
									<div class="row gtr-50">
									
										<!-- INICIO -->
										<div class="">
										
											<!-- Portero -->
											<label>Portero:</label>
											<select id="codPortero" name="codPortero">
											<%
											for(int i = 0; i < porteros.size(); i++) { %>
												<option data-img_src="images/jugadores/<%=porteros.get(i).getCod_jugador() %>.png" value="<%=porteros.get(i).getCod_jugador()%>"><%=porteros.get(i).getNombre() %></option>
											<%}; %>
											</select>
										
											<!-- Delantero 1 -->
											<label>Delantero 1:</label>
											<select id="codDelantero1" name="codDelantero1">
											<%
											for(int i = 0; i < delanteros.size(); i++) { %>
												<option data-img_src="images/jugadores/<%=delanteros.get(i).getCod_jugador() %>.png" value="<%=delanteros.get(i).getCod_jugador()%>"><%=delanteros.get(i).getNombre() %></option>
											<%}; %>
											</select>
											
										</div>
										
										<div class="">
											<!-- Defensa central 1 -->
											<label>Defensa central 1:</label>
											<select id="codDefCentral1" name="codDefCentral1">
											<%
											for(int i = 0; i < defCentrales.size(); i++) { %>
												<option data-img_src="images/jugadores/<%=defCentrales.get(i).getCod_jugador() %>.png" value="<%=defCentrales.get(i).getCod_jugador()%>"><%=defCentrales.get(i).getNombre() %></option>
											<%}; %>
											</select>
											
											<!-- Delantero 2 -->
											<label>Delantero 2:</label>
											<select id="codDelantero2" name="codDelantero2">
											<%
											for(int i = 0; i < delanteros.size(); i++) { %>
												<option data-img_src="images/jugadores/<%=delanteros.get(i).getCod_jugador() %>.png" value="<%=delanteros.get(i).getCod_jugador()%>"><%=delanteros.get(i).getNombre() %></option>
											<%}; %>
											</select>
											
										</div>
										
										<div class="">
											<!-- Defensa central 2 -->
											<label>Defensa central 2:</label>
											<select id="codDefCentral2" name="codDefCentral2">
											<%
											for(int i = 0; i < defCentrales.size(); i++) { %>
												<option data-img_src="images/jugadores/<%=defCentrales.get(i).getCod_jugador() %>.png" value="<%=defCentrales.get(i).getCod_jugador()%>"><%=defCentrales.get(i).getNombre() %></option>
											<%}; %>
											</select>
											
											<!-- Centrocampista 1 -->
											<label>Centrocampista 1:</label>
											<select id="codCentrocampista1" name="codCentrocampista1">
											<%
											for(int i = 0; i < centrocampistas.size(); i++) { %>
												<option data-img_src="images/jugadores/<%=centrocampistas.get(i).getCod_jugador() %>.png" value="<%=centrocampistas.get(i).getCod_jugador()%>"><%=centrocampistas.get(i).getNombre() %></option>
											<%}; %>
											</select>
											
										</div>
										
										<div class="">
											<!-- Lateral derecho -->
											<label>Lateral derecho:</label>
											<select id="codLatDer" name="codLatDer">
											<%
											for(int i = 0; i < latDrc.size(); i++) { %>
												<option data-img_src="images/jugadores/<%=latDrc.get(i).getCod_jugador() %>.png" value="<%=latDrc.get(i).getCod_jugador()%>"><%=latDrc.get(i).getNombre() %></option>
											<%}; %>
											</select>
																						
											<!-- Centrocampista 2 -->
											<label>Centrocampista 2:</label>
											<select id="codCentrocampista2" name="codCentrocampista2">
											<%
											for(int i = 0; i < centrocampistas.size(); i++) { %>
												<option data-img_src="images/jugadores/<%=centrocampistas.get(i).getCod_jugador() %>.png" value="<%=centrocampistas.get(i).getCod_jugador()%>"><%=centrocampistas.get(i).getNombre() %></option>
											<%}; %>
											</select>
											
										</div>
										
										<div class="">
											<!-- Lateral izquierdo -->
											<label>Lateral izquierdo:</label>
											<select id="codLatIzq" name="codLatIzq">
											<%
											for(int i = 0; i < latIzq.size(); i++) { %>
												<option data-img_src="images/jugadores/<%=latIzq.get(i).getCod_jugador() %>.png" value="<%=latIzq.get(i).getCod_jugador()%>"><%=latIzq.get(i).getNombre() %></option>
											<%}; %>
											</select>
											
											<!-- Extremo izquierdo -->
											<label>Extremo izquierdo:</label>
											<select id="codExtIzq" name="codExtIzq">
											<%
											for(int i = 0; i < extremosIzq.size(); i++) { %>
												<option data-img_src="images/jugadores/<%=extremosIzq.get(i).getCod_jugador() %>.png" value="<%=extremosIzq.get(i).getCod_jugador()%>"><%=extremosIzq.get(i).getNombre() %></option>
											<%}; %>
											</select>
											
										</div>
										
										<div class="">
											<!-- Extremo derecho -->
											<label>Extremo derecho:</label>
											<select id="codExtDer" name="codExtDer">
											<%
											for(int i = 0; i < extremosDrc.size(); i++) { %>
												<option data-img_src="images/jugadores/<%=extremosDrc.get(i).getCod_jugador() %>.png" value="<%=extremosDrc.get(i).getCod_jugador()%>"><%=extremosDrc.get(i).getNombre() %></option>
											<%}; %>
											</select>
											
										</div>
										
										<!-- FIN -->
									</div>
									
									<div style="padding-top:22px;">
											<ul class="actions">
												<li><input type="submit" class="button alt" value="Siguiente" /></li>
											</ul>
									</div>
									
								</form>
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
			
	<!-- 4 -->
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/select2/4.0.5/js/select2.js"></script>
	
	<!-- Inicio -->
	
	<script type="text/javascript">
    	function custom_template(obj){
            var data = $(obj.element).data();
            var text = $(obj.element).text();
            if(data && data['img_src']){
                img_src = data['img_src'];
                template = $("<div style=\"display:flex; align-items: center;\"><img src=\"" + img_src + "\" style=\"width:80px; height:60px; padding-right:1rem\"/><p style=\"font-weight:700; font-size:14pt; \">" + text + "</p></div>");
                return template;
            }
        }
    	var options = {
        'templateSelection': custom_template,
        'templateResult': custom_template,
    	}
    	$('#codPortero').select2(options);
    	$('.select2-container--default .select2-selection--single').css({'height': '65px'});
	</script>
	
	<script type="text/javascript">
    	function custom_template(obj){
            var data = $(obj.element).data();
            var text = $(obj.element).text();
            if(data && data['img_src']){
                img_src = data['img_src'];
                template = $("<div style=\"display:flex; align-items: center;\"><img src=\"" + img_src + "\" style=\"width:80px; height:60px; padding-right:1rem\"/><p style=\"font-weight:700; font-size:14pt; \">" + text + "</p></div>");
                return template;
            }
        }
    	var options = {
        'templateSelection': custom_template,
        'templateResult': custom_template,
    	}
    	$('#codDefCentral1').select2(options);
    	$('.select2-container--default .select2-selection--single').css({'height': '65px'});
	</script>
	
	<script type="text/javascript">
    	function custom_template(obj){
            var data = $(obj.element).data();
            var text = $(obj.element).text();
            if(data && data['img_src']){
                img_src = data['img_src'];
                template = $("<div style=\"display:flex; align-items: center;\"><img src=\"" + img_src + "\" style=\"width:80px; height:60px; padding-right:1rem\"/><p style=\"font-weight:700; font-size:14pt; \">" + text + "</p></div>");
                return template;
            }
        }
    	var options = {
        'templateSelection': custom_template,
        'templateResult': custom_template,
    	}
    	$('#codDefCentral2').select2(options);
    	$('.select2-container--default .select2-selection--single').css({'height': '65px'});
	</script>
	
	<script type="text/javascript">
    	function custom_template(obj){
            var data = $(obj.element).data();
            var text = $(obj.element).text();
            if(data && data['img_src']){
                img_src = data['img_src'];
                template = $("<div style=\"display:flex; align-items: center;\"><img src=\"" + img_src + "\" style=\"width:80px; height:60px; padding-right:1rem\"/><p style=\"font-weight:700; font-size:14pt; \">" + text + "</p></div>");
                return template;
            }
        }
    	var options = {
        'templateSelection': custom_template,
        'templateResult': custom_template,
    	}
    	$('#codLatDer').select2(options);
    	$('.select2-container--default .select2-selection--single').css({'height': '65px'});
	</script>
	
	<script type="text/javascript">
    	function custom_template(obj){
            var data = $(obj.element).data();
            var text = $(obj.element).text();
            if(data && data['img_src']){
                img_src = data['img_src'];
                template = $("<div style=\"display:flex; align-items: center;\"><img src=\"" + img_src + "\" style=\"width:80px; height:60px; padding-right:1rem\"/><p style=\"font-weight:700; font-size:14pt; \">" + text + "</p></div>");
                return template;
            }
        }
    	var options = {
        'templateSelection': custom_template,
        'templateResult': custom_template,
    	}
    	$('#codLatIzq').select2(options);
    	$('.select2-container--default .select2-selection--single').css({'height': '65px'});
	</script>
	
	<script type="text/javascript">
    	function custom_template(obj){
            var data = $(obj.element).data();
            var text = $(obj.element).text();
            if(data && data['img_src']){
                img_src = data['img_src'];
                template = $("<div style=\"display:flex; align-items: center;\"><img src=\"" + img_src + "\" style=\"width:80px; height:60px; padding-right:1rem\"/><p style=\"font-weight:700; font-size:14pt; \">" + text + "</p></div>");
                return template;
            }
        }
    	var options = {
        'templateSelection': custom_template,
        'templateResult': custom_template,
    	}
    	$('#codDelantero1').select2(options);
    	$('.select2-container--default .select2-selection--single').css({'height': '65px'});
	</script>
	
	<script type="text/javascript">
    	function custom_template(obj){
            var data = $(obj.element).data();
            var text = $(obj.element).text();
            if(data && data['img_src']){
                img_src = data['img_src'];
                template = $("<div style=\"display:flex; align-items: center;\"><img src=\"" + img_src + "\" style=\"width:80px; height:60px; padding-right:1rem\"/><p style=\"font-weight:700; font-size:14pt; \">" + text + "</p></div>");
                return template;
            }
        }
    	var options = {
        'templateSelection': custom_template,
        'templateResult': custom_template,
    	}
    	$('#codDelantero2').select2(options);
    	$('.select2-container--default .select2-selection--single').css({'height': '65px'});
	</script>
	
	<script type="text/javascript">
    	function custom_template(obj){
            var data = $(obj.element).data();
            var text = $(obj.element).text();
            if(data && data['img_src']){
                img_src = data['img_src'];
                template = $("<div style=\"display:flex; align-items: center;\"><img src=\"" + img_src + "\" style=\"width:80px; height:60px; padding-right:1rem\"/><p style=\"font-weight:700; font-size:14pt; \">" + text + "</p></div>");
                return template;
            }
        }
    	var options = {
        'templateSelection': custom_template,
        'templateResult': custom_template,
    	}
    	$('#codCentrocampista1').select2(options);
    	$('.select2-container--default .select2-selection--single').css({'height': '65px'});
	</script>
	
	<script type="text/javascript">
    	function custom_template(obj){
            var data = $(obj.element).data();
            var text = $(obj.element).text();
            if(data && data['img_src']){
                img_src = data['img_src'];
                template = $("<div style=\"display:flex; align-items: center;\"><img src=\"" + img_src + "\" style=\"width:80px; height:60px; padding-right:1rem\"/><p style=\"font-weight:700; font-size:14pt; \">" + text + "</p></div>");
                return template;
            }
        }
    	var options = {
        'templateSelection': custom_template,
        'templateResult': custom_template,
    	}
    	$('#codCentrocampista2').select2(options);
    	$('.select2-container--default .select2-selection--single').css({'height': '65px'});
	</script>
	
	<script type="text/javascript">
    	function custom_template(obj){
            var data = $(obj.element).data();
            var text = $(obj.element).text();
            if(data && data['img_src']){
                img_src = data['img_src'];
                template = $("<div style=\"display:flex; align-items: center;\"><img src=\"" + img_src + "\" style=\"width:80px; height:60px; padding-right:1rem\"/><p style=\"font-weight:700; font-size:14pt; \">" + text + "</p></div>");
                return template;
            }
        }
    	var options = {
        'templateSelection': custom_template,
        'templateResult': custom_template,
    	}
    	$('#codExtIzq').select2(options);
    	$('.select2-container--default .select2-selection--single').css({'height': '65px'});
	</script>
	
	<script type="text/javascript">
    	function custom_template(obj){
            var data = $(obj.element).data();
            var text = $(obj.element).text();
            if(data && data['img_src']){
                img_src = data['img_src'];
                template = $("<div style=\"display:flex; align-items: center;\"><img src=\"" + img_src + "\" style=\"width:80px; height:60px; padding-right:1rem\"/><p style=\"font-weight:700; font-size:14pt; \">" + text + "</p></div>");
                return template;
            }
        }
    	var options = {
        'templateSelection': custom_template,
        'templateResult': custom_template,
    	}
    	$('#codExtDer').select2(options);
    	$('.select2-container--default .select2-selection--single').css({'height': '65px'});
	</script>

	<!-- Fin -->

</body>

</html>