package lab02;

import java.util.ArrayList;
import java.util.List;

public class Compañia {

    private String nombre;
    private List<Vuelos> vuelos;
    
    public Compañia(String nombre) {
        this.nombre = nombre;
        this.vuelos = new ArrayList<>();
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public List<Vuelos> getVuelos() {
        return vuelos;
    }
    
    public void setVuelos(List<Vuelos> vuelos) {
        this.vuelos = vuelos;
    }
   
}
