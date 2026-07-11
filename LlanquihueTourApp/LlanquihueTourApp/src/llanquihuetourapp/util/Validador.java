package llanquihuetourapp.util;

public class Validador {

    public static boolean esRutValido(String rut) {
        return rut != null && rut.matches("\\d{7,8}-[0-9kK]");
    }

    public static boolean esTelefonoValido(String telefono) {
        return telefono != null && telefono.matches("\\+?\\d{8,12}");
    }

    public static boolean esPrecioValido(double precio) {
        return precio > 0;
    }
}