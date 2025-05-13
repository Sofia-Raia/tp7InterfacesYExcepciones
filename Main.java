public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        Producto p1 =new Producto("Leche Descremada",2000);
        pedido.addProducto(p1);
        Producto p2 =new Producto("Leche Entera",1900);
        pedido.addProducto(p2);
        Producto p3 =new Producto("galletas oreo",2300);
        pedido.addProducto(p3);
        Producto p4 =new Producto("Maná rellenas",1000);
        pedido.addProducto(p4);
        Producto p5 =new Producto("Chocolate Aguila",3000);
        pedido.addProducto(p5);
        pedido.mostrarProductos();
        double total =pedido.calcularTotal();
        System.out.println("Total $ " + total);


        TajetaDeCredito t = new TajetaDeCredito(1234567);
        t.aplicarDescuento(20);
        t.procesarPago(total);

        Paypal p =new Paypal("sofi@gmail.com");
        p.aplicarDescuento(10);
        p.procesarPago(total);


        pedido.cambiarEstado("enviado..");
        System.out.println(pedido.getEstado());
        Cliente cliente = new Cliente("Sofia Magali","sofi@gmail.com");
        cliente.notificar("Se ha enviado su PEDIDO.. ");



    }
}
