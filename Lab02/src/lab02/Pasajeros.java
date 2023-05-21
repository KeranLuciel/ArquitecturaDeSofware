package lab02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pasajeros {
    
    private String nombre;
    private String direccion;
    private String numeroPasaporte;
    private Compañia listavuelos;
    
    public Pasajeros(String nombre, String direccion, String numeroPasaporte, Compañia listavuelos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroPasaporte = numeroPasaporte;
        this.listavuelos = listavuelos;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getNumeroPasaporte() {
        return numeroPasaporte;
    }
    
    public void setNumeroPasaporte(String numeroPasaporte) {
        this.numeroPasaporte = numeroPasaporte;
    }
    
    public void registrarPasajero(String nombre, String direccion, String numeroPasaporte) {
        
        if (nombre != null && !nombre.isEmpty() && direccion != null && !direccion.isEmpty() && numeroPasaporte != null && !numeroPasaporte.isEmpty()) {
            
            this.nombre = nombre;
            this.direccion = direccion;
            this.numeroPasaporte = numeroPasaporte;
            System.out.println("\n----------------------------------");
            System.out.println("Pasajero registrado correctamente");
            System.out.println("----------------------------------");
        } else {
            System.out.println("\n----------------------------------------------------");
            System.out.println("Error: Falta información para registrar el pasajero");
            System.out.println("----------------------------------------------------");
        }
    }
    
    public static void buscarVuelos(Scanner scanner, Compañia compañia){
        System.out.println("\n=== Busqueda de Vuelos ===");
        System.out.print("Ingrese el origen de vuelo: " );
        String origen = scanner.nextLine();
        System.out.print("Ingrese el destino de vuelo: " );
        String destino = scanner.nextLine();
        System.out.print("Ingrese la fecha (dd-mm-yy): " );
        String fecha = scanner.nextLine();
        
        List<Vuelos> vuelosencontrados = compañia.buscarVuelos(origen, destino, fecha);
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
    
    public boolean login(String nombre, String numeroPasaporte) {
        if (this.nombre.equalsIgnoreCase(nombre) && this.numeroPasaporte.equalsIgnoreCase(numeroPasaporte)) {
            System.out.println("\n--------------------------------------");
            System.out.println("Inicio de sesión exitoso");
            System.out.println("--------------------------------------");
            return true;
        } else {
            System.out.println("\n-------------------------------------");
            System.out.println("Inicio de sesión fallido");
            System.out.println("-------------------------------------");
            return false;
        }
    }
    
}
