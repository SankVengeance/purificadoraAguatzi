/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aguatzi.sistemaAguatzi.repositories;

import com.aguatzi.sistemaAguatzi.entidades.Produccion;
import javax.persistence.EntityManager;

/**
 *
 * @author mig_2
 */
public class ProduccionesRepository extends RepositoryBase<Produccion>{
    
    public ProduccionesRepository(EntityManager entityManager) {
        super(entityManager);
    }
    
}
