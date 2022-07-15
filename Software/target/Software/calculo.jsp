<%--
  Created by IntelliJ IDEA.
  User: JOSUE
  Date: 09/07/2022
  Time: 06:24 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%!
    private int calcularSuma(int precio1, int precio2, int precio3, int cant1, int cant2, int cant3) {
        return (precio1*cant1) + (precio2+cant2) + (precio3+cant3);
    }
%>

<html>
<body>
<%
    String numeroGet = request.getParameter("numero1");
    String numeroGet2 = request.getParameter("numero2");
    String numeroGet3 = request.getParameter("numero3");
    String numeroGet4 = request.getParameter("numero4");
    String numeroGet5 = request.getParameter("numero5");
    String numeroGet6 = request.getParameter("numero6");

    int precio1 = Integer.parseInt(numeroGet);
    int precio2 = Integer.parseInt(numeroGet2);
    int precio3 = Integer.parseInt(numeroGet3);
    int cant1 = Integer.parseInt(numeroGet4);
    int cant2 = Integer.parseInt(numeroGet5);
    int cant3 = Integer.parseInt(numeroGet6);

    int total = calcularSuma(precio1, precio2, precio3, cant1, cant2, cant3);
    out.println("<p>Su compra es de: $"+ total + "</p>");
%>

<form action="index.jsp">
    <p><input type="submit" value="Regresar"/></p>
</form>

<li><a href="index.html">REGRESAR</a></li>

</body>
</html>