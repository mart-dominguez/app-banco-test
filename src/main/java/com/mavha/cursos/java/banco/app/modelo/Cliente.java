/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavha.cursos.java.banco.app.modelo;

import java.util.Date;

/**
 *
 * @author martdominguez
 */
public class Cliente {
    private Integer id;
    private String nombre;
    private String cuit;
    private byte[] huella;
    private Date fechaNacimiento;
    private Double patrimonio;
    

    public Cliente() {
    }

    public Cliente(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public Cliente(Integer id, String nombre, String cuit, byte[] huella, Date fechaNacimiento, Double patrimonio) {
        this.id = id;
        this.nombre = nombre;
        this.cuit = cuit;
        this.huella = huella;
        this.fechaNacimiento = fechaNacimiento;
        this.patrimonio = patrimonio;
    }

    public Cliente(Integer id, String nombre, String cuit, Date fechaNacimiento, Double patrimonio) {
        this.id = id;
        this.nombre = nombre;
        this.cuit = cuit;
        this.fechaNacimiento = fechaNacimiento;
        this.patrimonio = patrimonio;
    }
    
    
    
}
