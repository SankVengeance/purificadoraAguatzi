/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aguatzi.sistemaAguatzi.controladores;

import com.aguatzi.sistemaAguatzi.entidades.Usuario;
import com.aguatzi.sistemaAguatzi.vista.FrmCierreCajaLocal;
import com.aguatzi.sistemaAguatzi.vista.FrmIniciarSesion;
import com.aguatzi.sistemaAguatzi.vista.IFrmMenuPrincipalLocal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author mig_2
 */
public class ControladorMenuPrincipalLocal {
    private IFrmMenuPrincipalLocal frmMenuPrincipalLocal;
    private Usuario usuario;
    

    public ControladorMenuPrincipalLocal(IFrmMenuPrincipalLocal frmMenuPrincipalLocal,Usuario usuario) {
        this.frmMenuPrincipalLocal = frmMenuPrincipalLocal;
        this.usuario = usuario;
        this.frmMenuPrincipalLocal.agregarCierreDeCajaLocalListener(new CierreDeCajaListener());
        this.frmMenuPrincipalLocal.agregarCerrarSesionListener(new CerrarSesionListener());
        this.frmMenuPrincipalLocal.setNombreUsuario(this.usuario.getNombreUsuario());
    }
        
    class CierreDeCajaListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            frmMenuPrincipalLocal.eliminarVentana();
            FrmCierreCajaLocal frmCierreCajaLocal = new FrmCierreCajaLocal();
            frmCierreCajaLocal.setVisible(true);
            ControladorCierreCajaLocal controladorCierreCajaLocal = new ControladorCierreCajaLocal(frmCierreCajaLocal, usuario);
        }
    }
    
   class CerrarSesionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            frmMenuPrincipalLocal.eliminarVentana();
            FrmIniciarSesion frmIniciarSesion = new FrmIniciarSesion();
            frmIniciarSesion.setVisible(true);
            ControladorIniciarSesion controladorIniciarSesion = new ControladorIniciarSesion(frmIniciarSesion);
        }
    }
}
