package llanquihuetourapp.model;

public class GuiaTuristico implements Registrable {
    private String rut;
    private String nombre;
    private String idioma;
    private int experienciaAnios;

    public GuiaTuristico(String rut, String nombre, String idioma, int experienciaAnios) {
        this.rut = rut;
        this.nombre = nombre;
        this.idioma = idioma;
        this.experienciaAnios = experienciaAnios;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("👤 GUÍA TURÍSTICO");
        System.out.println("Nombre: " + nombre);
        System.out.println("RUT: " + rut);
        System.out.println("Idiomas: " + idioma);
        System.out.println("Experiencia: " + experienciaAnios + " años");
        System.out.println("-----------------------------------");
    }

    @Override
    public String toString() {
        return "Guia: " + nombre + " (" + experienciaAnios + " años)";
    }
}