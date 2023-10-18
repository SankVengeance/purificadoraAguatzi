/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.aguatzi.sistemaAguatzi.vista;

import java.awt.event.ActionListener;

/**
 *
 * @author mig_2
 */
public interface IFrmIniciarSesion {

    public String getNombreUsuario();

    public String getContrasenia();

    public void mostrarMensaje(String mensaje);

    public void mostrarMensajeError(String mensajeError);

    public void eliminarVentana();

    public void agregarIniciarSesionListener(ActionListener actionListener);
}
