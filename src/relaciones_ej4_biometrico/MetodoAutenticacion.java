package relaciones_ej4_biometrico;

public abstract class MetodoAutenticacion {
    private int nivelSeguridad;

    public MetodoAutenticacion(int nivelSeguridad) {
        this.nivelSeguridad = nivelSeguridad;
    }

    public int getNivelSeguridad() {
        return nivelSeguridad;
    }

    public abstract String autenticar();

    public String mostrarInformacion() {
        return "Nivel de seguridad: " + nivelSeguridad;
    }
}
