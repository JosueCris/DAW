<%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 21/03/2022
  Time: 07:22 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>

<%!
    public void registrarCurso(int nrc, int materia, int profesor, int semestre, String horario, int cupo) {
        Connection connection = null;
        Statement stm = null;
        String BD = "Universidad_Veracruzana";
        String URL = "jdbc:postgresql://localhost:5432/" + BD;
        String USER = "postgres";
        String PASSWORD = "12345678";
        String DRIVER = "org.postgresql.Driver";
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement statement = connection.createStatement();
            stm.executeQuery("INSERT INTO Profesores(nrc, materia, profesor, semestre, horario, cupo)\n" +
                    "VALUES\n" +
                    "('" + nrc + "', '" + materia + "', '" + profesor + "', " + semestre + ", '" + horario + "', '" + cupo +  "');");


            stm.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
%>
<html>
<head>
    <title>Cursos</title>
</head>
<body bgcolor="#adff2f">
<%
    int nrc = Integer.parseInt(request.getParameter("nrc"));
    int materia = Integer.parseInt(request.getParameter("materia"));
    int profesor = Integer.parseInt(request.getParameter("profesor"));
    int semestre = Integer.parseInt(request.getParameter("semestre"));
    String horario = request.getParameter("horario");
    int cupo = Integer.parseInt(request.getParameter("cupo"));

    registrarCurso(nrc, materia, profesor, semestre, horario, cupo);
    out.println("Curso Registrado!!!");

%>
<form action="cursos.jsp">
    <input type="submit" value="Registrar de Nuevo">
</form>
<form action="index.jsp">
    <input type="submit" value="Inicio"/>
</form>

</body>
</html>
