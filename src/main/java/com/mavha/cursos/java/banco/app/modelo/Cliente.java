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
    private Cuenta[] cuentas;
    private Inversion[] acciones;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public byte[] getHuella() {
        return huella;
    }

    public void setHuella(byte[] huella) {
        this.huella = huella;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Double getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(Double patrimonio) {
        this.patrimonio = patrimonio;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }

    public Inversion[] getAcciones() {
        return acciones;
    }

    public void setAcciones(Inversion[] acciones) {
        this.acciones = acciones;
    }
    
    

    public Cliente() {
        this.cuentas = new Cuenta[3];
        this.acciones = new Accion[3];
    }

    public Cliente(String nombre, String cuit) {
        this();
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public Cliente(Integer id, String nombre, String cuit, byte[] huella, Date fechaNacimiento, Double patrimonio) {
        this();
        this.id = id;
        this.nombre = nombre;
        this.cuit = cuit;
        this.huella = huella;
        this.fechaNacimiento = fechaNacimiento;
        this.patrimonio = patrimonio;
    }

    public Cliente(Integer id, String nombre, String cuit, Date fechaNacimiento, Double patrimonio) {
        this();
        this.id = id;
        this.nombre = nombre;
        this.cuit = cuit;
        this.fechaNacimiento = fechaNacimiento;
        this.patrimonio = patrimonio;
    }
    
    
}
