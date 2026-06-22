package llanquihuetourapp.data;

import llanquihuetourapp.model.Persona;
import llanquihuetourapp.model.Tour;
import llanquihuetourapp.util.Validador;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestorDatos {

    private List<Tour> tours = new ArrayList<>();
    private List<Persona> personas = new ArrayList<>();

    public void cargarTours() {
        cargarArchivo("tours.txt", "tour");
    }

    public void cargarPersonas() {
        cargarArchivo("personas.txt", "persona");
    }

    private void cargarArchivo(String nombreArchivo, String tipo) {
        try (InputStream is = getClass().getClassLoader().getResourceAsStream(nombreArchivo);
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {

            if (is == null) {
                System.out.println("❌ Archivo no encontrado: " + nombreArchivo);
                return;
            }

            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty()) continue;

                String[] datos = linea.split(";");
                if (tipo.equals("tour") && datos.length == 3) {
                    Tour t = new Tour(datos[0].trim(), datos[1].trim(),
                            Double.parseDouble(datos[2].trim()));
                    tours.add(t);
                } 
                else if (tipo.equals("persona") && datos.length == 5) {
                    if (!Validador.esRutValido(datos[0].trim())) {
                        System.out.println("⚠️ RUT inválido omitido: " + datos[0]);
                        continue;
                    }
                    Persona p = new Persona(
                            datos[0].trim(),
                            datos[1].trim(),
                            datos[2].trim(),
                            datos[3].trim(),
                            Double.parseDouble(datos[4].trim())
                    );
                    personas.add(p);
                }
            }
            System.out.println("✅ Cargados " + (tipo.equals("tour") ? tours.size() : personas.size()) + " " + tipo + "s");
        } catch (Exception e) {
            System.out.println("❌ Error cargando " + nombreArchivo + ": " + e.getMessage());
        }
    }

    public List<Tour> getTours() { return tours; }
    public List<Persona> getPersonas() { return personas; }
}