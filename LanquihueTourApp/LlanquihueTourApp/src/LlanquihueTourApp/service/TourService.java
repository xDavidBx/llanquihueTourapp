package llanquihuetourapp.service;

import llanquihuetourapp.model.Tour;
import llanquihuetourapp.model.Persona;
import java.util.List;
import java.util.stream.Collectors;
import llanquihuetourapp.data.GestorDatos;

public class TourService {

    private final GestorDatos gestor;

    public TourService(GestorDatos gestor) {
        this.gestor = gestor;
    }

    public List<Tour> obtenerToursCaros(double precioMin) {
        return gestor.getTours().stream()
                .filter(t -> t.getPrecio() > precioMin)
                .collect(Collectors.toList());
    }

    public List<Persona> buscarPorTipo(String tipo) {
        return gestor.getPersonas().stream()
                .filter(p -> p.getTipo().equalsIgnoreCase(tipo))
                .collect(Collectors.toList());
    }

    public List<Persona> buscarPorNombre(String nombre) {
        return gestor.getPersonas().stream()
                .filter(p -> p.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .collect(Collectors.toList());
    }

    public void mostrarTodos() {
        System.out.println("\n=== TODOS LOS TOURS ===");
        gestor.getTours().forEach(System.out::println);

        System.out.println("\n=== TODAS LAS PERSONAS ===");
        gestor.getPersonas().forEach(System.out::println);
    }
}