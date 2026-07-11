package llanquihuetourapp.ui;

import llanquihuetourapp.data.GestorEntidades;
import llanquihuetourapp.model.*;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class GUIPrincipal extends JFrame {

    private GestorEntidades gestor;

    public GUIPrincipal() {
        gestor = new GestorEntidades();
        gestor.cargarEntidadesDePrueba();

        setTitle("Llanquihue Tour - Gestión");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        add(panel);

        JButton btnMostrar = new JButton("Mostrar Todas las Entidades");
        JButton btnAgregarGuia = new JButton("Agregar Guía Turístico");
        JButton btnAgregarVehiculo = new JButton("Agregar Vehículo");

        panel.add(btnMostrar);
        panel.add(btnAgregarGuia);
        panel.add(btnAgregarVehiculo);

        btnMostrar.addActionListener(this::mostrarEntidades);
        btnAgregarGuia.addActionListener(this::agregarGuia);
        btnAgregarVehiculo.addActionListener(this::agregarVehiculo);
    }

    private void mostrarEntidades(ActionEvent e) {
        StringBuilder sb = new StringBuilder();
        for (Registrable r : gestor.getEntidades()) {
            sb.append(r.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(this, sb.toString(), "Entidades Registradas", JOptionPane.INFORMATION_MESSAGE);
    }

    private void agregarGuia(ActionEvent e) {
        String nombre = JOptionPane.showInputDialog("Nombre del Guía:");
        String rut = JOptionPane.showInputDialog("RUT:");
        String idioma = JOptionPane.showInputDialog("Idiomas:");
        String exp = JOptionPane.showInputDialog("Años de experiencia:");

        if (nombre != null && rut != null) {
            GuiaTuristico guia = new GuiaTuristico(rut, nombre, idioma, Integer.parseInt(exp));
            gestor.agregarEntidad(guia);
            JOptionPane.showMessageDialog(this, "Guía agregado correctamente!");
        }
    }

    private void agregarVehiculo(ActionEvent e) {
        String patente = JOptionPane.showInputDialog("Patente:");
        String tipo = JOptionPane.showInputDialog("Tipo de vehículo:");
        String cap = JOptionPane.showInputDialog("Capacidad:");

        if (patente != null && tipo != null) {
            Vehiculo v = new Vehiculo(patente, tipo, Integer.parseInt(cap), "Disponible");
            gestor.agregarEntidad(v);
            JOptionPane.showMessageDialog(this, "Vehículo agregado correctamente!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GUIPrincipal().setVisible(true));
    }
}