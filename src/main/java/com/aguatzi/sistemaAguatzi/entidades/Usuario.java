package com.aguatzi.sistemaAguatzi.entidades;

import javax.persistence.Entity;
import javax.persistence.Column;

@Entity
public class Usuario {

    @Column(name = "nombreUsuario", length = 45, nullable = false)
    private String nombreUsuario;

    @Column(name = "contrasenia", length = 45, nullable = false)
    private String contrasenia;

    @Column(name = "tipoUsuario", length = 15, nullable = false)
    private String tipoUsuario;


    public Usuario(String nombreUsuario, String contrasenia, String tipoUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.tipoUsuario = tipoUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}

