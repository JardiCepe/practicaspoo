package relaciones_ej8_seguridad;

public class AtaqueDDoS extends Amenaza {
    private double traficoGbps;

    public AtaqueDDoS(String nombre, String nivelRiesgo, double traficoGbps) {
        super(nombre, nivelRiesgo);
        this.traficoGbps = traficoGbps;
    }

    @Override
    public String getTipoAmenaza() {
        return "Ataque DDoS";
    }

    @Override
    protected String obtenerRecomendacionAutomatica() {
        return "Activar mitigación WAF y limitar tráfico entrante (" + traficoGbps + " Gbps detectados).";
    }
}
