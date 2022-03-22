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
    <title>Agregar Curso</title>
</head>
<body bgcolor="aqua">
    <h3>Ingrese los datos del curso a la Base de Datos</h3>
    <form action="add_cursos.jsp" method="get">
        <p>NRC: <input type="text" name="nrc"/> </p>
        <p>Materia: <input type="text" name="materia"/> </p>
        <p>Profesor: <input type="text" name="profesor"/> </p>
        <p>Semestre: <input type="text" name="semestre"/> </p>
        <p>Horario: <input type="text" name="horario"/> </p>
        <p>Cupo: <input type="text" name="cupo"/> </p>
        <p><input type="submit" value="Registrar"/> </p>
    </form>
    <form action="index.jsp">
        <input type="submit" value="Regresar"/>
    </form>
</body>

</body>
</html>
