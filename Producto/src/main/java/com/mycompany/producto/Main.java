package com.mycompany.producto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RegistrarUsuario registrarUsuario = new RegistrarUsuario();
        IniciarSesion iniciarSesion = new IniciarSesion();

        int opcion = 0;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Cancelar");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    registrarUsuario.accederRegistro();
                    System.out.println("Ingrese la contraseña:");
                    String contraseña = scanner.nextLine();
                    System.out.println("Ingrese los datos personales:");
                    System.out.println("Nombre:");
                    String nombre = scanner.nextLine();
                    System.out.println("Apellido:");
                    String apellido = scanner.nextLine();
                    System.out.println("DNI:");
                    int dni = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer del scanner

                    DatosPersonales datosPersonales = new DatosPersonales(nombre, apellido, dni);
                    Usuario usuario = registrarUsuario.ingresarDatos(contraseña, datosPersonales);
                    System.out.println("Cuenta bancaria creada: " + usuario.getCuentaBancaria());
                    break;
                case 2:
                    iniciarSesion.accederLogin();
                    System.out.println("Ingrese la contraseña:");
                    String contraseñaIngresada = scanner.nextLine();
                    System.out.println("Ingrese la cuenta bancaria:");
                    String cuentaBancaria = scanner.nextLine();
                    iniciarSesion.verificarCuentaBancaria(cuentaBancaria);
                    break;
                case 3:
                    System.out.println("Cancelando...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 3);
    }
}
