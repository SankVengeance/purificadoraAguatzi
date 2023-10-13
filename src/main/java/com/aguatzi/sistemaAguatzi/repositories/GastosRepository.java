/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aguatzi.sistemaAguatzi.repositories;

import com.aguatzi.sistemaAguatzi.entidades.Gasto;
import javax.persistence.EntityManager;

/**
 *
 * @author mig_2
 */
public class GastosRepository extends RepositoryBase<Gasto>{
    
    public GastosRepository(EntityManager entityManager) {
        super(entityManager);
    }
    
}
