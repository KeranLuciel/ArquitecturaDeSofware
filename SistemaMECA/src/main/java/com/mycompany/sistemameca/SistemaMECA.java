
package com.mycompany.sistemameca;

public class SistemaMECA {

    public static void main(String[] args) {
        System.out.println("SISTEMA MECA");
        Tarjeta tarjeta = new Tarjeta();
        Cliente cliente = tarjeta.crearTarjetaCliente(8548, "Yolanda", "Flores", "Av. Peru 258");
        System.out.println(cliente.toString());
    }
}
