package com.aguatzi.sistemaAguatzi.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import java.util.Objects;

@Entity
public class Compra implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCompra", nullable = false)
    private Long idCompra;

    @Column(name = "tipoInsumo", length = 45, nullable = false)
    private String tipoInsumo;

    @Column(name = "cantidad", nullable = false)
    private int cantidad;

    @Column(name = "monto", nullable = false)
    private float monto;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public Compra() {
    }

    public Compra(Long idCompra) {
        this.idCompra = idCompra;
    }

    public Compra(String tipoInsumo, int cantidad, int monto, Usuario usuario) {
        this.tipoInsumo = tipoInsumo;
        this.cantidad = cantidad;
        this.monto = monto;
        this.usuario = usuario;
    }

    public Long getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Long idCompra) {
        this.idCompra = idCompra;
    }

    public String getTipoInsumo() {
        return tipoInsumo;
    }

    public void setTipoInsumo(String tipoInsumo) {
        this.tipoInsumo = tipoInsumo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
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
        if (o == null || getClass() != o.getClass()) return false;
        Compra compra = (Compra) o;
        return idCompra == compra.idCompra;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCompra);
    }
}

