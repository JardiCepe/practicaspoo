package casa_arreglos_a3_versiones;

public class VersionSoftware {
    private String numero;
    private String fecha;
    private boolean estable;
    private int cantidadCambios;

    public VersionSoftware(String numero, String fecha, boolean estable, int cantidadCambios) {
        this.numero = numero;
        this.fecha = fecha;
        this.estable = estable;
        this.cantidadCambios = cantidadCambios;
    }

    public String getNumero() {
        return numero;
    }

    public String getFecha() {
        return fecha;
    }

    public boolean isEstable() {
        return estable;
    }

    public int getCantidadCambios() {
        return cantidadCambios;
    }

    public String mostrarInformacion() {
        String tipo = estable ? "Estable" : "Beta/Inestable";
        return "v" + numero + " (" + fecha + ") - " + tipo + " - Cambios: " + cantidadCambios;
    }
}
