/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-04-10 00:36:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class alumnos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Agregar Alumnos</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"aqua\">\r\n");
      out.write("<h3>Ingrese los datos del alumno a la Base de Datos</h3>\r\n");
      out.write("<form action=\"bean_alumnos.jsp\" method=\"get\">\r\n");
      out.write("\r\n");
      out.write("    <p>Matricula: <input type=\"text\" name=\"matricula\"/> </p>\r\n");
      out.write("    <p>Semestre: <input type=\"text\" name=\"semestre\"/> </p>\r\n");
      out.write("    <p>Clave Carrera: <input type=\"text\" name=\"claveCarrera\"/> </p>\r\n");
      out.write("    <p>Apellido Paterno: <input type=\"text\" name=\"aPaterno\"/> </p>\r\n");
      out.write("    <p>Apellido Materno: <input type=\"text\" name=\"aMaterno\"/> </p>\r\n");
      out.write("    <p>Nombre: <input type=\"text\" name=\"nombre\"/> </p>\r\n");
      out.write("    <p>Edad: <input type=\"text\" name=\"edad\"/> </p>\r\n");
      out.write("    <p>Fecha Nacimiento: <input type=\"date\" name=\"fechaNac\"/> </p>\r\n");
      out.write("    <p>Celular: <input type=\"text\" name=\"celular\"/> </p>\r\n");
      out.write("    <p>Email: <input type=\"text\" name=\"email\"/> </p>\r\n");
      out.write("    <p>Direccion: <input type=\"text\" name=\"direccion\"/> </p>\r\n");
      out.write("    <p>Beca: <input type=\"text\" name=\"beca\"/> </p>\r\n");
      out.write("    <p>Telefono: <input type=\"text\" name=\"telefono\"/> </p>\r\n");
      out.write("\r\n");
      out.write("    <p><input type=\"submit\" value=\"Registrar\"/> </p>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<form action=\"index.jsp\">\r\n");
      out.write("    <input type=\"submit\" value=\"Regresar\"/>\r\n");
      out.write("</form>\r\n");
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
