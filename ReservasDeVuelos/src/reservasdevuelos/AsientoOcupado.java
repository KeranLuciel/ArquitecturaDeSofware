package reservasdevuelos;

public class AsientoOcupado extends Asiento{

    private int numeroAsiento;
    
    public AsientoOcupado(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }
    
    @Override
    public void asignarAsiento() {
        System.out.println("El asiento " + numeroAsiento + " ya está ocupado.");
    }

    @Override
    public void mostrarAsientosDisponibles() {
        System.out.println("El asiento " + numeroAsiento + " está ocupado.");
    }
    
}
