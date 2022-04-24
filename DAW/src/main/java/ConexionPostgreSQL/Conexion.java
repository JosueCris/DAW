package ConexionPostgreSQL;

import javax.swing.*;
//import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    private static final String BD = "Empresa";
    private static final String URL = "jdbc:postgresql://localhost:5432/" + BD;
    private static final String USER = "postgres";
    private static final String PASSWORD = "12345678";
    private static final String DRIVER = "org.postgresql.Driver";

    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection = (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
        //    JOptionPane.showMessageDialog(null,"Conexion Exitosa!!!");
        } catch (Exception e) {
            System.out.println("Error de Conexion: " + e);
        }
        return connection;
    }
}
