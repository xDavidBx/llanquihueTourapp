package llanquihuetourapp.model;

public class ExcursionCultural extends ServicioTuristico {
    private String lugarHistorico;

    public ExcursionCultural(String nombre, double duracionHoras, String lugarHistorico) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    public String getLugarHistorico() {
        return lugarHistorico;
    }

    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }

    @Override
    public String toString() {
        return "ExcursionCultural{" +
                "nombre='" + nombre + '\'' +
                ", duracion=" + duracionHoras + " hrs" +
                ", lugarHistorico='" + lugarHistorico + '\'' +
                '}';
    }

@Override
public void mostrarInformacion() {
    System.out.println("🏛️ EXCURSIÓN CULTURAL");
    System.out.println("Nombre: " + nombre);
    System.out.println("Duración: " + duracionHoras + " horas");
    System.out.println("Lugar histórico: " + lugarHistorico);
    System.out.println("-----------------------------------");
}
}