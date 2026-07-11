package llanquihuetourapp.ui;

import llanquihuetourapp.data.GestorDatos;
import llanquihuetourapp.data.GestorEntidades;
import llanquihuetourapp.data.GestorServicios;
import llanquihuetourapp.service.TourService;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== LLANQUIHUE TOUR - Sistema Completo ===\n");

        // Semanas anteriores
        GestorDatos gestor = new GestorDatos();
        TourService service = new TourService(gestor);

        gestor.cargarTours();
        gestor.cargarPersonas();
        service.mostrarTodos();

        // Semana 7 - Polimorfismo y Colecciones Genéricas
        System.out.println("\n" + "=".repeat(60));
        GestorServicios gestorServicios = new GestorServicios();
        gestorServicios.cargarServiciosDePrueba();
        gestorServicios.mostrarTodosLosServicios();
        GestorEntidades gestorEnt = new GestorEntidades();
        gestorEnt.cargarEntidadesDePrueba();
        gestorEnt.mostrarTodasLasEntidades();

        System.out.println("✅ Sistema ejecutado correctamente - Semana 7 completada.");
        
    }
}