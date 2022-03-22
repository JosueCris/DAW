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
<%--<%@ page import="DataBase.*" %>--%>
<%--<%@ page import="Tablas.*" %>--%>
<%!
    //public void registrarProfesor(Profesores profesor) {
    public void registrarProfesor(int idProfesor, String nombre, String aPaterno, String aMaterno, String tipoContrato, int eeEspecializa, String direccion, String telefono, String celular, String tipoEstudios, String email, Date fechaNac, String lugarEstudios) {
//        Conexion conexion = new Conexion();
        Connection connection = null;
        Statement stm = null;
//        try {
//            connection = conexion.getConnection();
//            stm = connection.createStatement();
        String BD = "Universidad_Veracruzana";
        String URL = "jdbc:postgresql://localhost:5432/" + BD;
        String USER = "postgres";
        String PASSWORD = "12345678";
        String DRIVER = "org.postgresql.Driver";
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement statement = connection.createStatement();
            stm.executeQuery("INSERT INTO Profesores(idProfesor, nombre, apaterno, amaterno, tipo_contrato, ee_especializa, direccion, telefono, celular, tipo_estudios, email, fechanac, lugar_estudios)\n" +
                    "VALUES\n" +
//                    "('" + profesor.getIdProfesor() + "', '" + profesor.getNombre() + "', '" + profesor.getaPaterno() + "', " + profesor.getaMaterno() + ", '" + profesor.getTipoContrato() + "', '" + profesor.getEeEspecializa() + "', '" + profesor.getDireccion() + "', '" + profesor.getTelefono() + "', " + profesor.getCelular() + ", '" + profesor.getTipoEstudios() + "', '" + profesor.getEmail() + "', '" + profesor.getFechaNac() + "', '" + profesor.getLugarEstudios() + "');");
                    "('" + idProfesor + "', '" + nombre + "', '" + aPaterno + "', " + aMaterno + ", '" + tipoContrato + "', '" + eeEspecializa + "', '" + direccion + "', '" + telefono + "', " + celular + ", '" + tipoEstudios + "', '" + email + "', '" + fechaNac + "', '" + lugarEstudios + "');");

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
<%
    int idProfesor = Integer.parseInt(request.getParameter("idProfesor"));
    String nombre = request.getParameter("nombre");
    String aPaterno = request.getParameter("aPaterno");
    String aMaterno = request.getParameter("aMaterno");
    String tipoContrato = request.getParameter("tipoContrato");
    int eeEspecializa = Integer.parseInt(request.getParameter("eeEspecializa"));
    String direccion = request.getParameter("direccion");
    String telefono = request.getParameter("telefono");
    String celular = request.getParameter("celular");
    String tipoEstudios = request.getParameter("tipoEstudios");
    String email = request.getParameter("email");
    Date fechaNac = Date.valueOf(request.getParameter("fechaNac"));
    String lugarEstudios = request.getParameter("lugarEstudios");

//    Profesores profesor = new Profesores(idProfesor, nombre, aPaterno, aMaterno, tipoContrato, eeEspecializa, direccion, telefono, celular, tipoEstudios, email, fechaNac, lugarEstudios);

//    registrarProfesor(profesor);
//    registrarProfesor(new Profesores(idProfesor, nombre, aPaterno, aMaterno, tipoContrato, eeEspecializa, direccion, telefono, celular, tipoEstudios, email, fechaNac, lugarEstudios));
    registrarProfesor(idProfesor, nombre, aPaterno, aMaterno, tipoContrato, eeEspecializa, direccion, telefono, celular, tipoEstudios, email, fechaNac, lugarEstudios);
    out.println("Profesor Registrado!!!");
%>
    <form action="profesores.jsp">
        <input type="submit" value="Registrar de Nuevo">
    </form>
    <form action="index.jsp">
        <input type="submit" value="Inicio"/>
    </form>
</body>
</html>
