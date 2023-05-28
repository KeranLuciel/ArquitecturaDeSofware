package reservasdevuelos;

import java.util.ArrayList;
import java.util.List;

public class Reserva {
    private int id;
    private Vuelos vuelo;
    private List<Usuario> usuarios;
    private Asiento asiento;
    private String fecha;

    public Reserva(int id, Vuelos vuelo, Asiento asiento, String fecha) {
        this.id = id;
        this.vuelo = vuelo;
        this.asiento = asiento;
        this.fecha = fecha;
        this.usuarios = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public Vuelos getVuelo() {
        return vuelo;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }
    
    public String getFecha() {
        return fecha;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public void addPasajero(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void removePasajero(Usuario usuario) {
        usuarios.remove(usuario);
    }

//    public boolean verificarAsientos() {
//        // Lógica para verificar si los asientos están disponibles en el vuelo
//        // Puedes implementar tu propia lógica aquí según tus necesidades
//        return vuelo.verificarAsientoDisponible(asiento);
//    }
//
//    public boolean validarReserva() {
//        // Lógica para validar la reserva
//        // Puedes implementar tu propia lógica aquí según tus necesidades
//        return verificarAsientos();
//    }
}

