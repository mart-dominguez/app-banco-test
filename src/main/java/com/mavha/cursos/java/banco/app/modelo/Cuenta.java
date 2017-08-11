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
public  abstract class Cuenta implements Comisionable{
    protected Integer id;
    protected String CBU;
    protected Double saldo;
    protected Integer kmsAerolinea;
    protected static final Integer _MAX_TITULARES=2;
    protected Date fechaAbertura;
    protected Cliente cliente;
    
    public abstract void depositar(Double monto);
    
    public void extraer(Double monto){
        if(saldo-monto>0)  this.saldo = this.saldo-monto;
    }

    public void extraer(Double monto,Moneda moneda){
        Double aux = monto;
        switch(moneda){
            case DOLAR:
                aux = monto *18;
                break;
            case EURO:
                aux = monto * 21;
        }
        this.extraer(aux);
    }

    
    public Cuenta() {
        this.fechaAbertura = new Date();
        this.saldo = 0.0;
        this.kmsAerolinea = 5000;
    }

    
    
    public Cuenta(String CBU, Cliente cliente) {
        this();
        this.CBU = CBU;
        this.cliente = cliente;
    }
    
    
    
    public Double saldo(){
        return saldo;
    }
    

    
}
