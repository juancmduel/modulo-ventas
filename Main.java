public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto(1, "Teclado", 45.90, 10);
        Producto p2 = new Producto(2, "Mouse", 25.50, 15);

        Cliente cliente = new Cliente(1, "Juan Perez", "12345678");

        Venta venta = new Venta(cliente);
        venta.agregarDetalle(p1, 2);
        venta.agregarDetalle(p2, 1);

        venta.mostrarResumen();
    }
}
