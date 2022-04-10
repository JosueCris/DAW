<%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 30/03/2022
  Time: 11:30 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Agregar Alumnos</title>
</head>
<body bgcolor="aqua">
<h3>Ingrese los datos del alumno a la Base de Datos</h3>
<form action="bean_alumnos.jsp" method="get">

    <p>Matricula: <input type="text" name="matricula"/> </p>
    <p>Semestre: <input type="text" name="semestre"/> </p>
    <p>Clave Carrera: <input type="text" name="claveCarrera"/> </p>
    <p>Apellido Paterno: <input type="text" name="aPaterno"/> </p>
    <p>Apellido Materno: <input type="text" name="aMaterno"/> </p>
    <p>Nombre: <input type="text" name="nombre"/> </p>
    <p>Edad: <input type="text" name="edad"/> </p>
    <p>Fecha Nacimiento: <input type="date" name="fechaNac"/> </p>
    <p>Celular: <input type="text" name="celular"/> </p>
    <p>Email: <input type="text" name="email"/> </p>
    <p>Direccion: <input type="text" name="direccion"/> </p>
    <p>Beca: <input type="text" name="beca"/> </p>
    <p>Telefono: <input type="text" name="telefono"/> </p>

    <p><input type="submit" value="Registrar"/> </p>
</form>

<form action="index.jsp">
    <input type="submit" value="Regresar"/>
</form>

</body>
</html>
