/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aguatzi.sistemaAguatzi.controladores;

import com.aguatzi.sistemaAguatzi.entidades.Usuario;
import com.aguatzi.sistemaAguatzi.utils.Encriptador;
import com.aguatzi.sistemaAguatzi.vista.FrmMenuPrincipalLocal;
import com.aguatzi.sistemaAguatzi.vista.IFrmIniciarSesion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author mig_2
 */
public class ControladorIniciarSesion {
    
    private IFrmIniciarSesion frmIniciarSesion;
    private UnitOfWork unitOfWork;
    

    public ControladorIniciarSesion(IFrmIniciarSesion frmIniciarSesion) {
        this.frmIniciarSesion = frmIniciarSesion;
        frmIniciarSesion.agregarIniciarSesionListener(new IniciarSesionListener());
        unitOfWork = new UnitOfWork();
    }
        
    class IniciarSesionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String nombreUsuario = frmIniciarSesion.getNombreUsuario();
            Usuario usuario = unitOfWork.usuariosRepository().obtenPorUsername(nombreUsuario);

            if (usuario == null) {
                frmIniciarSesion.mostrarMensajeError("No se pudo iniciar sesión");
                return;
            }

            String contrasenia = frmIniciarSesion.getContrasenia();
            Boolean coincide = Encriptador.verificarPasswordConHash(contrasenia, usuario.getContrasenia());
            String tipoUsuario = usuario.getTipoUsuario();

            if (coincide) {
                frmIniciarSesion.eliminarVentana();
                switch (tipoUsuario) {
                    case "local":
                        FrmMenuPrincipalLocal frmMenuPrincipalLocal = new FrmMenuPrincipalLocal();
                        ControladorMenuPrincipalLocal controladorMenuPrincipalLocal = new ControladorMenuPrincipalLocal(frmMenuPrincipalLocal, usuario);
                        frmMenuPrincipalLocal.setVisible(true);
                        break;
                    case "repartidor":
                        // Handle repartidor logic
                        break;
                    case "admin":
                        // Handle admin logic
                        break;
                    default:
                        frmIniciarSesion.mostrarMensajeError("No se pudo iniciar sesión");
                }
            } else {
                frmIniciarSesion.mostrarMensajeError("No se pudo iniciar sesión");
            }
        }
    }
}