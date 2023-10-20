/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aguatzi.sistemaAguatzi.repositories;

import com.aguatzi.sistemaAguatzi.entidades.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author mig_2
 */
public class UsuariosRepository extends RepositoryBase<Usuario>{
    
    public UsuariosRepository(EntityManager entityManager) {
        super(entityManager);
    }
    
    public Usuario obtenPorUsername(String nombreUsuario){
        TypedQuery<Usuario> query = entityManager.createNamedQuery("Usuario.findByUsername", Usuario.class);
        query.setParameter("nombreUsuario", nombreUsuario);
        Usuario usuario = query.getResultList().stream().findFirst().orElse(null);
        return usuario;
    }
    
}
