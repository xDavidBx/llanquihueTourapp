package llanquihuetourapp.model;

public class Vehiculo implements Registrable {
    private String patente;
    private String tipo;
    private int capacidad;
    private String estado;

    public Vehiculo(String patente, String tipo, int capacidad, String estado) {
        this.patente = patente;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.estado = estado;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("🚗 VEHÍCULO");
        System.out.println("Patente: " + patente);
        System.out.println("Tipo: " + tipo);
        System.out.println("Capacidad: " + capacidad + " personas");
        System.out.println("Estado: " + estado);
        System.out.println("-----------------------------------");
    }
}