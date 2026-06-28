package llanquihuetourapp.model;

public class Persona {
    private String rut;
    private String nombre;
    private String tipo;        // Guia, Operador, Proveedor
    private String telefono;
    private double valorContrato;

    public Persona() {}

    public Persona(String rut, String nombre, String tipo, String telefono, double valorContrato) {
        this.rut = rut;
        this.nombre = nombre;
        this.tipo = tipo;
        this.telefono = telefono;
        this.valorContrato = valorContrato;
    }

    // Getters y Setters
    public String getRut() { return rut; }
    public void setRut(String rut) { this.rut = rut; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public double getValorContrato() { return valorContrato; }
    public void setValorContrato(double valorContrato) { this.valorContrato = valorContrato; }

    @Override
    public String toString() {
        return String.format("Persona[RUT=%s, Nombre=%s, Tipo=%s, Tel=%s, Contrato=$%.0f]",
                rut, nombre, tipo, telefono, valorContrato);
    }
}