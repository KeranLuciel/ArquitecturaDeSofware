package reservasdevuelos;

import java.util.ArrayList;
import java.util.List;

public final class ListaVuelos {
    
    private List<Vuelos> listavuelos;
    
    public ListaVuelos(){
        
        listavuelos = new ArrayList<>();
        
        agregarVuelos(new Vuelos("Trujillo", "Lima", "15-08-2023", 160));
        agregarVuelos(new Vuelos("Chimbote", "Lima", "16-08-2023", 150));
        agregarVuelos(new Vuelos("Chiclayo", "Lima", "15-08-2023", 180));
        agregarVuelos(new Vuelos("Lima", "Piura", "20-08-2023", 155));
        agregarVuelos(new Vuelos("Tacna", "Chimbote", "01-08-2023", 160));
        agregarVuelos(new Vuelos("Arequipa", "Chiclayo", "18-08-2023", 150));
    
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
    
    public void quitarVuelo(Vuelos vuelos) {
        listavuelos.remove(vuelos);
    }
    
    public List<Vuelos> buscarVuelos(String origen, String destino, String fecha, int numeropasajeros){
        List<Vuelos> vuelosencontrados = new ArrayList<>();
        for (Vuelos vuelo: listavuelos){
            if (vuelo.getOrigen().equalsIgnoreCase(origen) && 
                    vuelo.getDestino().equalsIgnoreCase(destino) && 
                    vuelo.getFecha().equalsIgnoreCase(fecha) &&
                    Integer.valueOf(vuelo.getNumeroPasajeros()).equals(numeropasajeros)){
                vuelosencontrados.add(vuelo);
            }
        }
        return vuelosencontrados;
    }
    
    public void obtenerVuelos(){
        System.out.println("-----------------------");
        for (Vuelos vuelo : listavuelos){
        System.out.println("Origen: " + vuelo.getOrigen());
        System.out.println("Destino: " + vuelo.getDestino());
        System.out.println("Fecha: " + vuelo.getFecha());
        System.out.println("Numero Pasajeros: " + vuelo.getNumeroPasajeros());
        }
    }
}
