package llanquihuetourapp.model;

public class RutaGastronomica extends ServicioTuristico {
    private final int numeroDeParadas;

    public RutaGastronomica(String nombre, double duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    public int getNumeroDeParadas() { return numeroDeParadas; }

    @Override
    public void mostrarInformacion() {
        System.out.println("🍽️ RUTA GASTRONÓMICA");
        System.out.println("Nombre: " + nombre);
        System.out.println("Duración: " + duracionHoras + " horas");
        System.out.println("Número de paradas: " + numeroDeParadas);
        System.out.println("-----------------------------------");
    }

    @Override
    public String toString() {
        return super.toString() + " | Paradas: " + numeroDeParadas;
    }
}