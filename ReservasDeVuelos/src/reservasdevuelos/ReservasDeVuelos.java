package reservasdevuelos;

import java.util.List;
import java.util.Scanner;

public class ReservasDeVuelos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        boolean volverMenu = true;
        ListaVuelos listaVuelos = new ListaVuelos();
        GestorUsuario gestorusuario = new GestorUsuario();
        
        do {
            System.out.println("\n>>> BIENVENIDO A NUESTRO SISTEMA DE RESERVAS <<<");
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Registrarse");
            System.out.println("2. Ingresar");
            System.out.println("3. Salir");
            
            int op = scanner.nextInt();
            switch (op){
                case 1:
                    gestorusuario.registrar();
                    break;
                case 2:
                    gestorusuario.iniciarSesion();
                        boolean volverMenuUsuario = true;
                        do {
                            System.out.println("\n--- MENÚ DE USUARIO ---");
                            System.out.println("¿Qué desea hacer?");
                            System.out.println("1. Buscar Vuelos");
                            System.out.println("2. Realizar Reserva");
                            System.out.println("3. Manager de Reservas");
                            System.out.println("4. Salir");

                            int opcionUsuario = scanner.nextInt();

                            switch (opcionUsuario) {
                                case 1:
                                    System.out.println("\n=== Busqueda de Vuelos ===");
                                    System.out.print("Ingrese el origen de vuelo: " );
                                    String origen = scanner.nextLine();
                                    scanner.nextLine();
                                    System.out.print("Ingrese el destino de vuelo: " );
                                    String destino = scanner.nextLine();
                                    System.out.print("Ingrese la fecha (dd-mm-yy): " );
                                    String fecha = scanner.nextLine();
                                    System.out.print("Ingrese el numero de pasajeros: " );
                                    int numeropasajeros = scanner.nextInt();
                                    List<Vuelos> vuelosencontrados = listaVuelos.buscarVuelos(origen, destino, fecha, numeropasajeros);
                                    if (vuelosencontrados.isEmpty()) {
                                        System.out.println("\n-----------------------");
                                        System.out.println("No se encontro el vuelo");
                                        System.out.println("-----------------------");
                                    } else {
                                        for (Vuelos vuelo : vuelosencontrados) {
                                            listaVuelos.obtenerVuelos();
                                        }
                                    }
                                    listaVuelos.obtenerVuelos();
                                    break;
                                    
                                case 2:
                                     
//                                    System.out.println("Ingrese el número de vuelo para realizar la reserva: ");
//                                    int numeroVuelo = scanner.nextInt();
//                                    scanner.nextLine();
//
//                                    Vuelos vueloSeleccionado = buscarVuelos(numeroVuelo, listaVuelos);
//                                    if (vueloSeleccionado != null) {
//                                        System.out.println("Ingrese la fecha de la reserva (DD-MM-YYYY): ");
//                                        String fechaReserva = scanner.nextLine();
//
//                                        System.out.println("Ingrese el número de asientos a reservar: ");
//                                        int numeroAsientos = scanner.nextInt();
//                                        scanner.nextLine();
//
//                                        List<Asiento> asientosDisponibles = vueloSeleccionado.getAsientosDisponibles();
//                                        if (asientosDisponibles.size() >= numeroAsientos) {
//                                            List<Asiento> asientosReservados = asientosDisponibles.subList(0, numeroAsientos);
//
//                                            Reserva reserva = new Reserva(usuario, vueloSeleccionado, asientosReservados, fechaReserva);
//                                            gestorReserva.agregarReserva(reserva);
//
//                                            System.out.println("Reserva realizada con éxito. Detalles de la reserva:");
//                                            System.out.println(reserva.toString());
//                                        } else {
//                                            System.out.println("No hay suficientes asientos disponibles.");
//                                        }
//                                    } else {
//                                        System.out.println("Número de vuelo inválido.");
//                                    }
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    volverMenuUsuario = false;
                                    break;
                                default:
                                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                                    break;
                            }
                        } while (volverMenuUsuario);
                    break;
                case 3:
                    volverMenu = false;
                    break;
            }
        } while (volverMenu);
    }
    
}
