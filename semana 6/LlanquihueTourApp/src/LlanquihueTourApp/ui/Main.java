package llanquihuetourapp.ui;

import llanquihuetourapp.data.GestorDatos;
import llanquihuetourapp.data.GestorServicios;
import llanquihuetourapp.model.ServicioTuristico;
import llanquihuetourapp.service.TourService;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== LLANQUIHUE TOUR - Sistema de Gestión ===\n");

        // Parte anterior (Semanas 4-5)
        GestorDatos gestor = new GestorDatos();
        TourService service = new TourService(gestor);

        gestor.cargarTours();
        gestor.cargarPersonas();
        service.mostrarTodos();

        // Nueva parte - Semana 6: Jerarquía de Servicios
        System.out.println("\n=== JERARQUÍA DE SERVICIOS TURÍSTICOS (Semana 6) ===");
        GestorServicios gestorServicios = new GestorServicios();
        
        for (ServicioTuristico s : gestorServicios.crearServiciosDePrueba()) {
            System.out.println(s);
        }

        System.out.println("\n✅ Sistema completado correctamente.");
    }
}