package reservasdevuelos;

import java.util.Scanner;

public class ReservasDeVuelos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        boolean volverMenu = true;
        
        do {
            System.out.println("\n>>> BIENVENIDO A NUESTRO SISTEMA DE RESERVAS <<<");
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Registrarse");
            System.out.println("2. Ingresar");
            System.out.println("3. Salir");
            GestorUsuario gestorusuario = new GestorUsuario();
            int op = scanner.nextInt();
            switch (op){
                case 1:
                    gestorusuario.registrar();
                    break;
                case 2:
                    gestorusuario.iniciarSesion();
                    break;
                case 3:
                    volverMenu = false;
                    break;
            }
        } while (volverMenu);
    }
    
}
