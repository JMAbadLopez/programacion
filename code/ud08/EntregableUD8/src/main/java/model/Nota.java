package model;

import java.time.LocalDate;

public class Nota {

    private int idNota;
    private int idUsuario;
    private String texto;
    private LocalDate fechaCreacion;

    public Nota(int idNota, int idUsuario, String texto, LocalDate fechaCreacion) {
        this.idNota = idNota;
        this.idUsuario = idUsuario;
        this.texto = texto;
        this.fechaCreacion = fechaCreacion;
    }

    public int getIdNota() {
        return this.idNota;
    }

    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    public int getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDate getFechaCreacion() {
        return this.fechaCreacion;
    }

    public void setValor(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
