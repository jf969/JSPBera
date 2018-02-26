<%-- 
    Document   : CrearUsuarios
    Created on : 24/02/2018, 10:51:16 PM
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

        <!---------------------------------------------------------------->
        <script src="https://use.fontawesome.com/df75798c9b.js"></script>
        <script type=   "text/javascript">
            // Notice how this gets configured before we load Font Awesome
            window.FontAwesomeConfig = {autoReplaceSvg: false}
        </script>
        <script src="fontawesome.js"></script>
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4/jquery.min.js"></script>
        <script src="JS/jquery-2.1.1.min.js"></script>  
        <script src="JS/mainJQ.js"></script> 

        <!---------------------------------------------------------------->
        <link rel="stylesheet" type="text/css" href="CSS/menuCSS.css">
        <link rel="stylesheet" type="text/css" href="CSS/sectionCSS.css">
        <link rel="stylesheet" type="text/css" href="CSS/header.css">
        <link rel="stylesheet" type="text/css"
              href="CSS/Footer.css">
        <link rel="stylesheet" type="text/css" href="CSS/sectionCSS.css">


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
        <div></div>
        <div class="formDatos">
            <form method="POST" action="SrvRegistroUsuario">
                <div><h3>DATOS BASICOS</h3></div>
                <label>ID empleado:</label>
                <input type="text" placeholder="ID" maxlength="1000" disabled>
                <label>Cedula:</label>
                <input type="number" placeholder="CC - CE" maxlength="11" name="cedula">
                <label>Cargo:</label>
                <input type="text" placeholder="Cargo" name="car">
                <select name="tipoDoc">
                    <option >1</option>
                    <option>2</option>
                </select><br>
                <label>Nombres:</label>
                <input type="text" placeholder="Primer nombre" name="nom1"><input type="text" placeholder="Segundo nombre" name="nom2">
                <label>Apellidos:</label>
                <input type="text" placeholder="Primer apellido" name="ape1">
                <input type="text" placeholder="Segundo apellido" name="ape2">
                <label>Rol:</label><br>
                <select name="rol">
                    <option>1</option>
                    <option>2</option>
                </select><br>
                <label>Usuario:</label>
                <input type="text" placeholder="usuario" name="usrname">
                <label>Contraseña:</label><input type="password" placeholder="Contraseña" name="pss">
                <label>Repita contraseña:</label><input type="password" placeholder="Contraseña" name="pss2">
                <label>Correo:</label>
                <input type="text" placeholder="Correo" name="mail">
                <label>Especialidad:</label><br>
                <select name="esp">
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                </select><br>
                <label class="labelForm">Estado</label><br>
                <select name="est">
                    <option>1</option>
                    <option>0</option>
                </select>
                <br>
                <br>
                <input type="submit" value="Guardar" class="btn-style">
                <br>
                <input type="reset" value="Limpiar campos" class="btn-style">
            </form>
        </div>

        <div class="contenedorMenu">

            <a href="#" class="btn-menu">Menu<i class="ico-men fa fa-bars"></i></a>

            <ul class="menuDesp" id="menuLateral">
                <li><a href="#"><i class="icono izquierdo fa fa-user-plus"></i>Administración Usuario</a></li>
                <ul>
                    <li><a href="CrearUsuarios.html">Crear Usuario</a></li>
                    <li><a href="#">Editar Usuario</a></li>
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
        <!--
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
        -->

    </body>
</html>