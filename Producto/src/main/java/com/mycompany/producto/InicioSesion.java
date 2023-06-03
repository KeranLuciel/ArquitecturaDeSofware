/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.producto;

import java.util.Scanner;

public class InicioSesion {
    public void accederLogin() {
        System.out.println("Accediendo al login...");
    }

    public String ingresarContraseña() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la contraseña:");
        String contraseña = scanner.nextLine();
        return contraseña;
    }

    public void verificarCuentaBancaria(String cuentaBancaria) {
        System.out.println("Verificando cuenta bancaria: " + cuentaBancaria);
    }
}
