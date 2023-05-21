package lab02;

import java.util.List;
import java.util.Scanner;

public class Lab02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        class Ingreso(){
            System.out.println("\n>>> BIENVENIDO A NUESTRO SISTEMA DE RESERVAS <<<");
            System.out.println("Es usted ...?");
            System.out.println("1. Pasajero");
            System.out.println("2. Administrador");
            int opc = scanner.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("");
                    System.out.println("Que desea hacer?");
                    System.out.println("1. Registrarte");
                    System.out.println("2. Ingresar");
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("Que desea hacer?");
                    System.out.println("1. Registrarte");
                    System.out.println("2. Ingresar");
                    break;
                default:
                    throw new AssertionError();
            }
        }
        
        
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
}
    
