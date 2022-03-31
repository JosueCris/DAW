<%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 30/03/2022
  Time: 05:39 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Manejando JB desde JSP</title>
</head>
<body>
    <h1>JB con JSP</h1>
    <jsp:useBean id="alumnos" class="Tablas.Alumnos"/>
    <jsp:setProperty name="profesores" property="nombre" value="Josue"/>
    <jsp:getProperty name="alumnos" property="nombre"/>
<%--    <%--%>
<%--//        String matricula = "S18001462";--%>
<%--//        String nombre = "Josue";--%>
<%--//        String paterno = "Tellez";--%>
<%--//        String materno = "Huerta";--%>
<%--//        alumnos.setMatricula(matricula);--%>
<%--//        alumnos.setNombre(nombre);--%>
<%--//        alumnos.setaPaterno(paterno);--%>
<%--//        alumnos.setaMaterno(materno);--%>
<%--    %>--%>

</body>
</html>
