import java.util.ArrayList;
import java.util.List;

public class Venta {
    private static int contador = 1;

    private int id;
    private Cliente cliente;
    private List<DetalleVenta> detalles;

    public Venta(Cliente cliente) {
        this.id = contador++;
        this.cliente = cliente;
        this.detalles = new ArrayList<>();
    }

    public void agregarDetalle(Producto producto, int cantidad) {
        detalles.add(new DetalleVenta(producto, cantidad));
        producto.reducirStock(cantidad);
    }

    public double getTotal() {
        double total = 0;
        for (DetalleVenta d : detalles) {
            total += d.getSubtotal();
        }
        return total;
    }

    public void mostrarResumen() {
        System.out.println("Venta #" + id + " - Cliente: " + cliente);
        for (DetalleVenta d : detalles) {
            System.out.println("  " + d);
        }
        System.out.println("  Total: S/ " + getTotal());
    }
}
