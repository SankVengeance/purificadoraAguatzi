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
public interface IFrmMenuPrincipalAdmin {

    public void agregarReporteVentasListener(ActionListener actionListener);

    public void agregarCrearHorariosListener(ActionListener actionListener);

    public void agregarRegistrarEmpleadoListener(ActionListener actionListener);

    public void agregarCambiarPreciosListener(ActionListener actionListener);

    public void agregarCerrarSesionListener(ActionListener actionListener);

    public void setNombreUsuario(String nombreUsuario);

    public void eliminarVentana();

}
