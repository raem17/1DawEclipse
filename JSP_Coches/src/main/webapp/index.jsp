<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "Coches.*" %>
    <%@ page import = "java.util.*" %>
    <%
    

    %>
<!DOCTYPE html>
<html>
<head>
<title>Tabla de datos</title>
<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />

</head>
<body>
<!-- Header -->
<%
ArrayList<Coche> datosCoches = Main.devolverArrayCoches();
out.print(datosCoches.size()); 
%>

<div id="header">
  <div class="shell">
    <!-- Logo + Top Nav -->
    <div id="top">
      <h1><a href="#">Tabla de datos</a></h1>
      <div id="top-navigation"><a href="#"><strong></strong></a> <span>|</span> <a href="#"></a> <span>|</span> <a href="#"></a> <span>|</span> <a href="#"></a> </div>
    </div>
   
  </div>
</div>
<!-- End Header -->
<!-- Container -->
<div id="container">
  <div class="shell">
 
    
    <br />
    <!-- Main -->
    <div id="main">
      <div class="cl">&nbsp;</div>
      <!-- Content -->
      <div id="content">
        <!-- Box -->
        <div class="box">
          <!-- Box Head -->
          <div class="box-head">
            <h2 class="left">Listado de coches</h2>
            
          </div>
          <!-- End Box Head -->
          <!-- Table -->
          <div class="table">
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <th>Matrícula</th>
                <th>Marca</th>
                <th>Modelo</th>
                <th>Color</th>
                <th>Precio</th>
                <th>Complementos</th>
              </tr>
              <!-- tr y td -->
              <%
              
              for(int i = 0; i < datosCoches.size(); i++) {
            	  out.print("<tr>");
            	  
            	  out.print("<td>" + datosCoches.get(i).getMatricula() + "</td>");
            	  out.print("<td>" + datosCoches.get(i).getMarca() + "</td>");
            	  out.print("<td>" + datosCoches.get(i).getModelo() + "</td>");
            	  out.print("<td>" + datosCoches.get(i).getColor() + "</td>");
            	  out.print("<td>" + datosCoches.get(i).getPrecio() + "</td>");
            	  out.print("<td>" + datosCoches.get(i).getComplementos() + "</td>");
            	  
            	  out.print("<td>");
              }
              
              %>
              <!--  -->
            </table>
            <!-- Pagging -->
            <div class="pagging">
              <div class="left"></div>
              <div class="right">  </div>
            </div>
            <!-- End Pagging -->
          </div>
          <!-- Table -->
        </div>
        <!-- End Box -->
        
      </div>
      <!-- End Content -->
      <!-- Sidebar -->
    
      <div class="cl">&nbsp;</div>
    </div>
    <!-- Main -->
  </div>
</div>
<!-- End Container -->
<!-- Footer -->
<div id="footer">
  <div class="shell"> <span class="left">&copy; 2010 - Centro Nelson</span> <span class="right"> Design by <a href="http://chocotemplates.com">Alejandro Enriquez</a> </span> </div>
</div>
<!-- End Footer -->
</body>
</html>