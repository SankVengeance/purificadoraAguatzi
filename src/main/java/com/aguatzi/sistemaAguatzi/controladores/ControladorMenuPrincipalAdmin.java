/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aguatzi.sistemaAguatzi.controladores;

import com.aguatzi.sistemaAguatzi.entidades.Usuario;

import com.aguatzi.sistemaAguatzi.vista.FrmIniciarSesion;
import com.aguatzi.sistemaAguatzi.vista.FrmReporteVentas;
import com.aguatzi.sistemaAguatzi.vista.IFrmMenuPrincipalAdmin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Omar Guerrero
 */
public class ControladorMenuPrincipalAdmin {

    private IFrmMenuPrincipalAdmin frmMenuPrincipalAdmin;
    private Usuario usuario;

    public ControladorMenuPrincipalAdmin(IFrmMenuPrincipalAdmin frmMenuPrincipalAdmin, Usuario usuario) {
        this.frmMenuPrincipalAdmin = frmMenuPrincipalAdmin;
        this.usuario = usuario;
        this.frmMenuPrincipalAdmin.agregarCerrarSesionListener(new CerrarSesionListener());
        this.frmMenuPrincipalAdmin.setNombreUsuario(this.usuario.getNombreUsuario());
        this.frmMenuPrincipalAdmin.agregarReporteVentasListener(new ReporteVentasListener());
    }



    class CerrarSesionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            frmMenuPrincipalAdmin.eliminarVentana();
            FrmIniciarSesion frmIniciarSesion = new FrmIniciarSesion();
            frmIniciarSesion.setVisible(true);
            ControladorIniciarSesion controladorIniciarSesion = new ControladorIniciarSesion(frmIniciarSesion);
        }
    }

    class ReporteVentasListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            frmMenuPrincipalAdmin.eliminarVentana();
            FrmReporteVentas frmReporteVentas = new FrmReporteVentas();
            frmReporteVentas.setVisible(true);
            ControladorReporteVentas controladorReporteVentas = new ControladorReporteVentas(frmReporteVentas, usuario);
        }
    }

}
