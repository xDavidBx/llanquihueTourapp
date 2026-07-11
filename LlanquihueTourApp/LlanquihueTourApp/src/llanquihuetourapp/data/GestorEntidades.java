package llanquihuetourapp.data;

import llanquihuetourapp.model.*;
import java.util.ArrayList;
import java.util.List;

public class GestorEntidades {

    private List<Registrable> entidades = new ArrayList<>();

    public void agregarEntidad(Registrable entidad) {
        entidades.add(entidad);
    }

    public void cargarEntidadesDePrueba() {
        agregarEntidad(new GuiaTuristico("12.345.678-5", "María González", "Español, Inglés, Alemán", 8));
        agregarEntidad(new Vehiculo("ABCD-12", "Van", 12, "Disponible"));
        agregarEntidad(new ColaboradorExterno("Turismo Sur", "Alojamiento", "contacto@turismosur.cl", 450000));
        agregarEntidad(new GuiaTuristico("13.456.789-0", "Pedro Ruiz", "Español, Mapudungun", 5));
        agregarEntidad(new Vehiculo("XY-9876", "Bus", 25, "En mantenimiento"));
    }

    public void mostrarTodasLasEntidades() {
        System.out.println("\n=== ENTIDADES REGISTRADAS (Interface + instanceof) ===\n");
        for (Registrable r : entidades) {
            r.mostrarResumen();

            // Ejemplo de uso de instanceof
            if (r instanceof GuiaTuristico) {
                System.out.println("→ Es un Guía Turístico\n");
            } else if (r instanceof Vehiculo) {
                System.out.println("→ Es un Vehículo\n");
            } else if (r instanceof ColaboradorExterno) {
                System.out.println("→ Es un Colaborador Externo\n");
            }
        }
    }

    public List<Registrable> getEntidades() {
        return entidades;
    }
}