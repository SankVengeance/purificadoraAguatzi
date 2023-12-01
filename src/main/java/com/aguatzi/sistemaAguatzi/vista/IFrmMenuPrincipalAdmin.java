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

    public void agregarReporteVentas(ActionListener actionListener);

    public void agregarCrearHorarios(ActionListener actionListener);

    public void agregarRegistrarEmpleado(ActionListener actionListener);

    public void agregarCambiarPrecios(ActionListener actionListener);

    public void agregarCerrarSesionListener(ActionListener actionListener);

    public void setNombreUsuario(String nombreUsuario);

    public void eliminarVentana();

}
