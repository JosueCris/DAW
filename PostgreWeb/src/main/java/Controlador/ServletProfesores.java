package Controlador;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletProfesores", urlPatterns = {"/ServletProfesores"})
public class ServletProfesores extends HttpServlet {
    public static final long serialVersionUID = 1L;

    public ServletProfesores() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.getWriter().append("Served at: ").append(req.getContextPath());
        String opcion = req.getParameter("opcion");
        switch(opcion) {
            case "insertar":
                System.out.println("Ha seleccionado la opcion insertar");
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("/webapp/insertar.jsp");
                requestDispatcher.forward(req, resp);
                break;
        }
    }
}
