package relaciones_ej4_biometrico;

public class TokenSeguridad extends MetodoAutenticacion {
    private String numeroSerie;

    public TokenSeguridad(int nivelSeguridad, String numeroSerie) {
        super(nivelSeguridad);
        this.numeroSerie = numeroSerie;
    }

    @Override
    public String autenticar() {
        return "Autenticación con token físico #" + numeroSerie + " aprobada.";
    }

    @Override
    public String mostrarInformacion() {
        return "[Token de Seguridad] Serie: " + numeroSerie + " | " + super.mostrarInformacion();
    }
}
