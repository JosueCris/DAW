package Datos;

import Modelo.Profesores;
import java.sql.*;

public class ProfesoresDAO {
    private Conexion con = null;
    private Connection connection;
    private PreparedStatement ps;
    private ResultSet rs;

    public ProfesoresDAO() {
        con = new Conexion();
        this.connection = con.getConnection();
    }

    public void insertarRegistro(Profesores profesor){
        String sql = null;
        try {
            sql = "INSERT INTO profesores "+
                  "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
            ps = connection.prepareStatement(sql);
            ps.setInt(1, profesor.getIdProfesor());
            ps.setString(2, profesor.getNombre());
            ps.setString(3, profesor.getaPaterno());
            ps.setString(4, profesor.getaMaterno());
            ps.setString(5, profesor.getTipoContrato());
            ps.setInt(6, profesor.getEeEspecializa());
            ps.setString(7, profesor.getDireccion());
            ps.setString(8, profesor.getTelefono());
            ps.setString(9, profesor.getCelular());
            ps.setString(10, profesor.getTipoEstudios());
            ps.setString(11, profesor.getEmail());
            ps.setDate(12, Date.valueOf(profesor.getFechaNac()));
            ps.setString(13, profesor.getLugarEstudios());

            ps.executeUpdate();
            System.out.println("Registro exitoso!!!");

            con.close(ps);
            con.close(connection);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Profesores seleccionarRegistro(Profesores profesor){
       String sql = null;
        try {
            sql = "SELECT * FROM profesores "+
                  "WHERE Profesores.idProfesor = " + profesor.getIdProfesor()+";";
            rs = connection.createStatement().executeQuery(sql);
            if (!rs.next())
                System.out.println("No existe el profesor!!!");
            else
                return new Profesores(rs.getInt("idProfesor"), rs.getString("Nombre"), rs.getString("aPaterno"), rs.getString("aMaterno"), rs.getString("Tipo_Contrato"), rs.getInt("EE_Especializa"), rs.getString("Direccion"), rs.getString("Telefono"), rs.getString("Celular"), rs.getString("Tipo_Estudios"), rs.getString("Email"), rs.getString("FechaNac"), rs.getString("Lugar_Estudios"));
            con.close(rs);
            con.close(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void actualizarRegistro(Profesores profesor){
        String sql = null;
        try {
            sql = "UPDATE profesores "+
                    "SET Nombre = ?, aPaterno = ?, aMaterno = ?, Tipo_Contrato = ?, EE_Especializa = ?, Direccion = ?, Telefono = ?, Celular = ?, Tipo_Estudios = ?, Email = ?, FechaNac = ?, Lugar_Estudios = ? "+
                    "WHERE Profesores.idProfesor = ?;";
            ps = connection.prepareStatement(sql);
            ps.setString(1, String.valueOf(profesor.getIdProfesor()));
            ps.setString(2, profesor.getNombre());
            ps.setString(3, profesor.getaPaterno());
            ps.setString(4, profesor.getaMaterno());
            ps.setString(5, profesor.getTipoContrato());
            ps.setString(6, String.valueOf(profesor.getEeEspecializa()));
            ps.setString(7, profesor.getDireccion());
            ps.setString(8, profesor.getTelefono());
            ps.setString(9, profesor.getCelular());
            ps.setString(10, profesor.getTipoEstudios());
            ps.setString(11, profesor.getEmail());
            ps.setString(12, profesor.getFechaNac());
            ps.setString(13, profesor.getLugarEstudios());

            ps.executeUpdate();
            rs = ps.getResultSet();

            if (!rs.next())
                System.out.println("No existe el profesor!!!");

            con.close(rs);
            con.close(ps);
            con.close(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void eliminarRegistro(Profesores profesor){
        String sql = null;
        try {
            sql = "DELETE FROM profesores "+
                  "WHERE Profesores.idProfesor = " + profesor.getIdProfesor()+";";
            rs = connection.createStatement().executeQuery(sql);
            if (!rs.next())
                System.out.println("No existe el profesor!!!");

            con.close(rs);
            con.close(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}