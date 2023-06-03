/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.producto;

public class RegistroUsuario {
    public void accederRegistro() {
        System.out.println("Accediendo al registro de usuario...");
    }

    public Usuario ingresarDatos(String contraseña, DatosPersonales datosPersonales) {
        System.out.println("Ingresando datos del usuario...");
        Usuario usuario = new Usuario(null, contraseña, datosPersonales);
        crearCuentaBancaria(usuario);
        return usuario;
    }

    public boolean validarDatos(Usuario usuario) {
        boolean datosValidos = true;

        if (usuario.getContraseña().isEmpty()) {
            datosValidos = false;
            System.out.println("La contraseña no puede estar vacía.");
        }

        if (usuario.getDatosPersonales() == null) {
            datosValidos = false;
            System.out.println("Los datos personales no pueden estar vacíos.");
        }

        return datosValidos;
    }

    private void crearCuentaBancaria(Usuario usuario) {
        System.out.println("Creando cuenta bancaria para el usuario...");
        String cuentaBancaria = generarNumeroCuenta();
        usuario.setCuentaBancaria(cuentaBancaria);
        CuentaBancaria cuenta = new CuentaBancaria(cuentaBancaria, 0.0);
        System.out.println("Cuenta bancaria creada: " + cuentaBancaria);
    }

    private String generarNumeroCuenta() {
        StringBuilder numeroCuenta = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            int digito = (int) (Math.random() * 10);
            numeroCuenta.append(digito);
        }
        return numeroCuenta.toString();
    }
}

