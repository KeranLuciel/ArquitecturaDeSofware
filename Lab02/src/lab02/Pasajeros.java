package lab02;

import java.util.ArrayList;
import java.util.List;

public class Pasajeros {
    
    private String nombre;
    private String direccion;
    private String numeroPasaporte;
    private Compañia listavuelos;
//    public Pasajeros(){
//    }
    
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
    
    public List<Vuelos> buscarVuelosporDestino(String origen, String destino, String fecha){
        List<Vuelos> vuelosencontrados = new ArrayList<>();
        for (Vuelos vuelo: listavuelos.getVuelos()){
            if (vuelo.getOrigen().equalsIgnoreCase(origen) && vuelo.getDestino().equalsIgnoreCase(destino) && vuelo.getFecha().equalsIgnoreCase(fecha)){
                vuelosencontrados.add(vuelo);
            }
        }
        return vuelosencontrados;
    }
}
