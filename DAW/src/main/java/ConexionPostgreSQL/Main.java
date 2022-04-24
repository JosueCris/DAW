package ConexionPostgreSQL;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        Conexion con = new Conexion();
        Connection connection = null;
        Statement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT (NombreEmp).NomPila FROM Empleado";
        try {
            connection = con.getConnection();

            stmt = connection.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next())
                System.out.println(rs.getString("NomPila"));

            rs.close();
            stmt.close();
            connection.close();
        }
        catch (Exception e) {
            System.out.println("Error de Conexion: " + e);
        }
    }
}
