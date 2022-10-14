/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package com.dao;

import com.model.Galeria;
import javax.ejb.Stateless;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author usuario
 */
@Stateless
public class GaleriaDAO implements GaleriaDAOLocal {

    @PersistenceContext
    private EntityManager em;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Override
    public void addGaleria(Galeria galeria) {
        em.persist(galeria);
    }

    @Override
    public void editGaleria(Galeria galeria) {
        em.merge(galeria);
    }

    @Override
    public void deleteGaleria(int galeriaId) {
        em.remove(getGaleria(galeriaId));
    }

    @Override
    public Galeria getGaleria(int galeriaId) {
        return em.find(Galeria.class, galeriaId);
    }

    @Override
    public List<Galeria> getAllGaleria() {
        return em.createNamedQuery("galeria.getAll").getResultList();
    }
}
