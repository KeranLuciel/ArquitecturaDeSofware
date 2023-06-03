package com.mycompany.producto;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RegistroUsuario registrarUsuario = new RegistroUsuario();
        InicioSesion iniciarSesion = new InicioSesion();

        int opcion = 0;

        do {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Cancelar");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    registrarUsuario.accederRegistro();
                    System.out.print("\nIngrese la contraseña: ");
                    String contraseña = scanner.nextLine();
                    System.out.println("Ingrese los datos personales: ");
                    System.out.print("- Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("- Apellido: ");
                    String apellido = scanner.nextLine();
                    System.out.print("- DNI: ");
                    int dni = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer del scanner

                    DatosPersonales datosPersonales = new DatosPersonales(nombre, apellido, dni);
                    Usuario usuario = registrarUsuario.ingresarDatos(contraseña, datosPersonales);
                    break;
                    
                case 2:
                    iniciarSesion.accederLogin();
                    System.out.println("Ingrese la contraseña:");
                    String contraseñaIngresada = scanner.nextLine();
                    System.out.println("Ingrese la cuenta bancaria:");
                    String cuentaBancaria = scanner.nextLine();
                    iniciarSesion.verificarCuentaBancaria(cuentaBancaria);
                    
                    boolean MenuPrincipal = true;
                    do{
                        System.out.println("\n--- MENÚ PRINCIPAL ---");
                        System.out.println("1. Realizar transaccion");
                        System.out.println("2. Cerrar sesión");
                        
                        opcion = scanner.nextInt();
                        scanner.nextLine();
                        
                        switch (opcion){
                            case 1:
                                System.out.println("\n--- Ventana Transacción ---");
                                System.out.println("1. Consultar saldo");
                                System.out.println("2. Retirar dinero");
                                System.out.println("3. Abonar dinero");
                                break;
                                
                            case 2:
                                System.out.println("Cerrando sesión...");
                                MenuPrincipal = false;
                                break;
                                
                            default:
                                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                                break;
                        }
                        
                    } while (MenuPrincipal);
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
