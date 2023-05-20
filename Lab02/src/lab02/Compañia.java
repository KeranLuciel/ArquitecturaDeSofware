package lab02;

import java.util.ArrayList;
import java.util.List;

public final class Compañia {

    private String nombre;
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

}
