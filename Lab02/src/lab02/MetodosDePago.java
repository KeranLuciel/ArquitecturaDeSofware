package lab02;

interface MetodosDePago {
    void pagar(double monto);
}

// Pagos con tarjeta de crédito
//class PagoTarjetaCredito implements MetodosDePago {
//    private String informacionTarjeta;
//
//    public PagoTarjetaCredito(String informacionTarjeta) {
//        this.informacionTarjeta = informacionTarjeta;
//    }
//
//    public void pagar(double monto) {
//        // Lógica para procesar el pago con tarjeta de crédito
//        System.out.println("Se ha realizado el pago de $" + monto + " con tarjeta de crédito. Información de tarjeta: " + informacionTarjeta);
//    }
//    
//}
//
//// Pagos con PayPal
//class PagoPayPal implements MetodosDePago {
//    private String cuentaPayPal;
//
//    public PagoPayPal(String cuentaPayPal) {
//        this.cuentaPayPal = cuentaPayPal;
//    }
//
//    public void pagar(double monto) {
//        // Lógica para procesar el pago con PayPal
//        System.out.println("Se ha realizado el pago de $" + monto + " con PayPal. Cuenta de PayPal: " + cuentaPayPal);
//    }
//}

// Realizar el trámite de pago
class Tramite {
    public void realizarPago(MetodosDePago metodoPago, double monto) {
        metodoPago.pagar(monto);
    }
}

