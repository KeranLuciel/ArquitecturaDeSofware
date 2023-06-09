/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.producto;

public class DatosPersonales {
    private String nombre;
    private String apellido;
    private int dni;

    public DatosPersonales(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void obtenerDatos() {
        System.out.println("Obteniendo datos personales...");
        System.out.println("- Nombre: " + nombre);
        System.out.println("- Apellidos: " + apellido);
        System.out.println("- DNI: " + dni);
    }
}
