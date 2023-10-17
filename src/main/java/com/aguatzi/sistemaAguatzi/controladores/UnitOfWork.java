/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aguatzi.sistemaAguatzi.controladores;

import com.aguatzi.sistemaAguatzi.repositories.*;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author mig_2
 */
public class UnitOfWork {

    private EntityManager entityManager;

    private UsuariosRepository _usuariosRepository;
    private CCLRepository _cclRepository;
    private CCRRepository _ccrRepository;
    private ComprasRepository _comprasRepository;
    private EmpleadosRepository _empleadosRepository;
    private GastosRepository _gastosRepository;
    private HorariosRepository _horariosRepository;
    private ProduccionesRepository _produccionesRepository;

    public UnitOfWork() {
        entityManager = Persistence.createEntityManagerFactory("aguatziPU").createEntityManager();
    }

    private EntityManager getEntityManager() {
        return (entityManager != null)
                ? entityManager
                : (entityManager = Persistence.createEntityManagerFactory("aguatziPU").createEntityManager());
    }

    public UsuariosRepository usuariosRepository() {
        return (_usuariosRepository != null)
                ? _usuariosRepository
                : (_usuariosRepository = new UsuariosRepository(getEntityManager()));
    }
    
    public CCLRepository cclRepository(){
        return (_cclRepository != null)
                ? _cclRepository
                : (_cclRepository = new CCLRepository(getEntityManager()));
    }
    
    public CCRRepository ccrRepository(){
        return (_ccrRepository != null)
                ? _ccrRepository
                : (_ccrRepository = new CCRRepository(getEntityManager()));
    }    
    
    public ComprasRepository comprasRepository(){
        return (_comprasRepository != null)
                ? _comprasRepository
                : (_comprasRepository = new ComprasRepository(getEntityManager()));
    }

    public EmpleadosRepository empleadosRepository(){
        return (_empleadosRepository != null)
                ? _empleadosRepository
                : (_empleadosRepository = new EmpleadosRepository(getEntityManager()));        
    }
    
    public GastosRepository gastosRepository(){
        return (_gastosRepository != null)
                ? _gastosRepository
                : (_gastosRepository = new GastosRepository(getEntityManager()));        
    }
    
    public HorariosRepository horariosRepository(){
        return (_horariosRepository != null)
                ? _horariosRepository
                : (_horariosRepository = new HorariosRepository(getEntityManager()));        
    }
    
    public ProduccionesRepository produccionesRepository(){
        return (_produccionesRepository != null)
                ? _produccionesRepository
                : (_produccionesRepository = new ProduccionesRepository(getEntityManager()));        
    }
}
