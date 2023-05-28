package reservasdevuelos;

import java.util.ArrayList;
import java.util.List;

public class ManagerReserva {
    
    private List<Reserva> reservas;
    
    public ManagerReserva(){
        reservas = new ArrayList<>();
    }
    
    public Reserva obtenerReserva(int idReserva) {
        for (Reserva reserva : reservas) {
            if (reserva.getId() == idReserva) {
                return reserva;
            }
        }
        return null;
    }
    
    public void cancelar(Reserva reserva) {
        reservas.remove(reserva);
    }

    public void cambiarFecha(Reserva reserva, String fecha) {
        reserva.setFecha(fecha);
    }

    public void agregarUsuario(Reserva reserva, Usuario usuario) {
        reserva.addPasajero(usuario);
    }

    public void quitarUsuario(Reserva reserva, Usuario usuario) {
        reserva.removePasajero(usuario);
    }

    public void cambiarAsiento(Reserva reserva, Asiento nuevoAsiento) {
        reserva.setAsiento(nuevoAsiento);
    }
}
