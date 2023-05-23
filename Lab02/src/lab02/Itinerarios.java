package lab02;


public class Itinerarios {
    private Pasajeros pasajero;
    private Vuelos vuelo;
    
    public Itinerarios(Pasajeros pasajero, Vuelos vuelo){
        this.pasajero = pasajero;
        this.vuelo = vuelo;
    }
    
    /*public void modificarFecha(String nuevaFecha) {
        vuelo.setFecha(nuevaFecha);
    }
    
    public void modificarOrigenDestino(String nuevoOrigen, String nuevoDestino) {
        vuelo.setOrigen(nuevoOrigen);
        vuelo.setDestino(nuevoDestino);
    }*/

    public void mostrarItinerario() {
        System.out.println("Nombre del pasajero: " + pasajero.getNombre());
        System.out.println("Fecha: " + vuelo.getFecha());
        System.out.println("Origen: " + vuelo.getOrigen());
        System.out.println("Destino: " + vuelo.getDestino());
        System.out.println("----------------------");
    }

}
