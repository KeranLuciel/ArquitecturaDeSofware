package lab02;

import java.util.List;

public class Reserva {
        
    private Pasajeros pasajero;
    private List<Vuelos> vuelos;
    private double costoTotal;
    
    public Reserva(Pasajeros pasajero, List<Vuelos> vuelos, double costoTotal) {
        this.pasajero = pasajero;
        this.vuelos = vuelos;
        this.costoTotal = costoTotal;
    }
    
    public Pasajeros getPasajero() {
        return pasajero;
    }
    
    public void setPasajero(Pasajeros pasajero) {
        this.pasajero = pasajero;
    }
    
    public List<Vuelos> getVuelos() {
        return vuelos;
    }
    
    public void setVuelos(List<Vuelos> vuelos) {
        this.vuelos = vuelos;
    }
    
    public double getCostoTotal() {
        return costoTotal;
    }
    
    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }
    
}
