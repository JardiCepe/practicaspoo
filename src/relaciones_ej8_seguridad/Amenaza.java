package relaciones_ej8_seguridad;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public abstract class Amenaza {
    private static final DateTimeFormatter FORMATO = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private String nombre;
    private String nivelRiesgo;
    // Composición: las alertas pertenecen a la amenaza que las origina
    private ArrayList<Alerta> alertas;

    public Amenaza(String nombre, String nivelRiesgo) {
        this.nombre = nombre;
        this.nivelRiesgo = nivelRiesgo;
        this.alertas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getNivelRiesgo() {
        return nivelRiesgo;
    }

    public ArrayList<Alerta> getAlertas() {
        return alertas;
    }

    protected abstract String obtenerRecomendacionAutomatica();

    public Alerta crearAlertaInterna() {
        String fechaHora = LocalDateTime.now().format(FORMATO);
        Alerta alerta = new Alerta(fechaHora, obtenerRecomendacionAutomatica());
        alertas.add(alerta);
        return alerta;
    }

    public abstract String getTipoAmenaza();

    public String mostrarInformacion() {
        return "[" + getTipoAmenaza() + "] " + nombre + " (Riesgo: " + nivelRiesgo + ")";
    }
}
