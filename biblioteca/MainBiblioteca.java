package biblioteca;

public class MainBiblioteca {
    public static void main(String[] args) {

        // new Libro(); // no compila: al declarar constructores propios,
        // el constructor sin argumentos que regalaba el compilador ya no existe.

        Libro libroConDatosInvalidos = new Libro("", "Autor Anónimo", "0000000000000", 1, 15000.0);
        System.out.println("Título usado: " + libroConDatosInvalidos.getTitulo());

        System.out.println();

        Libro libroCleanCode = new Libro("Clean Code", "Robert C. Martin", "9780132350884", 1, 15000.0);

        boolean seAceptoPrecioInvalido = libroCleanCode.actualizarPrecioReposicion(-100.0);
        System.out.println("¿Se aceptó el precio -100.0? " + seAceptoPrecioInvalido + " (se mantiene el precio anterior: $" + libroCleanCode.getPrecioReposicion() + ")");

        System.out.println();

        Libro libroEfectivoJava = new Libro("Efectivo con Java", "Ana Restrepo", "9781234567897");
        libroEfectivoJava.actualizarPrecioReposicion(22000.0);

        Libro libroCienAnios = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "9780307474728", 2, 18500.0);

        System.out.println();

        libroCleanCode.imprimirFicha();
        libroEfectivoJava.imprimirFicha();
        libroCienAnios.imprimirFicha();

        System.out.println();

        libroCleanCode.registrarPrestamo();
        libroCleanCode.registrarPrestamo();
        libroCleanCode.registrarDevolucion();

        System.out.println();

        libroCleanCode.actualizarPrecioReposicion(18000.0);
    }
}
