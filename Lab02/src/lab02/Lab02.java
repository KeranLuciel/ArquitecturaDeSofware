package lab02;

import java.util.Scanner;

public class Lab02 {

    public static void main(String[] args) {
        
        System.out.println(">>> BIENVENIDO A NUESTRO SISTEMA DE RESERVAS <<<");
        Scanner scanner = new Scanner (System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su direccion: ");
        String direccion = scanner.nextLine();
        System.out.print("Ingrese su numero de pasaporte: ");
        String numeroPasaporte = scanner.nextLine();
        Pasajeros pasajero = new Pasajeros(nombre, direccion, numeroPasaporte);
        pasajero.registrarPasajero(nombre, direccion, numeroPasaporte);
    }
    
}
