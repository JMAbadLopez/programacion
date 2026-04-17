package database;

import model.Usuario;

import java.sql.*;
import java.util.ArrayList;

public class UsuarioDAO {

    public Usuario login(String email, String password) {

        Usuario usuario = new Usuario();
        String sql = "SELECT id_usuario, email, password FROM usuario WHERE email = ? AND password = ?";

        try (Connection con = ConexionBD.conectar()) {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                usuario.setIdUsuario(rs.getInt("id_usuario"));
                usuario.setEmail(rs.getString("email"));
                usuario.setPassword(rs.getString("password"));
            }

        } catch (SQLException ex) {
            System.err.println("Error al obtener el usuario: " + ex.getMessage());
        }
        return usuario;
    }
}