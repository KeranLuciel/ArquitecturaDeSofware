package reservasdevuelos;

public abstract class Asiento {
    private int numeroAsiento;
    private String estado;

    public abstract void asignarAsiento();
    public abstract void mostrarAsientosDisponibles();
}
