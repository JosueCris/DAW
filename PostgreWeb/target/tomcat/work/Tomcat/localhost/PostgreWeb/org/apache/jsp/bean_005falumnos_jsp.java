/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-04-07 18:37:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import Modelo.Alumnos;

public final class bean_005falumnos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


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

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Manejando JB desde JSP</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"#adff2f\">\r\n");
      out.write("    <h1>JB con JSP</h1>\r\n");
      out.write("    ");
      Modelo.Alumnos alumnos = null;
      alumnos = (Modelo.Alumnos) _jspx_page_context.getAttribute("alumnos", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (alumnos == null){
        alumnos = new Modelo.Alumnos();
        _jspx_page_context.setAttribute("alumnos", alumnos, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write('\r');
      out.write('\n');

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("alumnos"), "matricula", request.getParameter("alumnos.getMatricula()"), request, "alumnos.getMatricula()", false);
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("alumnos"), "semestre", request.getParameter("alumnos.getSemestre()"), request, "alumnos.getSemestre()", false);
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("alumnos"), "claveCarrera", request.getParameter("alumnos.getClaveCarrera()"), request, "alumnos.getClaveCarrera()", false);
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("alumnos"), "aPaterno", request.getParameter("alumnos.getaPaterno()"), request, "alumnos.getaPaterno()", false);
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("alumnos"), "aMaterno", request.getParameter("alumnos.getaMaterno()"), request, "alumnos.getaMaterno()", false);
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("alumnos"), "nombre", request.getParameter("alumnos.getNombre()"), request, "alumnos.getNombre()", false);
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("alumnos"), "edad", request.getParameter("alumnos.getEdad()"), request, "alumnos.getEdad()", false);
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("alumnos"), "fechaNac", request.getParameter("alumnos.getFechaNac()"), request, "alumnos.getFechaNac()", false);
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("alumnos"), "celular", request.getParameter("alumnos.getCelular()"), request, "alumnos.getCelular()", false);
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("alumnos"), "email", request.getParameter("alumnos.getEmail()"), request, "alumnos.getEmail()", false);
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("alumnos"), "direccion", request.getParameter("alumnos.getDireccion()"), request, "alumnos.getDireccion()", false);
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("alumnos"), "beca", request.getParameter("alumnos.getBeca()"), request, "alumnos.getBeca()", false);
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("alumnos"), "telefono", request.getParameter("alumnos.getTelefono()"), request, "alumnos.getTelefono()", false);
      out.write("\r\n");
      out.write("    ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((Modelo.Alumnos)_jspx_page_context.findAttribute("alumnos")).getMatricula())));
      out.write("\r\n");
      out.write("    ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((Modelo.Alumnos)_jspx_page_context.findAttribute("alumnos")).getSemestre())));
      out.write("\r\n");
      out.write("    ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((Modelo.Alumnos)_jspx_page_context.findAttribute("alumnos")).getClaveCarrera())));
      out.write("\r\n");
      out.write("    ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((Modelo.Alumnos)_jspx_page_context.findAttribute("alumnos")).getaPaterno())));
      out.write("\r\n");
      out.write("    ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((Modelo.Alumnos)_jspx_page_context.findAttribute("alumnos")).getaMaterno())));
      out.write("\r\n");
      out.write("    ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((Modelo.Alumnos)_jspx_page_context.findAttribute("alumnos")).getNombre())));
      out.write("\r\n");
      out.write("    ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((Modelo.Alumnos)_jspx_page_context.findAttribute("alumnos")).getEdad())));
      out.write("\r\n");
      out.write("    ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((Modelo.Alumnos)_jspx_page_context.findAttribute("alumnos")).getFechaNac())));
      out.write("\r\n");
      out.write("    ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((Modelo.Alumnos)_jspx_page_context.findAttribute("alumnos")).getCelular())));
      out.write("\r\n");
      out.write("    ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((Modelo.Alumnos)_jspx_page_context.findAttribute("alumnos")).getEmail())));
      out.write("\r\n");
      out.write("    ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((Modelo.Alumnos)_jspx_page_context.findAttribute("alumnos")).getDireccion())));
      out.write("\r\n");
      out.write("    ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((Modelo.Alumnos)_jspx_page_context.findAttribute("alumnos")).getBeca())));
      out.write("\r\n");
      out.write("    ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((Modelo.Alumnos)_jspx_page_context.findAttribute("alumnos")).getTelefono())));
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <form action=\"alumnos.jsp\">\r\n");
      out.write("        <input type=\"submit\" value=\"Registrar de Nuevo\">\r\n");
      out.write("    </form>\r\n");
      out.write("    <form action=\"index.jsp\">\r\n");
      out.write("        <input type=\"submit\" value=\"Inicio\"/>\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}