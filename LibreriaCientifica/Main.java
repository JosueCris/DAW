import Datos.Conexion;
import Datos.LibrosDAO;
import Modelo.Libros;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Conexion con = new Conexion();
        Connection connection = null;
//        Statement stm = null;
//        ResultSet rs = null;

        connection = con.getConnection();
        LibrosDAO librosDAO = new LibrosDAO();
        Libros libros = new Libros();
        List<Libros> lista = librosDAO.consulta(libros); // Compruebo que la consulta de todos los libros funciona bien

//  De este lado solo estoy imprimiendo los nombres de empleados para comprobar que la conexion funciona bien
//        String sql = "SELECT Nombre FROM Empleado";
//        try {
//            connection = con.getConnection();
//            stm = connection.createStatement();
//            rs = stm.executeQuery(sql);
//
//            while (rs.next())
//                System.out.println(rs.getString("Nombre"));
//
//            con.close(rs);
//            con.close(stm);
//            con.close(connection);
//        }
//        catch (Exception e) {
//            System.out.println("Error de Conexion: " + e);
//        }
    }
}
