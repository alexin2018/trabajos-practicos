package gestioninventario;

public class MainInventario {
    public static void main(String[] args) {

        Producto productoTeclado = new Producto();
        productoTeclado.codigo = "P-001";
        productoTeclado.nombre = "Teclado mecánico";
        productoTeclado.precio = 45000.0;
        productoTeclado.stock = 12;

        Producto productoMouse = new Producto();
        productoMouse.codigo = "P-002";
        productoMouse.nombre = "Mouse inalámbrico";
        productoMouse.precio = 18000.0;
        productoMouse.stock = 25;

        Producto productoMonitor = new Producto();
        productoMonitor.codigo = "P-003";
        productoMonitor.nombre = "Monitor 24 pulgadas";
        productoMonitor.precio = 210000.0;
        productoMonitor.stock = 5;

        productoTeclado.imprimirFicha();
        productoTeclado.registrarVenta(3);
        productoTeclado.registrarVenta( 50);
        productoTeclado.registrarReposicion(20);
        productoTeclado.registrarReposicion(-5);   
        productoTeclado.registrarReposicion(0); 
        productoTeclado.actualizarPrecio(39900.0);

        System.out.println();

        productoMouse.imprimirFicha();
        productoMonitor.imprimirFicha();

        System.out.println();

        Producto referenciaAliasTeclado = productoTeclado;
        referenciaAliasTeclado.stock = 29;
        System.out.println("Stock de productoTeclado tras modificar copia: " + productoTeclado.stock + " (mismo objeto en el Heap)");
    }
}
