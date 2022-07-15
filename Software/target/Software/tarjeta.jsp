<%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 09/07/2022
  Time: 05:38 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Tarjeta</title>
    <link rel="stylesheet" href="/Software/estilo2.css">
    <link rel="stylesheet" href="/Software/select.css">
    <link rel="stylesheet" href="/Software/styles.css">
    <link rel="icon" href="images/loguito.png"/>
    <script src="https://kit.fontawesome.com/0458944bda.js" crossorigin="anonymous"></script>
</head>
<body background="images/fondo.jpg">
<header class="header">
    <div class="container logo-nav-container">
        <nav class="navigation">
            <ul class="show">
                <a href="#" class="logo"><img src="images/logo.png" style="width: 150px; height: 43px;"/></a>
                <li><font face="times new roman" size="5px"><a href="index.html">Inicio</a></font></li>
                <li><font face="times new roman" size="5px"><a href="">Categorias</a></font></li>
                <li><font face="times new roman" size="5px"><input type="search" placeholder="Buscar . . ."></font></li>
                <li><font face="times new roman" size="5px"><a href="tarjeta.jsp">Tarjeta</a></font></li>
            </ul>
        </nav>
    </div>
</header>

<main class="main">
    <br/><br/>
    <div class="grid-container-2" align="center">
        <div>
            <font face="times new roman" color="#d2691e">Los juegos del hambre </font>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
            <input type="text" name="numero1">
            &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
            <input type="number" name="numero4">
            &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
            <img src="images/hunger_games.jpg" style="width: 50px; height: 80px;"/>
        </div>
        <div>
            <font face="times new roman" color="#d2691e">Luna nueva </font>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
            <input type="text" name="numero2">
            &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
            <input type="number" name="numero5">
            &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
            <img src="images/luna_nueva.jpg" style="width: 50px; height: 80px;"/>
        </div>
        <div>
            <font color="#d2691e">Harry Potter </font>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
            <input type="text" name="numero3">
            &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
            <input type="number" name="numero6">
            &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
            <img src="images/harry_potter.jpg" style="width: 50px; height: 80px;"/>
        </div>
    </div>

    <div>
        <form action="calculo.jsp" method="get">
            <p><input type="submit" value="Calcular"/></p>
        </form>
        <br/>&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" placeholder="Nombre"/>
        <br/>&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" placeholder="Apellido"/>
        <br/>&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" placeholder="Número de Tarjeta"/>
        &nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" placeholder="CVV"/>
        <br/>&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" placeholder="Calle"/>
        &nbsp&nbsp&nbsp&nbsp&nbsp<input type="date" placeholder="Caducidad"/>
        <br/>&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" placeholder="Ciudad"/>
        <br/>&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" placeholder="País"/>
        <br/><br>&nbsp&nbsp&nbsp&nbsp&nbsp<input type="button" value="Comprar"/><br/><br>
    </div>
</main>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="/javaS1.js"></script>
</body>
</html>
