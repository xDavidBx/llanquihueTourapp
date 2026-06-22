package llanquihuetourapp.ui;

import llanquihuetourapp.data.GestorDatos;
import llanquihuetourapp.service.TourService;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== LLANQUIHUE TOUR - Sistema de Gestión ===\n");

        GestorDatos gestor = new GestorDatos();
        TourService service = new TourService(gestor);

        // Carga de datos
        gestor.cargarTours();
        gestor.cargarPersonas();

        // Mostrar todo
        service.mostrarTodos();

        // Filtros y búsquedas
        System.out.println("\n🔎 TOURS CON PRECIO > $1000:");
        service.obtenerToursCaros(1000).forEach(System.out::println);

        System.out.println("\n👤 GUÍAS TURÍSTICOS:");
        service.buscarPorTipo("Guia").forEach(System.out::println);

        System.out.println("\n🔍 Búsqueda de 'Juan':");
        service.buscarPorNombre("Juan").forEach(System.out::println);

        System.out.println("\n✅ Sistema ejecutado correctamente.");
    }
}