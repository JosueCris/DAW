package Datos;

import Modelo.Alumnos;
import java.sql.*;

public class AlumnosDAO {
    private Conexion con = null;
    private Connection connection;
    private PreparedStatement ps;
    private ResultSet rs;

    public AlumnosDAO() {
        con = new Conexion();
        this.connection = con.getConnection();
    }

    public void insertarRegistro(Alumnos alumno) {
        String sql = null;
        try {
            sql = "INSERT INTO Alumnos(INSERT INTO Alumnos" +
                   "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            ps = connection.prepareStatement(sql);
            ps.setString(1, alumno.getMatricula());
            ps.setString(2, String.valueOf(alumno.getSemestre()));
            ps.setString(3, alumno.getClaveCarrera());
            ps.setString(4, alumno.getaPaterno());
            ps.setString(5, alumno.getaMaterno());
            ps.setString(6, alumno.getNombre());
            ps.setString(7, String.valueOf(alumno.getEdad()));
            ps.setString(8, alumno.getFechaNac());
            ps.setString(9, alumno.getCelular());
            ps.setString(10, alumno.getEmail());
            ps.setString(11, alumno.getDireccion());
            ps.setString(12, String.valueOf(alumno.getBeca()));
            ps.setString(13, alumno.getTelefono());

            ps.executeUpdate();
            System.out.println("Registro exitoso!!!");

            con.close(ps);
            con.close(connection);

        }catch (Exception e) {
            System.out.println("Error en la conexion: " + e);
        }
    }

    public Alumnos seleccionarRegistro(Alumnos alumno){
        String sql = null;
        try {
            sql = "SELECT * FROM Alumnos " +
                  "WHERE Alumnos.Matricula = " + alumno.getMatricula() + ";";
            rs = connection.createStatement().executeQuery(sql);
            if (!rs.next())
                System.out.println("No existe ese alumno");
            else
                return new Alumnos(rs.getString("Matricula"), rs.getInt("Semestre"), rs.getString("Clave_Carrera "), rs.getString("aPaterno"), rs.getString("aMaterno"), rs.getString("Nombre"), rs.getInt("Edad"), rs.getString("FechaNac"), rs.getString("celular"), rs.getString("Email"), rs.getString("Direccion"), rs.getBoolean("Beca"), rs.getString("Telefono"));
            con.close(rs);
            con.close(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void actualizarRegistro(Alumnos alumno){
        String sql = null;
        try {
            sql = "UPDATE Alumnos "+
                  "SET Matricula = ?, Semestre = ?, Clave_Carrera = ?, aPaterno = ?, aMaterno = ?, Nombre = ?, Edad = ?, FechaNac  = ?, Celular = ?, Email = ?, Direccion = ?, Beca = ?, Telefono = ? "+
                  "WHERE Alumnos.Matricula = ?;";
            ps = connection.prepareStatement(sql);
            ps.setString(1, alumno.getMatricula());
            ps.setString(2, String.valueOf(alumno.getSemestre()));
            ps.setString(3, alumno.getClaveCarrera());
            ps.setString(4, alumno.getaPaterno());
            ps.setString(5, alumno.getaMaterno());
            ps.setString(6, alumno.getNombre());
            ps.setString(7, String.valueOf(alumno.getEdad()));
            ps.setString(8, alumno.getFechaNac());
            ps.setString(9, alumno.getCelular());
            ps.setString(10, alumno.getEmail());
            ps.setString(11, alumno.getDireccion());
            ps.setString(12, String.valueOf(alumno.getBeca()));
            ps.setString(13, alumno.getTelefono());

            ps.executeUpdate();
            rs = ps.getResultSet();

            if (!rs.next())
                System.out.println("No existe ese alumno");

            con.close(rs);
            con.close(ps);
            con.close(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void eliminarRegistro(Alumnos alumno){
        String sql = null;
        try {
            sql = "DELETE * FROM Alumnos "+
                  "WHERE Alumnos.Matricula = " + alumno.getMatricula()+";";
            rs = connection.createStatement().executeQuery(sql);
            if (!rs.next())
                System.out.println("No existe ese alumno");
            con.close(rs);
            con.close(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
