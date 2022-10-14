/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author usuario
 */

@Entity
@Table
@NamedQueries(
        @NamedQuery(name = "galeria.getAll",query = "SELECT e FROM Galeria e"
        ))
public class Galeria implements Serializable{
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int galeriaId;
    @Column
    private String descripcion;
    @Column
    private String autor;
    @Column
    private String titulo;

    public Galeria(int galeriaId, String descripcion, String autor, String titulo) {
        this.galeriaId = galeriaId;
        this.descripcion = descripcion;
        this.autor = autor;
        this.titulo = titulo;
    }

    public Galeria() {
    }

    public int getGaleriaId() {
        return galeriaId;
    }

    public void setGaleriaId(int galeriaId) {
        this.galeriaId = galeriaId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
