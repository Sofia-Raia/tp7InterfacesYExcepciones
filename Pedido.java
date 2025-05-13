import java.util.ArrayList;

public class Pedido implements Pagable, Notificable {
    private ArrayList<Producto> productos = new ArrayList<>();
    private Cliente cliente;
    private String estado = "pendiente"; //pendiente, enviado, entregado
    public Pedido() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public String getEstado() {
        return estado;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void addProducto(Producto producto) {
        productos.add(producto);

    }

    public void deleteProducto(Producto producto) {
        productos.remove(producto);
    }

    @Override
    public double calcularTotal() {
        double precioTotal = 0;
        for (Producto producto : productos) {
            precioTotal+=producto.getPrecio();
        }
        return  precioTotal;
    }
    public void mostrarProductos() {
        System.out.println("---El pedido del día es: ---");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public void cambiarEstado(String nuevoEstado){
        this.estado = nuevoEstado;
    }
    @Override
    public void notificar(String mensage) {
        //completar
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "CLIENTE: " + cliente +
                ", estado='" + estado + '\'' +
                '}';
    }
}
