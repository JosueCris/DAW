package Datos;

import Modelo.Libros;

import java.sql.*;
import java.util.*;

public class LibrosDAO {
    private Conexion con;
    private Connection connection;
    private Statement stm = null;
    private ResultSet rs = null;
    private List<Libros> lista = new ArrayList<>();

    public LibrosDAO() {
        con = new Conexion();
        this.connection = con.getConnection();
    }

// Esto lo tengo pendiente en lo que resuelvo mi conflicto con la incongruencia entre la BD y los constructores
//    private static final String selectSQL = "SELECT Libros.ISBN, libros.Titulo, Libros.Año_Edicion, Editorial.Nombre_Editorial, Idioma.Nombre_Idioma, Libros.Numero_Paginas, Materia.Nombre_Materia, Libros.Precio, Libros.Sinopsis, Estante.codEstante" +
//                                            "FROM Libros" +
//                                            "INNER JOIN Editorial" +
//                                            "ON Libros.R_Editorial = Editorial.CodEditorial" +
//                                            "INNER JOIN Idioma" +
//                                            "ON Libros.R_Idioma = Idioma.CodIdioma" +
//                                            "INNER JOIN Materia" +
//                                            "ON Libros.R_Materia = Materia.CodMateria" +
//                                            "INNER JOIN Estante" +
//                                            "ON Libros.R_Estante = Estante.CodEstante;";
    private static final String selectSQL = "SELECT * FROM Libros;";

    public List<Libros> consulta(Libros libros) {
        try {
            connection = con.getConnection();
            stm = connection.createStatement();
            rs = stm.executeQuery(selectSQL);
            while (rs.next()) {
                libros.setIsbn(rs.getString("ISBN"));
                libros.setTitulo(rs.getString("Titulo"));
                libros.setAnioEdicion(rs.getInt("Año_Edicion"));
                libros.setrEditorial(rs.getInt("R_Editorial"));
                libros.setrIdioma(rs.getInt("R_Idioma"));
                libros.setNumeroPaginas(rs.getInt("Numero_Paginas"));
                libros.setrMateria(rs.getInt("R_Materia"));
                libros.setPrecio(rs.getDouble("Precio"));
                libros.setSinopsis(rs.getString("Sinopsis"));
                libros.setrEstante(rs.getInt("R_Estante"));

                lista.add(libros);
            }

            con.close(rs);
            con.close(stm);
            con.close(connection);

            lista.forEach(System.out::println); // Aqui hacemos el recorrido de la lista completa

        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

}
