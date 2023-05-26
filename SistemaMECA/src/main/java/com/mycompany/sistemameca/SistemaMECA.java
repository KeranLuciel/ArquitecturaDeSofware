
package com.mycompany.sistemameca;

import java.util.ArrayList;
import java.util.List;

public class SistemaMECA {

    public static void main(String[] args) {
        System.out.println("SISTEMA MECA");
        
        // Crear instancias de Cliente, Vehiculo y Problema
    Cliente cliente = new Cliente(8548, "Yolanda", "Flores", "Av. Peru 258");
    Vehiculo vehiculo = new Vehiculo("Corolla", "Toyota", "Rojo", "ABC123");
    List<Problema> problemas = new ArrayList<>();
    Problema problema1 = new Problema("2023-05-23", "Problema en el motor");
    problemas.add(problema1);

    // Crear instancia de Tarjeta
    Tarjeta tarjeta = new Tarjeta(cliente, vehiculo, problemas);
//        Tarjeta tarjeta = new Tarjeta(cliente, vehiculo, problema);
//        Cliente cliente = tarjeta.crearTarjetaCliente(8548, "Yolanda", "Flores", "Av. Peru 258");
        System.out.println(cliente.toString());
        System.out.println(vehiculo.toString());
        System.out.println(problemas.toString());
    }
}
