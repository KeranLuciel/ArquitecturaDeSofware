package lab02;

import java.util.ArrayList;
import java.util.List;

public final class Compañia {
    
    private String nombre;
    private String contraseña;
    private List<Vuelos> listavuelos;
    
    public Compañia() {
        this.nombre = nombre;
        this.listavuelos = new ArrayList<>();
        
        agregarVuelos(new Vuelos("Trujillo", "Lima", "15-08-2023", 25));
        agregarVuelos(new Vuelos("Chimbote", "Lima", "15-08-2023", 25));
        agregarVuelos(new Vuelos("Chiclayo", "Lima", "15-08-2023", 25));
    } 
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public List<Vuelos> getVuelos() {
        return listavuelos;
    }
    
    public void setVuelos(List<Vuelos> vuelos) {
        this.listavuelos = vuelos;
    }
   
    public void agregarVuelos(Vuelos vuelos){
        listavuelos.add(vuelos);
    }
    
    public void registrarAdmin(String nombre, String contraseña) {
        
        if (nombre != null && !nombre.isEmpty() && contraseña != null && !contraseña.isEmpty()) {
            
            this.nombre = nombre;
            this.contraseña = contraseña;
            System.out.println("\n----------------------------------");
            System.out.println("Administrador registrado correctamente");
            System.out.println("----------------------------------");
        } else {
            System.out.println("\n----------------------------------------------------");
            System.out.println("Error: Falta información para registrar al administrador");
            System.out.println("----------------------------------------------------");
        }
    }
    
    public boolean login(String nombre, String contraseña) {
        if (this.nombre.equalsIgnoreCase(nombre) && this.contraseña.equalsIgnoreCase(contraseña)) {
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
