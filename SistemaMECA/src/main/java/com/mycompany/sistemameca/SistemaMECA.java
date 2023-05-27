package com.mycompany.sistemameca;

import java.util.ArrayList;
import java.util.List;

class Sistema {
    public Tarjeta crearTarjeta(int codigo, String nombre, String apellidos, String direccion, String modelo, String marca,
        String color, String licencia, String fecha, String descripcionProblema) {
        
        Cliente cliente = new Cliente(codigo, nombre, apellidos, direccion);
        Vehiculo vehiculo = new Vehiculo(modelo, marca, color, licencia);
        List<Problema> problemas = new ArrayList<>();
        Problema problema = new Problema(fecha, descripcionProblema);
        problemas.add(problema);

        return new Tarjeta(cliente, vehiculo, problemas, null);
    }
}

public class SistemaMECA {
    
    public static void main(String[] args) {
        System.out.println("SISTEMA MECA");
        
        Sistema sistema = new Sistema();
        Tarjeta tarjeta = sistema.crearTarjeta(8548, "Yolanda", "Flores", 
                "Av. Peru 123", "Corrolla", "Toyota", "Rojo", "154A", "14-10-2022", "Problema en el motor");
        
        Cliente cliente = tarjeta.getCliente();
        Reparacion reparacion = new Reparacion("15-10-2022", "Reemplazo del motor", cliente);
        
        List<Pieza> piezasNecesarias = new ArrayList<>();
        Pieza pieza1 = new Pieza("Nombre1", 1, "Fabricante1", 2);
        Pieza pieza2 = new Pieza("Nombre2", 2, "Fabricante2", 1);
        piezasNecesarias.add(pieza1);
        piezasNecesarias.add(pieza2);
        tarjeta.setPiezasNecesarias(piezasNecesarias);
        System.out.println(tarjeta.toStringWithPiezas());
        
        Factura factura = new Factura(1234, "16-05-2023", tarjeta.getCliente());
        System.out.println(factura.toString());
    }
}
