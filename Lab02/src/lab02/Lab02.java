package lab02;

import java.util.List;
import java.util.Scanner;

public class Lab02 {
    
    public static void main(String[] args) {

        Inicio inicio = new Inicio();
        inicio.iniciarSistema();
    }
}

class Inicio {
    Scanner scanner = new Scanner(System.in);
    Pasajeros pasajero;
    Compañia compañia;
    Itinerarios itinerarios;
    
    public void iniciarSistema() {
        pasajero = new Pasajeros("", "", "", compañia);
        compañia = new Compañia("");
        
        boolean volverMenuPrincipal = true;
        do{
            System.out.println("\n>>> BIENVENIDO A NUESTRO SISTEMA DE RESERVAS <<<");
            System.out.println("¿Quién es usted?");
            System.out.println("1. Pasajero");
            System.out.println("2. Administrador");
            System.out.println("3. Salir\n");
            int opc = scanner.nextInt();
            scanner.nextLine();
            
                switch (opc) {
                    case 1:
                        boolean volverMenuPasajero = true;
                        do{
                            System.out.println("");
                            System.out.println("¿Qué desea hacer?");
                            System.out.println("1. Registrarse");
                            System.out.println("2. Ingresar");
                            System.out.println("3. Salir");
                            int opcionPasajero = scanner.nextInt();
                            scanner.nextLine();

                            switch (opcionPasajero) {
                                case 1:
                                    System.out.println("");
                                    System.out.print("Ingrese su nombre: ");
                                    String nombre = scanner.nextLine();
                                    System.out.print("Ingrese su dirección: ");
                                    String direccion = scanner.nextLine();
                                    System.out.print("Ingrese su número de pasaporte: ");
                                    String numeroPasaporte = scanner.nextLine();
                                    pasajero.registrarPasajero(nombre, direccion, numeroPasaporte);
                                    break;
                                case 2:
                                    System.out.println("");
                                    System.out.print("Ingrese su nombre: ");
                                    String nombreLogin = scanner.nextLine();
                                    System.out.print("Ingrese su número de pasaporte: ");
                                    String numeroPasaporteLogin = scanner.nextLine();
                                    pasajero.login(nombreLogin, numeroPasaporteLogin);
                                    
                                    boolean volverMenuPasajeroOp = true;
                                    do{
                                        System.out.println("");
                                        System.out.println("¿Qué desea hacer?");
                                        System.out.println("1. Buscar vuelo");
                                        System.out.println("2. Ver itinerario");
                                        System.out.println("3. Salir");
                                        int opcionPasajeroOp = scanner.nextInt();
                                        scanner.nextLine();

                                        switch (opcionPasajeroOp) {
                                            case 1:
                                                Pasajeros.buscarVuelos(scanner, compañia);
                                                break;
                                            case 2:
                                                itinerarios.mostrarItinerario();
                                                break;
                                            case 3:
                                                volverMenuPasajeroOp = false;
                                                break;
                                            default:
                                                System.out.println("Error");
                                        }
                                        }while(volverMenuPasajeroOp);
                                    break;
                                case 3:
                                    volverMenuPasajero = false;
                                    break;
                                default:
                                    System.out.println("Error");
                            }
                        }while(volverMenuPasajero);
                        break;

                    case 2:
                        boolean volverMenuAdm = true;
                        do{
                            System.out.println("");
                            System.out.println("¿Qué desea hacer?");
                            System.out.println("1. Registrarse");
                            System.out.println("2. Ingresar");
                            System.out.println("3. Salir");
                            int opcionAdministrador = scanner.nextInt();
                            scanner.nextLine();

                            switch (opcionAdministrador) {
                                case 1:
                                    System.out.println("");
                                    System.out.print("Ingrese su nombre: ");
                                    String nombreAdmin = scanner.nextLine();
                                    System.out.print("Ingrese su contraseña: ");
                                    String contraseñaAdmin = scanner.nextLine();
                                    compañia.registrarAdmin(nombreAdmin, contraseñaAdmin);
                                    break;
                                case 2:
                                    System.out.println("");
                                    System.out.print("Ingrese su nombre: ");
                                    String nombreAdminLogin = scanner.nextLine();
                                    System.out.print("Ingrese su contraseña: ");
                                    String contraseñaAdminLogin = scanner.nextLine();
                                    compañia.login(nombreAdminLogin, contraseñaAdminLogin);
                                    break;
                                case 3:
                                    volverMenuAdm = false;
                                    break;
                                default:
                                    System.out.println("Error");
                            }
                        }while(volverMenuAdm);
                        break;
                    case 3:
                        volverMenuPrincipal = false;
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
        }while(volverMenuPrincipal);
    }
}

