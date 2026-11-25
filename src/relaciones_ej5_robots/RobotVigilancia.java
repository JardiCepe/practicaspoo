package relaciones_ej5_robots;

public class RobotVigilancia extends Robot {
    private String zonaAsignada;

    public RobotVigilancia(String id, String tipoBateria, int capacidadBateria, String zonaAsignada) {
        super(id, tipoBateria, capacidadBateria);
        this.zonaAsignada = zonaAsignada;
    }

    @Override
    public String obtenerTipo() {
        return "Robot de Vigilancia";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " | Zona: " + zonaAsignada;
    }
}
