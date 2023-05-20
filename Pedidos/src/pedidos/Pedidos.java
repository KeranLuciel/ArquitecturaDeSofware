package pedidos;

import java.util.Scanner;
        
public class Pedidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Cliente cliente = new Cliente();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el método de pago:");
        System.out.println("1. Tarjeta de Crédito");
        System.out.println("2. Efectivo");
        System.out.println("3. Cheque");
        int opcionPago = scanner.nextInt();
        
        String detallesPago = "";
        switch (opcionPago) {
            case 1: 
                System.out.println("Ingrese la fecha de caducidad:");
                String fechaCaducidad = scanner.next();
                System.out.println("Ingrese el número de tarjeta:");
                String numeroTarjeta = scanner.next();
                System.out.println("Seleccione el tipo de tarjeta (VISA o MASTERCARD):");
                String tipoTarjeta = scanner.next();
                detallesPago = "Fecha de caducidad: " + fechaCaducidad + ", Número de tarjeta: " + numeroTarjeta + ", Tipo de tarjeta: " + tipoTarjeta;
                break;
            case 2:
                System.out.println("Ingrese el monto:");
                double montoEfectivo = scanner.nextDouble();
                detallesPago = "Monto: " + montoEfectivo;
                break;
            case 3:
                System.out.println("Ingrese el nombre:");
                String nombreCheque = scanner.next();
                System.out.println("Ingrese la entidad bancaria:");
                String entidadBancaria = scanner.next();
                detallesPago = "Nombre: " + nombreCheque + ", Entidad bancaria: " + entidadBancaria;
                break;
            default:
                System.out.println("Opción de pago inválida.");
                break;
        }
        
        MedioDePago medioDePago = new MedioDePago(detallesPago, "");
//        cliente.setMedioDePago(medioDePago);
      
    }

}
