/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package com.dao;

import com.model.Galeria;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author usuario
 */
@Local
public interface GaleriaDAOLocal {
    void addGaleria(Galeria galeria);
    void editGaleria(Galeria galeria);
    void deleteGaleria(int galeriaId);
    Galeria getGaleria(int galeriaId);
    List<Galeria> getAllGaleria();   
}
