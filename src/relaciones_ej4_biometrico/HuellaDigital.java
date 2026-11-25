package relaciones_ej4_biometrico;

public class HuellaDigital extends MetodoAutenticacion {
    private String dedoRegistrado;

    public HuellaDigital(int nivelSeguridad, String dedoRegistrado) {
        super(nivelSeguridad);
        this.dedoRegistrado = dedoRegistrado;
    }

    @Override
    public String autenticar() {
        return "Autenticación por huella digital (" + dedoRegistrado + ") verificada.";
    }

    @Override
    public String mostrarInformacion() {
        return "[Huella Digital] Dedo: " + dedoRegistrado + " | " + super.mostrarInformacion();
    }
}
