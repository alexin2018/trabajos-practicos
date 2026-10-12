package trabajo3;;
public class Furgoneta extends Vehiculo {

    private static final double ADICIONAL_CADENA_FRIO = 7500.0;

    private boolean tieneRefrigeracion;

    public Furgoneta(String patente, String marca, double costoBaseKm, boolean tieneRefrigeracion) {
        super(patente, marca, costoBaseKm);
        this.tieneRefrigeracion = tieneRefrigeracion;
    }

    @Override
    public double calcularCostoViaje(double distanciaKm) {
        double costo = super.calcularCostoViaje(distanciaKm);
        if (tieneRefrigeracion) {
            costo += ADICIONAL_CADENA_FRIO;
        }
        return costo;
    }

    @Override
    public void mostrarFicha() {
        System.out.println("[Vehículo] Furgoneta | Patente: " + patente
                + " | Marca: " + marca
                + " | Refrigerado: " + (tieneRefrigeracion ? "Sí" : "No"));
    }
}