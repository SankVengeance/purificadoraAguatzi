package com.aguatzi.sistemaAguatzi.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import java.util.Date;
import java.util.Objects;

@Entity
public class Produccion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProduccion", nullable = false)
    private Long idProduccion;

    @Column(name = "fecha", nullable = false)
    private Date fecha;

    @Column(name = "cantidad", nullable = false)
    private float cantidad;

    @ManyToOne
    @JoinColumn(name = "idCierreCajaLocal", nullable = false)
    private CierreCajaLocal cierreCajaLocal;

    public Produccion() {
    }

    public Produccion(Long idProduccion) {
        this.idProduccion = idProduccion;
    }

    public Produccion(Date fecha, int cantidad, CierreCajaLocal cierreCajaLocal) {
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.cierreCajaLocal = cierreCajaLocal;
    }

    public Long getIdProduccion() {
        return idProduccion;
    }

    public void setIdProduccion(Long idProduccion) {
        this.idProduccion = idProduccion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public CierreCajaLocal getCierreCajaLocal() {
        return cierreCajaLocal;
    }

    public void setCierreCajaLocal(CierreCajaLocal cierreCajaLocal) {
        this.cierreCajaLocal = cierreCajaLocal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produccion that = (Produccion) o;
        return idProduccion == that.idProduccion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProduccion);
    }
}

