/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavha.cursos.java.banco.app.modelo;

/**
 *
 * @author mdominguez
 */
public abstract class Inversion implements Comisionable {
    protected Integer id;
    protected String nombre;

    public Inversion() {
    }

    public Inversion(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    
}
