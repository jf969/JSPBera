<%-- 
    Document   : Inicio
    Created on : 24/02/2018, 10:51:52 PM
    Author     : Julián Flórez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel=icon href="Img/PNG/mockups.png">
	<script src="https://use.fontawesome.com/df75798c9b.js"></script>
    <script type="text/javascript">
      // Notice how this gets configured before we load Font Awesome
      window.FontAwesomeConfig = { autoReplaceSvg: false }
    </script>
    <script src="fontawesome.js"></script>
	<link rel="stylesheet" type="text/css" href="CSS/menuCSS.css">
    <link rel="stylesheet" type="text/css" href="CSS/sectionCSS.css">
    <link rel="stylesheet" type="text/css" href="CSS/header.css">
    <link rel="stylesheet" type="text/css"
    href="CSS/Footer.css">
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4/jquery.min.js"></script>
    <script src="JS/jquery-2.1.1.min.js"></script>
    <script src="JS/mainJQ.js"></script> 

	
	<title>Beraclick</title>
</head>
<body class="fondoInicio">

<header>
    <a href="index.html"><figure><img src="Img/PNG/image3.png"></figure></a>
    <figure class="imgUsuario"></figure>
    <nav id="menu">
    <ul>
        <li>Usuario
        <ul>
        <li><a href="#">Mis datos</a></li>
        <li><a href="#">Mi gestión</a></li>             
        <li><a href="#">Cerrar sesión</a></li> 
        </ul>
        </li>
    </ul>    
    </nav>
    </header>    
    
    <!--<section>
    <p id="textp">Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies nisi.</p>
    </section>!-->
    
<div class="contenedorMenu">

	<a href="#" class="btn-menu">Menu<i class="ico-men fa fa-bars"></i></a>

	<ul class="menuDesp" id="menuLateral">
		<li><a href="#"><i class="icono izquierdo fa fa-user-plus"></i>Administración Usuario</a></li>
		<ul>
			<li><a href="CrearUsuarios.html">Crear Usuario</a></li>
			<li><a href="">Editar Usuario</a></li>
			<li><a href="#">Desactivar Usuario</a></li>
			<li><a href="#">Resetear contraseña Usuario</a></li>
		</ul>

		<li><a href="#"><i class="icono izquierdo fa fa-pencil-square-o"></i>Administración Tipologías</a></li>

		<ul>
		<li><a href="CrearTipo.html">Crear Tipología</a></li>
			<li><a href="ModificarTipo.html">Editar Tipología</a></li>
			<li><a href="#">Desactivar Tipología</a></li>

		</ul>
		<li><a href="#"><i class="icono izquierdo fa fa-upload">
            </i>Cargar y asignar casos</a></li>
		<li><a href="#"><i class="ico-der fa fa-bar-chart">
            </i>Reportes y consultas</a></li>
		<ul>
			<li><a href="#">Reportes</a></li>
			<li><a href="#">Consultas</a></li>
		</ul>
	</ul>
</div>

<footer>
    <div class="separadorFooter"><img src="Img/PNG/Bera-logo.png">
    </div>
    <div>
    <img src="Img/ICON/179937-business-seo/png/smartphone.png"  class="imagenContacto1">
    </div>
    <div>
    <img src="Img/ICON/179937-business-seo/png/office-block.png"  class="imagenContacto2">
    </div>
    <div>
    <img src="Img/ICON/179937-business-seo/png/settings-2.png"  class="imagenContacto3">
    </div>
    
    <div class="labelTelefonos">
    <label>(57)(1)7555555<br>
        (57)3187555555</label>
    </div>
    
    <div class="labelUbicacion">
    <label>Carrera 7 # 55-55<br>
        Bogotá, Colombia</label>
    </div>
    
    <div class="labelSoporte">
    <label><a href="mailto:soporte@beraclick.com"></a>help@beraclick.com</label>
    </div>
    
    
    
    </footer>
    
</body>
</html>

