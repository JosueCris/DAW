<%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 21/03/2022
  Time: 04:13 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<%@ page import="DataBase.*" %>
<%@ page import="Tablas.*" %>
<html>
<head>
    <title>Agregar Profesor</title>
</head>
<body bgcolor="aqua">
<h3>Ingrese los datos del profesor a la Base de Datos</h3>
<form action="add_profesores.jsp" method="get">

    <p>ID Profesor: <input type="text" name="idProfesor"/> </p>
    <p>Nombre: <input type="text" name="nombre"/> </p>
    <p>Apellido Paterno: <input type="text" name="aPaterno"/> </p>
    <p>Apellido Materno: <input type="text" name="aMaterno"/> </p>
    <p>Tipo de contrato: <input type="text" name="tipoContrato"/> </p>
    <p>EE Especializa: <input type="text" name="eeEspecializa"/> </p>
    <p>Dirección: <input type="text" name="direccion"/> </p>
    <p>Teléfono: <input type="text" name="telefono"/> </p>
    <p>Celular: <input type="text" name="celular"/> </p>
    <p>Tipo Estudio: <input type="text" name="tipoEstudios"/> </p>
    <p>Email: <input type="email" name="email"/> </p>
    <p>Fecha de Nacimiento: <input type="date" name="fechaNac"/> </p>
    <p>Lugar de Estudio: <input type="text" name="lugarEstudios"/> </p>

    <p><input type="submit" value="Registrar"/> </p>
</form>

<form action="index.jsp">
    <input type="submit" value="Regresar"/>
</form>

</body>
</html>
