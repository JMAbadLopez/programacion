package model;

public class Usuario {

    private int idUsuario;
    private String email;
    private String password;

    public Usuario() {
        this.idUsuario = 0;
        this.email = "";
        this.password = "";
    }

    public Usuario(int idUsuario, String email, String password) {
        this.idUsuario = idUsuario;
        this.email = email;
        this.password = password;
    }

    public int getIdUsuario() {
        return this.idUsuario;
    }
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", email=" + email + ", password=" + password + '}';
    }

}
