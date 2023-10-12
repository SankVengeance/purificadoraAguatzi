package com.aguatzi.sistemaAguatzi.entidades;

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
public class Gasto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idGasto", nullable = false)
    private Long idGasto;

    @Column(name = "monto", nullable = false)
    private int monto;

    @Column(name = "fecha", nullable = false)
    private Date fecha;

    @Column(name = "descripcion",length = 150, nullable = false)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "idCierreCajaRepartidor", nullable = false)
    private CierreCajaRepartidor cierreCajaRepartidor;

    public Gasto(int monto, Date fecha, String descripcion, CierreCajaRepartidor cierreCajaRepartidor) {
        this.monto = monto;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.cierreCajaRepartidor = cierreCajaRepartidor;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public CierreCajaRepartidor getCierreCajaRepartidor() {
        return cierreCajaRepartidor;
    }

    public void setCierreCajaRepartidor(CierreCajaRepartidor cierreCajaRepartidor) {
        this.cierreCajaRepartidor = cierreCajaRepartidor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gasto gasto = (Gasto) o;
        return Objects.equals(idGasto, gasto.idGasto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idGasto);
    }
}
