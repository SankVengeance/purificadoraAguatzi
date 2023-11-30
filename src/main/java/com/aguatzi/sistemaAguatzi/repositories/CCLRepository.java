/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aguatzi.sistemaAguatzi.repositories;

import com.aguatzi.sistemaAguatzi.entidades.CierreCajaLocal;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author mig_2
 */
public class CCLRepository extends RepositoryBase<CierreCajaLocal>{
    
    public CCLRepository(EntityManager entityManager) {
        super(entityManager);
    }
    
    public List<Object[]> obtenerSumaDetallesPorFecha(Date fechaInicio, Date fechaFin){
	    List<Object[]> resultados = entityManager.createNamedQuery("CierreCajaLocal.sumarDetallesPorFecha")
		.setParameter("fechaInicio", fechaInicio)
		.setParameter("fechaFin", fechaFin)
		.getResultList();
	   return resultados;
    }

    public List<CierreCajaLocal> obtnerEnRangoDeFechas(Date fechaInicio, Date fechaFin){
		List<CierreCajaLocal> cierres = entityManager.createNamedQuery("CierreCajaLocal.obtenerEnRangoDeFechas", CierreCajaLocal.class)
        	.setParameter("fechaInicio", fechaInicio)
        	.setParameter("fechaFin", fechaFin)
        	.getResultList();
		return cierres;
    }
}
