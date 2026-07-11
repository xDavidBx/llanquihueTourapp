package llanquihuetourapp.data;

import llanquihuetourapp.model.*;

import java.util.ArrayList;
import java.util.List;

public class GestorServicios {

    private final List<ServicioTuristico> servicios = new ArrayList<>();

    public void cargarServiciosDePrueba() {
        // Limpia la lista por si se llama varias veces
        servicios.clear();

        servicios.add(new RutaGastronomica("Sabores del Lago", 4.5, 5));
        servicios.add(new RutaGastronomica("Ruta del Curanto", 6.0, 4));
        servicios.add(new PaseoLacustre("Navegación al Atardecer", 3.0, "Catamarán"));
        servicios.add(new PaseoLacustre("Isla Huar Express", 2.5, "Lancha"));
        servicios.add(new ExcursionCultural("Patrimonio Alemán", 5.0, "Frutillar"));
        servicios.add(new ExcursionCultural("Historia Mapuche", 4.5, "Puerto Varas"));
    }

    public List<ServicioTuristico> getServicios() {
        return servicios;
    }

    // Método que demuestra polimorfismo
    public void mostrarTodosLosServicios() {
        System.out.println("=== SERVICIOS TURÍSTICOS DISPONIBLES ===\n");
        for (ServicioTuristico servicio : servicios) {
            servicio.mostrarInformacion();   // ← Polimorfismo
        }
    }
}