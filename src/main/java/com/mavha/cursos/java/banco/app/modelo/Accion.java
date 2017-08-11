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
public class Accion extends Inversion{
    private Double ultimaCotizacion;
    private Integer cantidad;

    @Override
    public Double comision() {
        return this.ultimaCotizacion * this.cantidad * 0.015;
    }
    
    public Accion() {
    }

    public Accion(String nombre, Double ultimaCotizacion, Integer cantidad) {
        this.nombre = nombre;
        this.ultimaCotizacion = ultimaCotizacion;
        this.cantidad = cantidad;
    }

    
    
    
    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
    

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

    public Double getUltimaCotizacion() {
        return ultimaCotizacion;
    }

    public void setUltimaCotizacion(Double ultimaCotizacion) {
        this.ultimaCotizacion = ultimaCotizacion;
    }

    
}
