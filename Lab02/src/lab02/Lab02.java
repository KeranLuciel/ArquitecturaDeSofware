package lab02;

import java.util.List;
import java.util.Scanner;

public class Lab02 {
    
    Scanner scanner = new Scanner (System.in);
    Pasajeros pasajero = new Pasajeros();
    Compañia compañia = new Compañia();

    public static void main(String[] args) {
        
        System.out.print("\nIngrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su direccion: ");
        String direccion = scanner.nextLine();
        System.out.print("Ingrese su numero de pasaporte: ");
        String numeroPasaporte = scanner.nextLine();
        Compañia lista = new Compañia();
        List<Vuelos> vuelosEncontrados = lista.getVuelos();
        Pasajeros pasajero = new Pasajeros(nombre, direccion, numeroPasaporte, lista);
        pasajero.registrarPasajero(nombre, direccion, numeroPasaporte);
        System.out.println("\n=== Busqueda de Vuelos ===");
        System.out.print("Ingrese el origen de vuelo: " );
        String origen = scanner.nextLine();
        System.out.print("Ingrese el destino de vuelo: " );
        String destino = scanner.nextLine();
        System.out.print("Ingrese la fecha (dd-mm-yy): " );
        String fecha = scanner.nextLine();
        
        List<Vuelos> vuelosencontrados = pasajero.buscarVuelosporDestino(origen, destino, fecha);
        if (vuelosencontrados.isEmpty()){
            System.out.println("\n-----------------------");
            System.out.println("No se encontro el vuelo");
            System.out.println("-----------------------");
        }
        else{
            for (Vuelos vuelo : vuelosencontrados){
                vuelo.mostrarVuelo();
            }
        }
    }
    
    public class Inicio {
        
        System.out.println("\n>>> BIENVENIDO A NUESTRO SISTEMA DE RESERVAS <<<");
        System.out.println("¿Quién es usted?");
        System.out.println("1. Pasajero");
        System.out.println("2. Administrador");
        int opc = scanner.nextInt();
        
        switch (opc) {
            case 1:
                System.out.println("");
                System.out.println("¿Qué desea hacer?");
                System.out.println("1. Registrarse");
                System.out.println("2. Ingresar");
                int opcionPasajero = scanner.nextInt();
                
                switch (opcionPasajero) {
                    case 1:
                        pasajero.registrarPasajero(nombre, direccion, numeroPasaporte);
                        break;
                    case 2:
                        
                        pasajero.login(nombre, numeroPasaporte);
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
                
                switch (opcionAdministrador) {
                    case 1:
                        compañia.registrarAdmin(nombre, contraseña);
                        break;
                    case 2:
                        compañia.login(nombre, contraseña)
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
    
