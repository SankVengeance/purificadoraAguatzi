package com.aguatzi.sistemaAguatzi.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import java.util.Objects;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
    @NamedQuery(
        name = "Empleado.findByUsuario",
        query = "SELECT e FROM Empleado e WHERE e.usuario = :usuario"
    )
})
public class Empleado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEmpleado", nullable = false)
    private Long idEmpleado;
    @Column(length = 45 , nullable = false)
    private String nombre;

    @Column(length = 45 , nullable = false)
    private String apellidoPaterno;

    @Column(length = 45 , nullable = false)
    private String apellidoMaterno;

    @Column(length = 45, nullable = false)
    private String direccion;

    @Column(length = 45, nullable = false)
    private String telefono;

    @Column(length = 45, nullable = false)
    private String tipoEmpleado;

    @OneToOne
    @JoinColumn(name = "idUsuario" , nullable = false)
    private Usuario usuario;

    public Empleado() {
    }

    public Empleado(String nombre, String apellidoPaterno, String apellidoMaterno, String direccion, String telefono, String tipoEmpleado, Usuario usuario) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tipoEmpleado = tipoEmpleado;
        this.usuario = usuario;
    }

 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empleado)) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(idEmpleado, empleado.idEmpleado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEmpleado);
    }
}


