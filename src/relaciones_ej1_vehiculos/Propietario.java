package relaciones_ej1_vehiculos;

public class Propietario {
    private String nombre;
    private String cedula;

    public Propietario(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String mostrarInformacion() {
        return nombre + " (CI: " + cedula + ")";
    }
}
