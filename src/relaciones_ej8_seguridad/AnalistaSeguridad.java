package relaciones_ej8_seguridad;

import java.util.ArrayList;

public class AnalistaSeguridad {
    private String nombre;
    // Agregación: el analista gestiona amenazas detectadas externamente
    private ArrayList<Amenaza> amenazasDetectadas;

    public AnalistaSeguridad(String nombre) {
        this.nombre = nombre;
        this.amenazasDetectadas = new ArrayList<>();
    }

    public void registrarAmenaza(Amenaza amenaza) {
        if (amenaza != null) {
            amenazasDetectadas.add(amenaza);
        }
    }

    public Alerta generarAlerta(Amenaza a) {
        if (a == null) {
            return null;
        }
        return a.crearAlertaInterna();
    }

    public boolean existeAmenazaDeTipo(Class<? extends Amenaza> tipo) {
        if (tipo == null) {
            return false;
        }
        for (Amenaza a : amenazasDetectadas) {
            if (tipo.isInstance(a)) {
                return true;
            }
        }
        return false;
    }

    public String mostrarAmenazasYAlertas() {
        if (amenazasDetectadas.isEmpty()) {
            return "El analista " + nombre + " no tiene amenazas registradas.";
        }
        StringBuilder sb = new StringBuilder("Reporte del analista " + nombre + ":\n");
        for (Amenaza a : amenazasDetectadas) {
            sb.append("- ").append(a.mostrarInformacion()).append("\n");
            if (a.getAlertas().isEmpty()) {
                sb.append("    (Sin alertas generadas)\n");
            } else {
                for (Alerta al : a.getAlertas()) {
                    sb.append("    * ").append(al.mostrarInformacion()).append("\n");
                }
            }
        }
        return sb.toString().trim();
    }
}
