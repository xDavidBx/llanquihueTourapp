package llanquihuetourapp.model;

public class ColaboradorExterno implements Registrable {
    private String nombreEmpresa;
    private String servicio;
    private String contacto;
    private double tarifa;

    public ColaboradorExterno(String nombreEmpresa, String servicio, String contacto, double tarifa) {
        this.nombreEmpresa = nombreEmpresa;
        this.servicio = servicio;
        this.contacto = contacto;
        this.tarifa = tarifa;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("🤝 COLABORADOR EXTERNO");
        System.out.println("Empresa: " + nombreEmpresa);
        System.out.println("Servicio: " + servicio);
        System.out.println("Contacto: " + contacto);
        System.out.println("Tarifa aproximada: $" + tarifa);
        System.out.println("-----------------------------------");
    }
}