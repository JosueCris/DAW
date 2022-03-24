<%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 21/03/2022
  Time: 09:02 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
    <%!
        public void registrarAlumno(String matricula, int semestre, String claveCarrera, String aPaterno, String aMaterno, String nombre, int edad, String fechaNac, String celular, String email, String direccion, Boolean beca, String telefono) {
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
                stm = connection.createStatement();
                stm.executeUpdate("INSERT INTO Alumnos(Matricula, Semestre, Clave_Carrera, aPaterno, aMaterno, Nombre, Edad, FechaNac, Celular, Email, Direccion, Beca, Telefono)\n" +
                        "VALUES\n" +
                        "('" + matricula + "', '" + semestre + "', '" + claveCarrera + "', ' " + aPaterno + " ', '" + aMaterno + "', '" + nombre + "', '" + edad + "', '" + fechaNac + "', " + celular + ", '" + email + "', '" + direccion + "', '" + beca + "', '" + telefono + "');");

                connection.close();
                stm.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
%>
<html>
<head>
    <title>Alumnos</title>
</head>
<body bgcolor="#adff2f">
<%
    String matricula = request.getParameter("matricula");
    int semestre = Integer.parseInt(request.getParameter("semestre"));
    String claveCarrera = request.getParameter("claveCarrera");
    String aPaterno = request.getParameter("aPaterno");
    String aMaterno = request.getParameter("aMaterno");
    String nombre = request.getParameter("nombre");
    int edad = Integer.parseInt(request.getParameter("edad"));
    String fechaNac = request.getParameter("fechaNac");
    String celular = request.getParameter("celular");
    String email = request.getParameter("email");
    String direccion = request.getParameter("direccion");
    Boolean beca = Boolean.valueOf(request.getParameter("beca"));
    String telefono = request.getParameter("telefono");

    registrarAlumno(matricula, semestre, claveCarrera, aPaterno, aMaterno, nombre, edad, fechaNac, celular, email, direccion, beca, telefono);
    out.println("Alumno Registrado!!!");
%>
<form action="alumnos.jsp">
    <input type="submit" value="Registrar de Nuevo">
</form>
<form action="index.jsp">
    <input type="submit" value="Inicio"/>
</form>
</body>
</html>
