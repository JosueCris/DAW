<%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 30/03/2022
  Time: 05:39 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<%@ page import="Tablas.Alumnos" %>
<%!
    public void registrarAlumno(Alumnos alumno) {
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
                    "('" + alumno.getMatricula() + "', '" + alumno.getSemestre() + "', '" + alumno.getClaveCarrera() + "', ' " + alumno.getaPaterno() + " ', '" + alumno.getaMaterno() + "', '" + alumno.getNombre() + "', '" + alumno.getEdad() + "', '" + alumno.getFechaNac() + "', " + alumno.getCelular() + ", '" + alumno.getEmail() + "', '" + alumno.getDireccion() + "', '" + alumno.getBeca() + "', '" + alumno.getTelefono() + "');");

            connection.close();
            stm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
%>
<html>
<head>
    <title>Manejando JB desde JSP</title>
</head>
<body bgcolor="#adff2f">
    <h1>JB con JSP</h1>
    <jsp:useBean id="alumnos" class="Tablas.Alumnos"/>
<%
    alumnos.setMatricula(request.getParameter("matricula"));
    alumnos.setSemestre(Integer.parseInt(request.getParameter("semestre")));
    alumnos.setClaveCarrera(request.getParameter("claveCarrera"));
    alumnos.setaPaterno(request.getParameter("aPaterno"));
    alumnos.setaMaterno(request.getParameter("aMaterno"));
    alumnos.setNombre(request.getParameter("nombre"));
    alumnos.setEdad(Integer.parseInt(request.getParameter("edad")));
    alumnos.setFechaNac(request.getParameter("fechaNac"));
    alumnos.setCelular(request.getParameter("celular"));
    alumnos.setEmail(request.getParameter("email"));
    alumnos.setDireccion(request.getParameter("direccion"));
    alumnos.setBeca(Boolean.valueOf(request.getParameter("beca")));
    alumnos.setTelefono(request.getParameter("telefono"));

    registrarAlumno(alumnos);
    out.println("Alumno Registrado!!!");
%>

    <jsp:setProperty name="alumnos" property="matricula" param="alumnos.getMatricula()"/>
    <jsp:setProperty name="alumnos" property="semestre" param="alumnos.getSemestre()"/>
    <jsp:setProperty name="alumnos" property="claveCarrera" param="alumnos.getClaveCarrera()"/>
    <jsp:setProperty name="alumnos" property="aPaterno" param="alumnos.getaPaterno()"/>
    <jsp:setProperty name="alumnos" property="aMaterno" param="alumnos.getaMaterno()"/>
    <jsp:setProperty name="alumnos" property="nombre" param="alumnos.getNombre()"/>
    <jsp:setProperty name="alumnos" property="edad" param="alumnos.getEdad()"/>
    <jsp:setProperty name="alumnos" property="fechaNac" param="alumnos.getFechaNac()"/>
    <jsp:setProperty name="alumnos" property="celular" param="alumnos.getCelular()"/>
    <jsp:setProperty name="alumnos" property="email" param="alumnos.getEmail()"/>
    <jsp:setProperty name="alumnos" property="direccion" param="alumnos.getDireccion()"/>
    <jsp:setProperty name="alumnos" property="beca" param="alumnos.getBeca()"/>
    <jsp:setProperty name="alumnos" property="telefono" param="alumnos.getTelefono()"/>
    <jsp:getProperty name="alumnos" property="matricula"/>
    <jsp:getProperty name="alumnos" property="semestre"/>
    <jsp:getProperty name="alumnos" property="claveCarrera"/>
    <jsp:getProperty name="alumnos" property="aPaterno"/>
    <jsp:getProperty name="alumnos" property="aMaterno"/>
    <jsp:getProperty name="alumnos" property="nombre"/>
    <jsp:getProperty name="alumnos" property="edad"/>
    <jsp:getProperty name="alumnos" property="fechaNac"/>
    <jsp:getProperty name="alumnos" property="celular"/>
    <jsp:getProperty name="alumnos" property="email"/>
    <jsp:getProperty name="alumnos" property="direccion"/>
    <jsp:getProperty name="alumnos" property="beca"/>
    <jsp:getProperty name="alumnos" property="telefono"/>

    <form action="alumnos.jsp">
        <input type="submit" value="Registrar de Nuevo">
    </form>
    <form action="index.jsp">
        <input type="submit" value="Inicio"/>
    </form>

</body>
</html>
