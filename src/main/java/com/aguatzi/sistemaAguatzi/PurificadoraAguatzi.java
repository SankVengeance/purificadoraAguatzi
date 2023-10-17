/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.aguatzi.sistemaAguatzi;

import com.aguatzi.sistemaAguatzi.controladores.ControladorIniciarSesion;
import com.aguatzi.sistemaAguatzi.vista.FrmIniciarSesion;

/**
 *
 * @author Omar Guerrero
 */
public class PurificadoraAguatzi {

    public static void main(String[] args) {
        FrmIniciarSesion frmIniciarSesion = new FrmIniciarSesion();
        ControladorIniciarSesion controladorIniciarSesion = new ControladorIniciarSesion(frmIniciarSesion);
        frmIniciarSesion.setVisible(true);
    }
}
