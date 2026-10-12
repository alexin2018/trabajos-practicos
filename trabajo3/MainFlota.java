package trabajo3;
public class MainFlota {

    public static void main(String[] args) {
        final double DISTANCIA_KM = 150.0;

        Vehiculo[] flota = {
            new Camion("AA123BB", "Scania", 600.0, 18.0),
            new Furgoneta("AF456CD", "Mercedes-Benz", 400.0, true),
            new MotoEnvios("A099XYZ", "Honda", 180.0)
        };

        System.out.println("=== Reporte de Operaciones de Flota ===");

        double total = 0;
        for (Vehiculo v : flota) {
            v.mostrarFicha();
            double costo = v.calcularCostoViaje(DISTANCIA_KM);
            System.out.println("Costo de viaje (" + DISTANCIA_KM + " km): $" + costo);
            System.out.println("--------------------------------------------------");
            total += costo;
        }

        System.out.println("Costo total operativo de la flota: $" + total);
    }
}