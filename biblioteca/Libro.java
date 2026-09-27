package biblioteca;

public class Libro {
    private final String titulo;
    private final String autor;
    private final String isbn;
    private int copiasDisponibles;
    private double precioReposicion;

    public Libro(String titulo, String autor, String isbn, int copiasDisponibles, double precioReposicion) {
        if (titulo == null || titulo.isBlank()) {
            titulo = "Sin título";
            System.out.println("Título inválido, se usó \"Sin título\" por defecto.");
        }
        if (autor == null || autor.isBlank()) {
            autor = "Autor desconocido";
            System.out.println("Autor inválido, se usó \"Autor desconocido\" por defecto.");
        }
        if (isbn == null || isbn.isBlank()) {
            isbn = "ISBN pendiente";
            System.out.println("ISBN inválido, se usó \"ISBN pendiente\" por defecto.");
        }
        if (copiasDisponibles < 0) {
            copiasDisponibles = 0;
            System.out.println("Copias disponibles inválidas, se usó 0 por defecto.");
        }
        if (precioReposicion <= 0) {
            System.out.println("Precio de reposición inválido, se usó $15000.0 por defecto.");
            precioReposicion = 15000.0;
        }

        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.copiasDisponibles = copiasDisponibles;
        this.precioReposicion = precioReposicion;
    }

    public Libro(String titulo, String autor, String isbn) {
        this(titulo, autor, isbn, 3, 15000.0);
    }

    public boolean registrarPrestamo() {
        if (copiasDisponibles <= 0) {
            System.out.println("Error: no hay copias disponibles de \"" + titulo + "\" para prestar.");
            return false;
        }
        copiasDisponibles--;
        System.out.println("Préstamo registrado: \"" + titulo + "\". Copias disponibles: " + copiasDisponibles);
        return true;
    }

    public void registrarDevolucion() {
        copiasDisponibles++;
        System.out.println("Devolución registrada: \"" + titulo + "\". Copias disponibles: " + copiasDisponibles);
    }

    public boolean actualizarPrecioReposicion(double nuevoPrecio) {
        if (nuevoPrecio <= 0) {
            return false;
        }
        double precioPrevio = this.precioReposicion;
        this.precioReposicion = nuevoPrecio;
        System.out.println("Precio de reposición actualizado de \"" + titulo + "\": $" + precioPrevio + " -> $" + this.precioReposicion);
        return true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getCopiasDisponibles() {
        return copiasDisponibles;
    }

    public double getPrecioReposicion() {
        return precioReposicion;
    }

    public void imprimirFicha() {
        System.out.println("=== Ficha de libro ===");
        System.out.println("Título:  " + titulo);
        System.out.println("Autor:   " + autor);
        System.out.println("ISBN:    " + isbn);
        System.out.println("Copias disponibles: " + copiasDisponibles);
        System.out.println("Precio de reposición: $" + precioReposicion);
        System.out.println("=======================");
    }
}
