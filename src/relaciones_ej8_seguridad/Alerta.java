package relaciones_ej8_seguridad;

public class Alerta {
    private String fechaHora;
    private String recomendacionAutomatica;

    public Alerta(String fechaHora, String recomendacionAutomatica) {
        this.fechaHora = fechaHora;
        this.recomendacionAutomatica = recomendacionAutomatica;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public String getRecomendacionAutomatica() {
        return recomendacionAutomatica;
    }

    public String mostrarInformacion() {
        return "[" + fechaHora + "] Recomendación: " + recomendacionAutomatica;
    }
}
