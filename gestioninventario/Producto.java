package gestioninventario;

public class Producto {
    public String nombre;
    public String codigo;
    public double precio;
    public int stock;

    public void registrarVenta(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: la cantidad a vender debe ser mayor a cero.");
        } else if (cantidad > stock) {
            System.out.println("Error: stock insuficiente para vender " + cantidad + " unidades de " + nombre + ".");
        } else {
            stock -= cantidad;
            System.out.println("Venta realizada: " + cantidad + " unidades de " + nombre + ". Stock restante: " + stock);
        }
    }

    public void registrarReposicion(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: la cantidad a reponer debe ser mayor a cero.");
        } else {
            stock += cantidad;
            System.out.println("Reposición registrada: +" + cantidad + " unidades. Stock actual: " + stock);
        }
    }

    public void actualizarPrecio(double nuevoPrecio) {
        double precioPrevio = this.precio;
        this.precio = nuevoPrecio;
        System.out.println("Precio actualizado de " + nombre + ": $" + precioPrevio + " -> $" + this.precio);
    }

    public void imprimirFicha() {
        System.out.println("=== Ficha de producto ===");
        System.out.println("Código:  " + codigo);
        System.out.println("Nombre:  " + nombre);
        System.out.println("Precio:  $" + precio);
        System.out.println("Stock:   " + stock);
        System.out.println("==========================");
    }
}
