public class TajetaDeCredito implements Pago , PagoConDescuento {

    private int numeroTarjeta;

    public TajetaDeCredito(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }


    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        //acceder al precio del producto
        //double totalDescontado = (porcentaje / 100) *3000;
        System.out.println("El descuento es del % "+porcentaje+ " con CREDITO");

    }
    @Override
    public void procesarPago(double totalDescontado) {
        //double precioProducto = 3000 - totalDescontado;
        System.out.println("Pago procesado.. ");
    }
}
