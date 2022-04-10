package Controlador;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletAlumnos", urlPatterns = {"/ServletAlumnos"})
public class ServletAlumnos extends HttpServlet {
    public static final long serialVersionUID = 1L;

    public ServletAlumnos() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        String opcion = req.getParameter("opcion");
        switch (opcion) {
            case "Registrar":
                System.out.println("Ha elegido insertar");
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("/webapp/alumnos.jsp");
                requestDispatcher.forward(req, resp);
                break;
        }
    }
}
