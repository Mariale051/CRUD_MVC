package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.UnsupportedAudioFileException;

import controller.BolsilloDigital;

public class BolsilloDigitalDao {
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    String sql;
    int r;


    public int registrar(BolsilloDigitalVo BolsilloDigital) throws SQLException {
        sql = "INSERT INTO BolsilloDigital(nombre_Bolsillo) values(?)";

        try {
            con = Conexion.conectar(); // abrir conexión
            ps = con.prepareStatement(sql); // preparar sentencia
            ps.setString(1, BolsilloDigital. getNombre_Bolsillo());
            ps.setBoolean(2, BolsilloDigital.getEstado_Bolsillo());
            System.out.println(ps);
            ps.executeUpdate(); // Ejecutar sentencia
            ps.close(); // cerrar sentencia
            System.out.println("Se registró el bolsillo correctamente");
        } catch (Exception e) {
            System.out.println("Error en el regisro " + e.getMessage().toString());
        } finally {
            con.close();// cerrando conexión
        }
        return r;
    }

    
    public int modificar(BolsilloDigitalVo BolsilloDigital) throws SQLException {
        sql = "UPDATE BolsilloDigital SET nombre_Bolsillo=? WHERE Id_BolsilloDigital=?";

        try {
            con = Conexion.conectar(); // abrir conexión
            ps = con.prepareStatement(sql); // preparar sentencia
            ps.setString(1, BolsilloDigital.getNombre_Bolsillo());
             ps.setBoolean(2, BolsilloDigital.getEstado_Bolsillo());
            System.out.println(ps);
            ps.executeUpdate(); // Ejecutar sentencia
            ps.close(); // cerrar sentencia
            System.out.println("Se cambio el bolsillo correctamente");
        } catch (Exception e) {
            System.out.println("Error en la actualizacion " + e.getMessage().toString());
        } finally {
            con.close();// cerrando conexión
        }
        return r;
    }

    public List<BolsilloDigitalVo> listar() throws SQLException {
        List<BolsilloDigitalVo> BolsilloDigital = new ArrayList<>();
        sql = "select * from BolsilloDigital";
        System.out.println(sql);
        try {
            con = Conexion.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            System.out.println(ps);
            while (rs.next()) {
                BolsilloDigitalVo r = new BolsilloDigitalVo();
                r.setId_BolsilloDigital(rs.getInt("Id_BolsilloDigital"));
                r.setNombre_Bolsillo(rs.getString("nombre_Bolsillo"));
                r.setEstado_Bolsillo(rs.getBoolean("estado_Bolsillo"));
                BolsilloDigital.add(r);
                System.out.println(ps);
            }
            ps.close();
            System.out.println("consulta exitosa");
        } catch (Exception e) {
            System.out.println("La consulta no pudo ser ejecutado " + e.getMessage().toString());
        } finally {
            con.close();
        }

        return BolsilloDigital;
    }



}
