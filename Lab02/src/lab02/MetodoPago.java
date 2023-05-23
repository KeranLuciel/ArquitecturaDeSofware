package lab02;

abstract class MetodoPago {
    abstract void pagar(double monto);
}

class TarjetaCredito extends MetodoPago {
    private String numeroTarjeta;
    private String fechaExpiracion;
    private String codigoSeguridad;

    TarjetaCredito(String numeroTarjeta, String fechaExpiracion, String codigoSeguridad) {
        this.numeroTarjeta = numeroTarjeta;
        this.fechaExpiracion = fechaExpiracion;
        this.codigoSeguridad = codigoSeguridad;
    }

    @Override
    void pagar(double monto) {
        System.out.println("Realizando pago con tarjeta de crédito...");
        // Lógica para procesar el pago con tarjeta de crédito
        System.out.println("Se ha realizado el pago de $" + monto + " con tarjeta de crédito.");
    }
}

// Clase para el pago con PayPal
class PayPal extends MetodoPago {
    private String correoElectronico;
    private String contraseña;

    PayPal(String correoElectronico, String contraseña) {
        this.correoElectronico = correoElectronico;
        this.contraseña = contraseña;
    }

    @Override
    void pagar(double monto) {
        System.out.println("Realizando pago con PayPal...");
        // Lógica para procesar el pago con PayPal
        System.out.println("Se ha realizado el pago de $" + monto + " con PayPal.");
    }
}

// Clase para el pago en efectivo
class Efectivo extends MetodoPago {
    
    @Override
    void pagar(double monto) {
        System.out.println("Realizando pago en efectivo...");
        // Lógica para procesar el pago en efectivo
        System.out.println("Se ha realizado el pago de $" + monto + " en efectivo.");
    }
}
