package relaciones_ej5_robots;

public class RobotMontacargas extends Robot {
    private double cargaMaximaKg;

    public RobotMontacargas(String id, String tipoBateria, int capacidadBateria, double cargaMaximaKg) {
        super(id, tipoBateria, capacidadBateria);
        this.cargaMaximaKg = cargaMaximaKg;
    }

    @Override
    public String obtenerTipo() {
        return "Robot Montacargas";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " | Carga máx: " + cargaMaximaKg + " kg";
    }
}
