package lab02;

import java.util.List;
import java.util.Scanner;

public class Lab02 {
    
    public static void main(String[] args) {

//        Metodo para buscar vuelos disponibles
//        pasajero.buscarVuelos(scanner, lista);
        //Inicio inicio = new Inicio();
        //inicio.iniciarSistema();
        
        
        //Agregar vuelos al Itinerarios
        Itinerarios instancia = new Itinerarios();
        instancia.mostrarItinerario();
    }
    
}

class Inicio {
    Scanner scanner = new Scanner(System.in);
    Pasajeros pasajero;
    Compañia compañia;
    
    public void iniciarSistema() {
        pasajero = new Pasajeros("", "", "", compañia);
        compañia = new Compañia("");

        System.out.println("\n>>> BIENVENIDO A NUESTRO SISTEMA DE RESERVAS <<<");
        System.out.println("¿Quién es usted?");
        System.out.println("1. Pasajero");
        System.out.println("2. Administrador\n");
        int opc = scanner.nextInt();
        scanner.nextLine();
        
        switch (opc) {
            case 1:
                System.out.println("");
                System.out.println("¿Qué desea hacer?");
                System.out.println("1. Registrarse");
                System.out.println("2. Ingresar");
                int opcionPasajero = scanner.nextInt();
                scanner.nextLine();
                
                switch (opcionPasajero) {
                    case 1:
                        System.out.println("");
                        System.out.print("Ingrese su nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese su dirección: ");
                        String direccion = scanner.nextLine();
                        System.out.print("Ingrese su número de pasaporte: ");
                        String numeroPasaporte = scanner.nextLine();
                        pasajero.registrarPasajero(nombre, direccion, numeroPasaporte);
                        break;
                    case 2:
                        System.out.println("");
                        System.out.print("Ingrese su nombre: ");
                        String nombreLogin = scanner.nextLine();
                        System.out.print("Ingrese su número de pasaporte: ");
                        String numeroPasaporteLogin = scanner.nextLine();
                        pasajero.login(nombreLogin, numeroPasaporteLogin);
                        break;
                    default:
                        throw new AssertionError();
                }
                
                break;
                
            case 2:
                System.out.println("");
                System.out.println("¿Qué desea hacer?");
                System.out.println("1. Registrarse");
                System.out.println("2. Ingresar");
                int opcionAdministrador = scanner.nextInt();
                scanner.nextLine();
                
                switch (opcionAdministrador) {
                    case 1:
                        System.out.println("");
                        System.out.print("Ingrese su nombre: ");
                        String nombreAdmin = scanner.nextLine();
                        System.out.print("Ingrese su contraseña: ");
                        String contraseñaAdmin = scanner.nextLine();
                        compañia.registrarAdmin(nombreAdmin, contraseñaAdmin);
                        break;
                    case 2:
                        System.out.println("");
                        System.out.print("Ingrese su nombre: ");
                        String nombreAdminLogin = scanner.nextLine();
                        System.out.print("Ingrese su contraseña: ");
                        String contraseñaAdminLogin = scanner.nextLine();
                        compañia.login(nombreAdminLogin, contraseñaAdminLogin);
                        break;
                    default:
                        throw new AssertionError();
                }
                
                break;
                
            default:
                throw new AssertionError();
        }
    }
}