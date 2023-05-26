package com.mycompany.sistemameca;

import java.util.ArrayList;
import java.util.List;

class Sistema{
    public Tarjeta crearTarjeta(int codigo, String nombre, String apellidos, String direccion, String modelo, String marca,
        String color, String licencia, String fecha, String descripcionProblema){
        
        Cliente cliente = new Cliente(codigo, nombre, apellidos, direccion);
        Vehiculo vehiculo = new Vehiculo(modelo, marca, color, licencia);
        List<Problema> problemas = new ArrayList<>();
        Problema problema = new Problema(fecha, descripcionProblema);
        problemas.add(problema);

        return new Tarjeta(cliente, vehiculo, problemas);
    }
}

public class SistemaMECA {
    
    public static void main(String[] args) {
        System.out.println("SISTEMA MECA");
        
        // Crear instancias de Cliente, Vehiculo y Problema
//    Cliente cliente = new Cliente(8548, "Yolanda", "Flores", "Av. Peru 258");
//    Vehiculo vehiculo = new Vehiculo("Corolla", "Toyota", "Rojo", "ABC123");
//    List<Problema> problemas = new ArrayList<>();
//    Problema problema1 = new Problema("2023-05-23", "Problema en el motor");
    
    // Crear instancia de Tarjeta
//    Tarjeta tarjeta = new Tarjeta(cliente, vehiculo, problemas);
//        Tarjeta tarjeta = new Tarjeta(cliente, vehiculo, problema);
//        tarjeta.crearTarjeta(8548, "Yolanda", "Flores", 
//                "Av. Peru 258", "Corolla", "Toyota", "Rojo", "ABC123", problemas);
//        System.out.println(tarjeta.toString());
//        System.out.println(vehiculo.toString());
//        System.out.println(problemas.toString());

        Sistema sistema = new Sistema();
        List<Problema> problemas = new ArrayList<>();
        Tarjeta tarjeta = sistema.crearTarjeta(8548, "Yolanda", "Flores", 
                "Av. Peru 123", "Corrolla", "Toyota", "Rojo", "154A", "14-10-2022", "Problema en el motor");
        System.out.println(tarjeta.toString());
    }
}

