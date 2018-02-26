<%-- 
    Document   : Login
    Created on : 24/02/2018, 10:52:05 PM
    Author     : Julián Flórez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
    <link rel=icon href="Img/PNG/mockups.png">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css"
    href="CSS/Footer.css">
    <link rel="stylesheet" type="text/css"
    href="CSS/loginCSS.css">
    </head>
    <title>BeraClick - Login</title>
    
    <body class="imgFondo">
     
<form class="">
  <div class="imgcontainer">
    <img src="Img/PNG/Bera-logo.png" alt="Beraclick" class="avatar">
  </div>

  <div class="container">
    <label for="uname"><b>Nombre de usuario</b></label>
    <input type="text" placeholder="Usuario" name="uname" required>

    <label for="psw"><b>Contraseña</b></label>
    <input type="password" placeholder="Contraseña" name="psw" required>

    <button type="submit">Iniciar Sesión</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Recordar usuario
    </label>
  </div>

  <div class="container" style="background-color:#f1f1f1">
   
    <span class="">Olvide mi <a href="#">contraseña</a></span>
  </div>
</form>

        
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