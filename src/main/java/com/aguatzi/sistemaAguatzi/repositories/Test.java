/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.aguatzi.sistemaAguatzi.repositories;

import com.aguatzi.sistemaAguatzi.entidades.CierreCajaLocal;
import com.aguatzi.sistemaAguatzi.entidades.Empleado;
import com.aguatzi.sistemaAguatzi.repositories.UsuariosRepository;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import com.aguatzi.sistemaAguatzi.entidades.Usuario;
import com.aguatzi.sistemaAguatzi.repositories.CCLRepository;
import com.aguatzi.sistemaAguatzi.repositories.EmpleadosRepository;
/**
 *
 * @author mig_2
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManager entityManager = Persistence.createEntityManagerFactory("aguatziPU").createEntityManager();

        UsuariosRepository usuariosRepository = new UsuariosRepository(entityManager);
        
        Usuario usuario = new Usuario("Juan", "1234", "Local");
        
        usuariosRepository.agregar(usuario);
        
        EmpleadosRepository empleadosRepository = new EmpleadosRepository(entityManager);
        
        Empleado empleado = new Empleado("asdfasd", "ASDFFAsdff", "ASDFasdf", "asdfasdfa", "adsfasdfa", "adsfasd", usuario);
        
        empleadosRepository.agregar(empleado);
        
        CCLRepository cCLRepository = new CCLRepository(entityManager);
        
        CierreCajaLocal cierreCajaLocal = new CierreCajaLocal(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, empleado);
        
        cCLRepository.agregar(cierreCajaLocal);
        
    }
    
}
