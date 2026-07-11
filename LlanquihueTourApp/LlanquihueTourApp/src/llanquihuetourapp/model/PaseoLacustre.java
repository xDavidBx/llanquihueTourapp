package llanquihuetourapp.model;

public class PaseoLacustre extends ServicioTuristico {
    private String tipoEmbarcacion;

    public PaseoLacustre(String nombre, double duracionHoras, String tipoEmbarcacion) {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    @Override
    public String toString() {
        return "PaseoLacustre{" +
                "nombre='" + nombre + '\'' +
                ", duracion=" + duracionHoras + " hrs" +
                ", embarcacion='" + tipoEmbarcacion + '\'' +
                '}';
    }

@Override
public void mostrarInformacion() {
    System.out.println("⛵ PASEO LACUSTRE");
    System.out.println("Nombre: " + nombre);
    System.out.println("Duración: " + duracionHoras + " horas");
    System.out.println("Embarcación: " + tipoEmbarcacion);
    System.out.println("-----------------------------------");
}
}