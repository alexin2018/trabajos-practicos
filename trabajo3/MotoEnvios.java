
package trabajo3;
public class MotoEnvios extends Vehiculo {

    private static final double BONIFICACION_LIVIANO = 0.15; 

    public MotoEnvios(String patente, String marca, double costoBaseKm) {
        super(patente, marca, costoBaseKm);
    }

    @Override
    public double calcularCostoViaje(double distanciaKm) {
        return super.calcularCostoViaje(distanciaKm) * (1 - BONIFICACION_LIVIANO);
    }

    @Override
    public void mostrarFicha() {
        System.out.println("[Vehiculo] MotoEnvios | Patente: " + patente
                + " | Marca: " + marca + " | Mensajeria liviana");
    }
}