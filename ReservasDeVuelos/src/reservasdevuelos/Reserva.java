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
//        
//        boolean asientoDisponible = vuelo.verificarAsientoDisponible(asiento);
//        if (asientoDisponible) {
//            System.out.println("El asiento está disponible.");
//        } else {
//            System.out.println("El asiento seleccionado no está disponible.");
//        }
//        return asientoDisponible;
//    }
//
//    public boolean validarReserva() {
//        
//        boolean asientoValido = verificarAsientos();
//        if (asientoValido) {
//            System.out.println("La reserva es válida.");
//        } else {
//            System.out.println("La reserva no es válida debido a la falta de disponibilidad de asientos.");
//        }
//        return asientoValido;
//    }
}

