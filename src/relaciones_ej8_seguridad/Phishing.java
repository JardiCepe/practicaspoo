package relaciones_ej8_seguridad;

public class Phishing extends Amenaza {
    private String canal;

    public Phishing(String nombre, String nivelRiesgo, String canal) {
        super(nombre, nivelRiesgo);
        this.canal = canal;
    }

    @Override
    public String getTipoAmenaza() {
        return "Phishing";
    }

    @Override
    protected String obtenerRecomendacionAutomatica() {
        return "Bloquear remitente en " + canal + " y forzar cambio de credenciales afectadas.";
    }
}
