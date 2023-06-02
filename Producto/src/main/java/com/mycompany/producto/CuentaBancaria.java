/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.producto;

/**
 *
 * @author yflor
 */
public class CuentaBancaria {
    
    private String nrocuenta;
    private double saldo;
    
    public CuentaBancaria(String nrocuenta, double saldo){
        this.nrocuenta = nrocuenta;
        this.saldo = saldo;  
    }
    
    public void retirar(double monto){
        this.saldo = saldo - monto;
        System.out.println("Retiro del monto " + monto + " realizado con éxito");
    }
    
    public void abonar(double monto){
        this.saldo = saldo + monto;
        System.out.println("Abono del monto " + monto + " realizado con éxito");
    }
}
