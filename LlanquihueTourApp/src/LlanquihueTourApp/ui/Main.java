package llanquihuetourapp.ui;

import llanquihuetourapp.data.GestorDatos;
import llanquihuetourapp.model.Tour;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("=== LLANQUIHUE TOUR - Gestión de Tours ===\n");
        
        GestorDatos gestor = new GestorDatos();
        gestor.cargarDatos();
        
        List<Tour> todosLosTours = gestor.getTours();
        
        // 1. Mostrar todos los tours (recorrido)
        System.out.println("📋 TODOS LOS TOURS:");
        for (Tour t : todosLosTours) {
            System.out.println(t);
        }
        
        // 2. Filtrar tours con precio > 1000
        System.out.println("\n🔎 TOURS CON PRECIO MAYOR A $1000:");
        List<Tour> toursCaros = gestor.filtrarPorPrecioMayor(1000);
        for (Tour t : toursCaros) {
            System.out.println(t);
        }
        
        // 3. Ejemplo de búsqueda por ubicación
        System.out.println("\n🔍 TOURS EN PUERTO VARAS:");
        for (Tour t : todosLosTours) {
            if (t.getUbicacion().equalsIgnoreCase("Puerto Varas")) {
                System.out.println(t);
            }
        }
        
        System.out.println("\n✅ Programa finalizado.");
    }
}