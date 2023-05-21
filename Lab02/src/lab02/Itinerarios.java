package lab02;

import java.util.ArrayList;
import java.util.List;

public class Itinerarios {
  
    private List<Vuelos> vuelo;
    
    public Itinerarios() {
        vuelo = new ArrayList<>();
    }
    
    public void agregarVuelo(Vuelos vuelos) {
        vuelo.add(vuelos);
    }
    
    public void eliminarVuelo(Vuelos vuelos) {
        vuelo.remove(vuelos);
    }
    
    public void mostrarItinerario() {
        for (Vuelos vuelos : vuelo) {
            System.out.println("Origen: " + vuelos.getOrigen());
            System.out.println("Destino: " + vuelos.getDestino());
            System.out.println("Fecha: " + vuelos.getFecha());
            System.out.println("Asientos disponibles: " + vuelos.getAsientosDisponibles());
            System.out.println("----------------------");
        }
    }
}
