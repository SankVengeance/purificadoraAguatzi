package com.aguatzi.sistemaAguatzi.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import java.util.Objects;

@Entity
public class CierreCajaRepartidor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCierreCajaLocal;

    @Column(name = "garrafonesVendidos")
    private int garrafonesVendidos;

    @Column(name = "garrafonesDiados")
    private int garrafonesFlados;

    @Column(name = "garrafonesDefectuosos")
    private int garrafonesDefectuosos;

    @Column(name = "pagadosTransferencia")
    private int pagadosTransferencia;

    @Column(name = "dineroReportado")
    private int dineroReportado;

    @Column(name = "gastosExtra")
    private int gastosExtra;

    @Column(name = "especificaciones",length = 150)
    private String especificaciones;

    @Column(name = "dineroVentaTotal")
    private int dineroVentaTotal;

    @Column(name = "dineroFaltante")
    private int dineroFaltante;

    @ManyToOne
    @JoinColumn(name = "idEmpleado")
    private Empleado empleado;

    public CierreCajaRepartidor(int garrafonesVendidos, int garrafonesFlados, int garrafonesDefectuosos, int pagadosTransferencia, int dineroReportado, int gastosExtra, String especificaciones, int dineroVentaTotal, int dineroFaltante, Empleado empleado) {
        this.garrafonesVendidos = garrafonesVendidos;
        this.garrafonesFlados = garrafonesFlados;
        this.garrafonesDefectuosos = garrafonesDefectuosos;
        this.pagadosTransferencia = pagadosTransferencia;
        this.dineroReportado = dineroReportado;
        this.gastosExtra = gastosExtra;
        this.especificaciones = especificaciones;
        this.dineroVentaTotal = dineroVentaTotal;
        this.dineroFaltante = dineroFaltante;
        this.empleado = empleado;
    }

    public int getGarrafonesVendidos() {
        return garrafonesVendidos;
    }

    public void setGarrafonesVendidos(int garrafonesVendidos) {
        this.garrafonesVendidos = garrafonesVendidos;
    }

    public int getGarrafonesFlados() {
        return garrafonesFlados;
    }

    public void setGarrafonesFlados(int garrafonesFlados) {
        this.garrafonesFlados = garrafonesFlados;
    }

    public int getGarrafonesDefectuosos() {
        return garrafonesDefectuosos;
    }

    public void setGarrafonesDefectuosos(int garrafonesDefectuosos) {
        this.garrafonesDefectuosos = garrafonesDefectuosos;
    }

    public int getPagadosTransferencia() {
        return pagadosTransferencia;
    }

    public void setPagadosTransferencia(int pagadosTransferencia) {
        this.pagadosTransferencia = pagadosTransferencia;
    }

    public int getDineroReportado() {
        return dineroReportado;
    }

    public void setDineroReportado(int dineroReportado) {
        this.dineroReportado = dineroReportado;
    }

    public int getGastosExtra() {
        return gastosExtra;
    }

    public void setGastosExtra(int gastosExtra) {
        this.gastosExtra = gastosExtra;
    }

    public String getEspecificaciones() {
        return especificaciones;
    }

    public void setEspecificaciones(String especificaciones) {
        this.especificaciones = especificaciones;
    }

    public int getDineroVentaTotal() {
        return dineroVentaTotal;
    }

    public void setDineroVentaTotal(int dineroVentaTotal) {
        this.dineroVentaTotal = dineroVentaTotal;
    }

    public int getDineroFaltante() {
        return dineroFaltante;
    }

    public void setDineroFaltante(int dineroFaltante) {
        this.dineroFaltante = dineroFaltante;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CierreCajaRepartidor that = (CierreCajaRepartidor) o;
        return Objects.equals(idCierreCajaLocal, that.idCierreCajaLocal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCierreCajaLocal);
    }
}
