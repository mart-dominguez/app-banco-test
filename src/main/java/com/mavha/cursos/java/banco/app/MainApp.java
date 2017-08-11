/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavha.cursos.java.banco.app;

import com.mavha.cursos.java.banco.app.modelo.Cliente;
import com.mavha.cursos.java.banco.app.modelo.Cuenta;
import com.mavha.cursos.java.banco.app.modelo.CuentaPremium;
import com.mavha.cursos.java.banco.app.modelo.CuentaSueldo;

/**
 *
 * @author martdominguez
 */
public class MainApp {
    public static void main(String[] args){
        Cliente cliente = new Cliente("Martin", "123");
        Cuenta cta1 = new CuentaPremium("15627000", cliente);
        Cuenta cta2 = new CuentaPremium("15627000", cliente);
        Cuenta cta3 = new CuentaSueldo("15627000", cliente);
        cta1.depositar(100.0);
        cta2.depositar(100.0);
        cta3.depositar(100.0);
    }
    
    public Double balance(Cuenta[] cuentas){
        Double balance = 0.0;
        for(Cuenta c : cuentas) balance+=c.saldo();
        return balance;
    }
    
}
