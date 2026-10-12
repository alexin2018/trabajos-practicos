package trabajo3;;
public class Camion extends Vehiculo {

    private static final double RECARGO_POR_TONELADA = 2000.0;
    private static final double CARGO_FIJO_CARGA_PESADA = 2500.0;

    private double capacidadToneladas;

    public Camion(String patente, String marca, double costoBaseKm, double capacidadToneladas) {
        super(patente, marca, costoBaseKm);
        this.capacidadToneladas = capacidadToneladas;
    }

    @Override
    public double calcularCostoViaje(double distanciaKm) {
        return super.calcularCostoViaje(distanciaKm)
                + capacidadToneladas * RECARGO_POR_TONELADA
                + CARGO_FIJO_CARGA_PESADA;
    }

    @Override
    public void mostrarFicha() {
        System.out.println("[Vehiculo] Camion | Patente: " + patente
                + " | Marca: " + marca + " | Toneladas: " + capacidadToneladas);
    }
}