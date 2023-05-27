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
        System.out.println("---------------------------------------------------------");
        
        List<Pieza> piezasNecesarias = new ArrayList<>();
        Pieza pieza1 = new Pieza("Motor", 12345, "Fabricante1", 1);
        Pieza pieza2 = new Pieza("Batería", 67890, "Fabricante2", 2);
        System.out.println("---------------------------------------------------------");
        
        piezasNecesarias.add(pieza1);
        piezasNecesarias.add(pieza2);
        tarjeta.setPiezasNecesarias(piezasNecesarias);
        System.out.println(tarjeta.toStringWithPiezas());
        System.out.println("---------------------------------------------------------");
        
        Pedido pedido = new Pedido(1, "14-10-2022", reparacion, piezasNecesarias);
        System.out.println(pedido.toString());
        System.out.println("---------------------------------------------------------");
        
        Contabilidad contabilidad = new Contabilidad(new ArrayList<>());
        Factura factura1 = new Factura(1234, "02-11-2022", tarjeta.getCliente(),100.0, contabilidad);
        Factura factura2 = new Factura(5678, "03-11-2022", cliente, 1500.0, contabilidad);
        
        System.out.println(factura1.toString());
        System.out.println(factura2.toString());
        System.out.println("\n---------------------------------------------------------");
        
        double montoTotal = contabilidad.calcularMontoTotal();
        System.out.println("Monto total: " + montoTotal);
        System.out.println("---------------------------------------------------------");
        String conta = contabilidad.Contabilidades((int) montoTotal);
        System.out.println("\nListado brindado por Contabilidad:" + conta);
        System.out.println("\n---------------------------------------------------------");
    }
}
