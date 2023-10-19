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
    
    public void limpiarCampos();
    
    public void verificarCampos();

    public void setLitrosVendidos(String litros);

    public void setGarrafonesVnedidos(String Garrafonesvendidos);

    public void setDineroTotal(String dineroTotal);

    public void setFaltante(String Faltante);
    
    public void setUsuario(String usuario);

    public void agregarCalcularnListener(ActionListener actionListener);

    public void agregarLimpiarListener(ActionListener actionListener);

    public void agregarGuardarListener(ActionListener actionListener);

    public void agregarCancelarListener(ActionListener actionListener);
    
    public int mostrarMensajeConfirmacion(String mensaje);

    public void mostrarMensaje(String mensaje);

    public void mostrarMensajeError(String mensajeError);

    public void eliminarVentana();

}
