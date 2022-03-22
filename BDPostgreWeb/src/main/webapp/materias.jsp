<%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 21/03/2022
  Time: 04:14 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Agregar Materia</title>
</head>
<body bgcolor="aqua">
<h3>Ingrese los datos de la materia/Experiencia Educativa a la Base de Datos</h3>
<form action="add_materias.jsp" method="get">
    <p>Código: <input type="text" name="codigo"/> </p>
    <p>Nombre: <input type="text" name="nombre"/> </p>
    <p>Créditos: <input type="text" name="creditos"/> </p>
    <p>Horas por Semana: <input type="text" name="horasSemana"/> </p>
    <p>Tipo: <input type="text" name="tipo"/> </p>
    <p>Profesor: <input type="text" name="profesor"/> </p>
    <p><input type="submit" value="Registrar"/> </p>
</form>
<form action="index.jsp">
    <input type="submit" value="Regresar"/>
</form>
</body>
</html>
