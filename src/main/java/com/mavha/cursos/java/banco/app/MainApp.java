/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavha.cursos.java.banco.app;

import com.mavha.cursos.java.banco.app.modelo.Accion;
import com.mavha.cursos.java.banco.app.modelo.Cliente;
import com.mavha.cursos.java.banco.app.modelo.Comisionable;
import com.mavha.cursos.java.banco.app.modelo.Cuenta;
import com.mavha.cursos.java.banco.app.modelo.CuentaPremium;
import com.mavha.cursos.java.banco.app.modelo.CuentaSueldo;
import com.mavha.cursos.java.banco.app.modelo.Inversion;

/**
 *
 * @author martdominguez
 */
public class MainApp {
    public static void main(String[] args){
        Cliente cliente = new Cliente("Martin", "123");
        Cuenta cta1 = new CuentaPremium("15627000", cliente);
        Cuenta cta2 = new CuentaSueldo("15627000", cliente);
        cta1.depositar(100.0);
        cta2.depositar(100.0);
        Accion acc1 = new Accion("TS",250.0,100);
        Accion acc2 = new Accion("PAMP",40.0,200);
        cliente.getCuentas()[0]=cta1;
        cliente.getCuentas()[1]=cta2;
        cliente.getAcciones()[0]=acc1;
        cliente.getAcciones()[1]=acc2;
        Double comisiones = comisiones(cliente.getAcciones());
        comisiones += comisiones(cliente.getCuentas());
        
    }
    
    public static Double balance(Cuenta[] cuentas){
        Double balance = 0.0;
        for(Cuenta c : cuentas) balance+=c.saldo();
        return balance;
    }
    
    public static Double comisiones(Comisionable[] com){
        Double comisiones = 0.0;
        for(Comisionable c:com) comisiones += c.comision();
        return comisiones;
    }
    
}
