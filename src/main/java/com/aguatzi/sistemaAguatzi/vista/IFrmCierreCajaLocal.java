/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.aguatzi.sistemaAguatzi.vista;

import java.awt.event.ActionListener;

/**
 *
 * @author Omar Guerrero
 */
public interface IFrmCierreCajaLocal {

    public String getLecturaMedidor();

    public String getLecturaAnterior();

    public String getGarrafonesRuta();

    public String getGarrafonesVaciados();

    public String getPagadosTrasferencia();

    public String getGarrafonesNuevos();

    public String getDineroCaja();

    public void setListrosVendidos();

    public void setGarrafonesVnedidos();

    public void setDineroTotal();

    public void setFaltante();
    
    public void setUsuario();

    public void agregarCalcularnListener(ActionListener actionListener);

    public void agregarLimpiarListener(ActionListener actionListener);

    public void agregarGuardarListener(ActionListener actionListener);

    public void agregarCancelarListener(ActionListener actionListener);

    public void mostrarMensaje(String mensaje);

    public void mostrarMensajeError(String mensajeError);

    public void eliminarVentana();

}
