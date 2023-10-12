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
public class CierreCajaLocal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCierreCajaLocal", nullable = false)
    private int idCierreCajaLocal;

    @Column(name = "lecturaMedidor", nullable = false)
    private int lecturaMedidor;

    @Column(name = "lecturaAnterior", nullable = false)
    private int lecturaAnterior;

    @Column(name = "garrafonesRepartidor", nullable = false)
    private int garrafonesRepartidor;

    @Column(name = "garrafonesVaciados", nullable = false)
    private int garrafonesVaciados;

    @Column(name = "pagadosTransferencia", nullable = false)
    private int pagadosTransferencia;

    @Column(name = "garrafonesNuevosVendidos", nullable = false)
    private int garrafonesNuevosVendidos;

    @Column(name = "dineroCaja", nullable = false)
    private int dineroCaja;

    @Column(name = "litrosVendidos", nullable = false)
    private int litrosVendidos;

    @Column(name = "garrafonesVendidos", nullable = false)
    private int garrafonesVendidos;

    @Column(name = "dineroTotal", nullable = false)
    private int dineroTotal;

    @Column(name = "faltante", nullable = false)
    private int faltante;

    @ManyToOne
    @JoinColumn(name = "idEmpleado", nullable = false)
    private Empleado empleado;

    // Constructor, getters y setters, y otros métodos


    public CierreCajaLocal(int idCierreCajaLocal) {
        this.idCierreCajaLocal = idCierreCajaLocal;
    }

    public CierreCajaLocal(int lecturaMedidor, int lecturaAnterior, int garrafonesRepartidor, int garrafonesVaciados, int pagadosTransferencia, int garrafonesNuevosVendidos, int dineroCaja, int litrosVendidos, int garrafonesVendidos, int dineroTotal, int faltante, Empleado empleado) {
        this.lecturaMedidor = lecturaMedidor;
        this.lecturaAnterior = lecturaAnterior;
        this.garrafonesRepartidor = garrafonesRepartidor;
        this.garrafonesVaciados = garrafonesVaciados;
        this.pagadosTransferencia = pagadosTransferencia;
        this.garrafonesNuevosVendidos = garrafonesNuevosVendidos;
        this.dineroCaja = dineroCaja;
        this.litrosVendidos = litrosVendidos;
        this.garrafonesVendidos = garrafonesVendidos;
        this.dineroTotal = dineroTotal;
        this.faltante = faltante;
        this.empleado = empleado;
    }

    public int getIdCierreCajaLocal() {
        return idCierreCajaLocal;
    }

    public void setIdCierreCajaLocal(int idCierreCajaLocal) {
        this.idCierreCajaLocal = idCierreCajaLocal;
    }

    public int getLecturaMedidor() {
        return lecturaMedidor;
    }

    public void setLecturaMedidor(int lecturaMedidor) {
        this.lecturaMedidor = lecturaMedidor;
    }

    public int getLecturaAnterior() {
        return lecturaAnterior;
    }

    public void setLecturaAnterior(int lecturaAnterior) {
        this.lecturaAnterior = lecturaAnterior;
    }

    public int getGarrafonesRepartidor() {
        return garrafonesRepartidor;
    }

    public void setGarrafonesRepartidor(int garrafonesRepartidor) {
        this.garrafonesRepartidor = garrafonesRepartidor;
    }

    public int getGarrafonesVaciados() {
        return garrafonesVaciados;
    }

    public void setGarrafonesVaciados(int garrafonesVaciados) {
        this.garrafonesVaciados = garrafonesVaciados;
    }

    public int getPagadosTransferencia() {
        return pagadosTransferencia;
    }

    public void setPagadosTransferencia(int pagadosTransferencia) {
        this.pagadosTransferencia = pagadosTransferencia;
    }

    public int getGarrafonesNuevosVendidos() {
        return garrafonesNuevosVendidos;
    }

    public void setGarrafonesNuevosVendidos(int garrafonesNuevosVendidos) {
        this.garrafonesNuevosVendidos = garrafonesNuevosVendidos;
    }

    public int getDineroCaja() {
        return dineroCaja;
    }

    public void setDineroCaja(int dineroCaja) {
        this.dineroCaja = dineroCaja;
    }

    public int getLitrosVendidos() {
        return litrosVendidos;
    }

    public void setLitrosVendidos(int litrosVendidos) {
        this.litrosVendidos = litrosVendidos;
    }

    public int getGarrafonesVendidos() {
        return garrafonesVendidos;
    }

    public void setGarrafonesVendidos(int garrafonesVendidos) {
        this.garrafonesVendidos = garrafonesVendidos;
    }

    public int getDineroTotal() {
        return dineroTotal;
    }

    public void setDineroTotal(int dineroTotal) {
        this.dineroTotal = dineroTotal;
    }

    public int getFaltante() {
        return faltante;
    }

    public void setFaltante(int faltante) {
        this.faltante = faltante;
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
        CierreCajaLocal that = (CierreCajaLocal) o;
        return idCierreCajaLocal == that.idCierreCajaLocal;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCierreCajaLocal);
    }
}

