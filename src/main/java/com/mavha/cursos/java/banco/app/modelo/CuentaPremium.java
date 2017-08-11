/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavha.cursos.java.banco.app.modelo;

/**
 *
 * @author martdominguez
 */
public class CuentaPremium extends Cuenta{
    private Double descubierto;

    @Override
    public void depositar(Double monto) {
        this.kmsAerolinea +=  monto.intValue()/10;
        this.saldo+=monto;
    }
    
    public CuentaPremium() {
    }

    public CuentaPremium(String CBU, Cliente cliente) {
        super(CBU, cliente);
    }
    
    
    
    public void extraer(Double extraccion){
        if(this.descubierto-extraccion+descubierto>0) super.extraer(extraccion);
    }
    
    public boolean reservarSeguroViajero(){
        //do algo
        return true;
    }


    
}
