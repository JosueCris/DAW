<%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 21/03/2022
  Time: 07:05 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>

<%!
    public void registrarMateria(int codigo, String nombre, int creditos, int horasSemana, String tipo, int profesor) {
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
            stm.executeQuery("INSERT INTO Profesores(codigo, nombre, creditos, horasSemana, tipo, profesor)\n" +
                    "VALUES\n" +
                    "('" + codigo + "', '" + nombre + "', '" + creditos + "', " + horasSemana + ", '" + tipo + "', '" + profesor +  "');");


            stm.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
%>
<html>
<head>
    <title>Materias</title>
</head>
<body bgcolor="#adff2f">
<%
    int codigo = Integer.parseInt(request.getParameter("codigo"));
    String nombre = request.getParameter("nombre");
    int creditos = Integer.parseInt(request.getParameter("creditos"));
    int horasSemana = Integer.parseInt(request.getParameter("horasSemana"));
    String tipo = request.getParameter("tipo");
    int profesor = Integer.parseInt(request.getParameter("profesor"));

    registrarMateria(codigo, nombre, creditos, horasSemana, tipo, profesor);
    out.println("Materia Registrada!!!");

%>
<form action="materias.jsp">
    <input type="submit" value="Registrar de Nuevo">
</form>
<form action="index.jsp">
    <input type="submit" value="Inicio"/>
</form>

</body>
</html>
