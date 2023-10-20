/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aguatzi.sistemaAguatzi.repositories;

import com.aguatzi.sistemaAguatzi.entidades.Empleado;
import com.aguatzi.sistemaAguatzi.entidades.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author mig_2
 */
public class EmpleadosRepository extends RepositoryBase<Empleado>{
    
    public EmpleadosRepository(EntityManager entityManager) {
        super(entityManager);
    }
    
    public Empleado obtenerPorUsuario(Usuario usuario) {
        TypedQuery<Empleado> query = entityManager.createNamedQuery("Empleado.findByUsuario", Empleado.class);
        query.setParameter("usuario", usuario);
        Empleado empleado = query.getResultList().stream().findFirst().orElse(null);
        return empleado;
    }
}
