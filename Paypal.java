public class Paypal implements Pago, PagoConDescuento{
    private String email;

    public Paypal(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        //acceder al precio del producto
        //double totalDescontado = (porcentaje / 100) *3000;
        System.out.println("El descuento es del % "+porcentaje+ " con PAYPAL");

    }
    @Override
    public void procesarPago(double totalDescontado) {
        //double precioProducto = 3000 - totalDescontado;
        System.out.println("Procesando pago con PAYPAL" );
    }
}
