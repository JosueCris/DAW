<%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 21/03/2022
  Time: 04:51 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%-- NOTA: Si se pregunta porque hay lineas comentadas que no deberían estar lo tengo como simple recordatorio de lo que no debo hacer,
el porque no funcionan ya lo investigare o en el mejor de los casos lo explicara la maestra Yuli :D --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<%@ page import="Modelo.Profesores" %>
<%--<%@ page import="DataBase.*" %>--%>
<%--<%@ page import="Tablas.*" %>--%>
<%!
    //public void registrarProfesor(Profesores profesor) {
    public void registrarProfesor(Profesores profesor) {
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
            stm.executeUpdate("INSERT INTO Profesores(idProfesor, Nombre, aPaterno, aMaterno, Tipo_Contrato, EE_Especializa, Direccion, Telefono, Celular, Tipo_Estudios, Email, FechaNac, Lugar_Estudios)\n" +
                    "VALUES\n" +
                    "('" + profesor.getIdProfesor() + "', '" + profesor.getNombre() + "', '" + profesor.getaPaterno() + "', " + profesor.getaMaterno() + ", '" + profesor.getTipoContrato() + "', '" + profesor.getEeEspecializa() + "', '" + profesor.getDireccion() + "', '" + profesor.getTelefono() + "', " + profesor.getCelular() + ", '" + profesor.getTipoEstudios() + "', '" + profesor.getEmail() + "', '" + profesor.getFechaNac() + "', '" + profesor.getLugarEstudios() + "');");

            stm.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
%>
<html>
<head>
    <title>Profesores</title>
</head>
<body bgcolor="#adff2f">
<jsp:useBean id="profesores" class="Modelo.Profesores"/>
<%
    profesores.setIdProfesor(Integer.parseInt(request.getParameter("idProfesor")));
    profesores.setNombre(request.getParameter("nombre"));
    profesores.setaPaterno(request.getParameter("aPaterno"));
    profesores.setaMaterno(request.getParameter("aMaterno"));
    profesores.setTipoContrato(request.getParameter("tipoContrato"));
    profesores.setEeEspecializa(Integer.parseInt(request.getParameter("eeEspecializa")));
    profesores.setDireccion(request.getParameter("direccion"));
    profesores.setTelefono(request.getParameter("telefono"));
    profesores.setCelular(request.getParameter("celular"));
    profesores.setTipoEstudios(request.getParameter("tipoEstudios"));
    profesores.setEmail(request.getParameter("email"));
    profesores.setFechaNac(request.getParameter("fechaNac"));
    profesores.setLugarEstudios(request.getParameter("lugarEstudios"));

    registrarProfesor(profesores);
    out.println("Profesor Registrado!!!");
%>

<jsp:setProperty name="profesores" property="idProfesor" param="profesores.getIdProfesor()"/>
<jsp:setProperty name="profesores" property="nombre" param="profesores.getNombre()"/>
<jsp:setProperty name="profesores" property="aPaterno" param="profesores.getaPaterno()"/>
<jsp:setProperty name="profesores" property="aMaterno" param="profesores.getaMaterno()"/>
<jsp:setProperty name="profesores" property="tipoContrato" param="profesores.getTipoContrato()"/>
<jsp:setProperty name="profesores" property="eeEspecializa" param="profesores.getEeEspecializa()"/>
<jsp:setProperty name="profesores" property="direccion" param="profesores.getDireccion()"/>
<jsp:setProperty name="profesores" property="telefono" param="profesores.getTelefono()"/>
<jsp:setProperty name="profesores" property="celular" param="profesores.getCelular()"/>
<jsp:setProperty name="profesores" property="tipoEstudios" param="profesores.getTipoEstudios()"/>
<jsp:setProperty name="profesores" property="email" param="profesores.getEmail()"/>
<jsp:setProperty name="profesores" property="fechaNac" param="profesores.getFechaNac()"/>
<jsp:setProperty name="profesores" property="lugarEstudios" param="profesores.getLugarEstudios()"/>
<jsp:getProperty name="profesores" property="idProfesor"/>
<jsp:getProperty name="profesores" property="nombre"/>
<jsp:getProperty name="profesores" property="aPaterno"/>
<jsp:getProperty name="profesores" property="aMaterno"/>
<jsp:getProperty name="profesores" property="tipoContrato"/>
<jsp:getProperty name="profesores" property="eeEspecializa"/>
<jsp:getProperty name="profesores" property="direccion"/>
<jsp:getProperty name="profesores" property="telefono"/>
<jsp:getProperty name="profesores" property="celular"/>
<jsp:getProperty name="profesores" property="tipoEstudios"/>
<jsp:getProperty name="profesores" property="email"/>
<jsp:getProperty name="profesores" property="fechaNac"/>
<jsp:getProperty name="profesores" property="lugarEstudios"/>

    <form action="profesores.jsp">
        <input type="submit" value="Registrar de Nuevo">
    </form>
    <form action="index.jsp">
        <input type="submit" value="Inicio"/>
    </form>
</body>
</html>
