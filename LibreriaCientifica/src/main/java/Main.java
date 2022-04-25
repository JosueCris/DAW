import Datos.Conexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        Conexion con = new Conexion();
        Connection connection = null;
        Statement stm = null;
        ResultSet rs = null;
        String sql = "SELECT Nombre FROM Empleado";
        try {
            connection = con.getConnection();
            stm = connection.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next())
                System.out.println(rs.getString("Nombre"));

            con.close(rs);
            con.close(stm);
            con.close(connection);
        }
        catch (Exception e) {
            System.out.println("Error de Conexion: " + e);
        }
    }
}
