/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aguatzi.sistemaAguatzi.controladores;

import com.aguatzi.sistemaAguatzi.entidades.Usuario;
import com.aguatzi.sistemaAguatzi.utils.Encriptador;
import com.aguatzi.sistemaAguatzi.vista.IFrmIniciarSesion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author mig_2
 */
public class ControladorIniciarSesion {
    
    IFrmIniciarSesion frmIniciarSesion;
    UnitOfWork unitOfWork;
    

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
            String contrasenia = frmIniciarSesion.getContrasenia();
            Boolean coincide = Encriptador.verificarPasswordConHash(contrasenia, usuario.getContrasenia());
            if (coincide) {
                System.out.println("Sesión iniciada");
            }else{
                System.out.println("Error iniciar sesion");
            }
        }
    }
}
