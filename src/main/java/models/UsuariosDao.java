package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuariosDao {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    String sql;
    int r;
    

    public int registrar(UsuariosVo Usuarios) throws SQLException {
        sql = "INSERT INTO Usuarios(nombre_Usua ,apellido_Usua,telefono_Usua,correo_Usua,contraseña_Usua,estado_Usua) values(?,?,?,?,?,?)";

        try {
            con = Conexion.conectar(); // abrir conexión
            ps = con.prepareStatement(sql); // preparar sentencia
            ps.setString(1, Usuarios.getNombre_Usua());
            ps.setString(2, Usuarios.getApellido_Usua());
            ps.setInt(3, Usuarios.getTelefono_Usua());
            ps.setString(4, Usuarios.getCorreo_Usua());
            ps.setInt(5, Usuarios.getContraseña_Usua());
            ps.setBoolean(6, Usuarios.getEstado_Usua());
            System.out.println(ps);
            ps.executeUpdate(); // Ejecutar sentencia
            ps.close(); // cerrar sentencia
            System.out.println("Se registró el rol correctamente");
        } catch (Exception e) {
            System.out.println("Error en el regisro " + e.getMessage().toString());
        } finally {
            con.close();// cerrando conexión
        }
        return r;
    }


    public int modificar(UsuariosVo Usuarios) throws SQLException {
        sql = "UPDATE Usuarios SET nombre_Usua=?,apellido_Usua=?,telefono_Usua=?,correo_Usua=?,contraseña_Usua=?,estado_Usua=? WHERE Id_Usuarios=?";

        try {
            con = Conexion.conectar(); // abrir conexión
            ps = con.prepareStatement(sql); // preparar sentencia
            ps.setString(1, Usuarios.getNombre_Usua());
            ps.setString(2, Usuarios.getApellido_Usua());
            ps.setInt(3, Usuarios.getTelefono_Usua());
            ps.setString(4, Usuarios.getCorreo_Usua());
            ps.setInt(5, Usuarios.getContraseña_Usua());
            ps.setBoolean(6,Usuarios.getEstado_Usua());
            System.out.println(ps);
            ps.executeUpdate(); // Ejecutar sentencia
            ps.close(); // cerrar sentencia
            System.out.println("Se modifico el usuario  correctamente");
        } catch (Exception e) {
            System.out.println("Error a al hora de modificar " + e.getMessage().toString());
        } finally {
            con.close();// cerrando conexión
        }
        return r;
    }

    public int eliminar(int id) throws SQLException {
        sql = "DELETE FROM Usuarios WHERE id = ?";

        try {
            con = Conexion.conectar(); // abrir conexión
            ps = con.prepareStatement(sql); // preparar sentencia
            ps.setInt(1, id);
            System.out.println(ps);
            int resultado = ps.executeUpdate(); // Ejecutar sentencia y obtener el número de filas afectadas
            ps.close(); // cerrar sentencia

            if (resultado > 0) {
                System.out.println("Se eliminó el usuario correctamente");
            } else {
                System.out.println("No se encontró un usuario con el ID especificado");
            }
            con.close(); // cerrando conexión
            return resultado;
        } catch (Exception e) {
            System.out.println("Error al eliminar el usuario: " + e.getMessage());
        } finally {
            con.close(); // cerrando conexión
        }
        return 0; // Valor de retorno por defecto si ocurre un error
    }

    public List<UsuariosVo> listar() throws SQLException {
        List<UsuariosVo> Usuarios = new ArrayList<>();
        sql = "select * from Usuarios";
        System.out.println(sql);
        try {
            con = Conexion.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            System.out.println(ps);
            while (rs.next()) {
                UsuariosVo r = new UsuariosVo();
                r.setId(rs.getInt("Id"));
                r.setNombre_Usua(rs.getString("Nombre_Usua"));
                r.setApellido_Usua(rs.getString("Apellido_Usua"));
                r.setTelefono_Usua(rs.getInt("Telefono_Usua"));
                r.setCorreo_Usua(rs.getString("Correo_Usua"));
                r.setContraseña_Usua(rs.getInt("Contraseña_Usua"));
                r.setEstado_Usua(rs.getBoolean("Estado_Usua"));
                Usuarios.add(r);
                System.out.println(ps);
            }
            ps.close();
            System.out.println("consulta exitosa");
        } catch (Exception e) {
            System.out.println("La consulta no pudo ser ejecutado " + e.getMessage().toString());
        } finally {
            con.close();
        }

        return Usuarios;
    }

}
