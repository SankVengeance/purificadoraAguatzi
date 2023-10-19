/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.aguatzi.sistemaAguatzi.test;

import com.aguatzi.sistemaAguatzi.controladores.UnitOfWork;
import com.aguatzi.sistemaAguatzi.entidades.Usuario;
import com.aguatzi.sistemaAguatzi.utils.Encriptador;
import javax.crypto.AEADBadTagException;

/**
 *
 * @author mig_2
 */
public class AgregarUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UnitOfWork unitOfWork = new UnitOfWork();
        String contrasenia = Encriptador.encriptarPassword("local");
        Usuario usuario = new Usuario("juanlocal", contrasenia, "local");
        unitOfWork.usuariosRepository().agregar(usuario);
    }
    
}
