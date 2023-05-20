package lab02;

import java.util.ArrayList;
import java.util.List;

public class Itinerarios {
  
    private List<Vuelos> vuelos;
    
    public Itinerarios() {
        vuelos = new ArrayList<>();
    }
    
    public List<Vuelos> getVuelos() {
        return vuelos;
    }
    
    public void setVuelos(List<Vuelos> vuelos) {
        this.vuelos = vuelos;
    }
}
