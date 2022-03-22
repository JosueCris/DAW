package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;

/* NOTA: No se porque no me funcina la clase conexion en los JSPs aunque ya lo tengo importado,
    por lo que me vi en la necesidad de copiar y pegar algunas cosas de aquí para hacer las altas en
    las tablas de la BD, cosa que viola el paradigma de POO. Hasta yo me siento mal por eso :( */
public class Conexion {
    private static final String BD = "Universidad_Veracruzana";
    private static final String URL = "jdbc:postgresql://localhost:5432/" + BD;
    private static final String USER = "postgres";
    private static final String PASSWORD = "12345678";
    private static final String DRIVER = "org.postgresql.Driver";

    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection = (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            System.out.println("Error de Conexion: " + e);
        }
        return connection;
    }
}