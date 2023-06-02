/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.producto;

/**
 *
 * @author yflor
 */
public class Retirar implements ITransaccion {
    
    private CuentaBancaria cuenta;
    private double monto;
    
    public Retirar(CuentaBancaria cuenta, double monto){
        this.cuenta = cuenta;
        this.monto = monto;
    }
    
    @Override
    public void ejecutar() {
        this.cuenta.retirar(this.monto);
    }
    
}
