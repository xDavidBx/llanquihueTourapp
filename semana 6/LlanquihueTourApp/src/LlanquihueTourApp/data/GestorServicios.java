package llanquihuetourapp.data;

import llanquihuetourapp.model.*;

import java.util.ArrayList;
import java.util.List;

public class GestorServicios {

    public List<ServicioTuristico> crearServiciosDePrueba() {
        List<ServicioTuristico> servicios = new ArrayList<>();

        // Rutas Gastronómicas
        servicios.add(new RutaGastronomica("Sabores de Llanquihue", 4.5, 6));
        servicios.add(new RutaGastronomica("Ruta del Curanto", 5.0, 4));

        // Paseos Lacustres
        servicios.add(new PaseoLacustre("Navegación Lago Llanquihue", 3.0, "Catamarán"));
        servicios.add(new PaseoLacustre("Tour Isla Huar", 2.5, "Lancha"));

        // Excursiones Culturales
        servicios.add(new ExcursionCultural("Puerto Varas Histórico", 6.0, "Iglesia del Sagrado Corazón"));
        servicios.add(new ExcursionCultural("Alemán del Sur", 4.0, "Frutillar"));

        return servicios;
    }
}