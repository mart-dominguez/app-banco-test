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
public class CuentaSueldo extends Cuenta{

    public CuentaSueldo() {
    }

    public CuentaSueldo(String CBU, Cliente cliente) {
        super(CBU, cliente);
    }

    @Override
    public void depositar(Double monto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
