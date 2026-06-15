package llanquihuetourapp.data;

import llanquihuetourapp.model.Tour;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GestorDatos {
    
    private List<Tour> tours = new ArrayList<>();

    public void cargarDatos() {
        try {
            // Leer archivo desde resources
            InputStream is = getClass().getClassLoader().getResourceAsStream("tours.txt");
            if (is == null) {
                System.out.println("❌ No se encontró el archivo tours.txt");
                return;
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String linea;

            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty()) continue;
                
                String[] datos = linea.split(";");
                if (datos.length == 3) {
                    String nombre = datos[0].trim();
                    String ubicacion = datos[1].trim();
                    double precio = Double.parseDouble(datos[2].trim());
                    
                    Tour tour = new Tour(nombre, ubicacion, precio);
                    tours.add(tour);
                }
            }
            br.close();
            System.out.println("✅ " + tours.size() + " tours cargados correctamente.");
            
        } catch (Exception e) {
            System.out.println("❌ Error al cargar los datos: " + e.getMessage());
        }
    }

    public List<Tour> getTours() {
        return tours;
    }

    // Método para filtrar tours con precio mayor a un valor
    public List<Tour> filtrarPorPrecioMayor(double precioMin) {
        List<Tour> filtrados = new ArrayList<>();
        for (Tour t : tours) {
            if (t.getPrecio() > precioMin) {
                filtrados.add(t);
            }
        }
        return filtrados;
    }
}