package reservasdevuelos;

public class AsientoDisponible extends Asiento{
    
    private int numeroAsiento;
    
    public AsientoDisponible(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }
    
    @Override
    public void asignarAsiento() {
        System.out.println("El asiento " + numeroAsiento + " asignando asiento disponible...");
    }
    
    @Override
    public void mostrarAsientosDisponibles() {
        System.out.println("El asiento " + numeroAsiento + " mostrando asientos disponibles...");
    }
}
