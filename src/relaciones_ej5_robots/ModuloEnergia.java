package relaciones_ej5_robots;

public class ModuloEnergia {
    private String tipoBateria;
    private int capacidad;

    public ModuloEnergia(String tipoBateria, int capacidad) {
        this.tipoBateria = tipoBateria;
        this.capacidad = Math.max(0, capacidad);
    }

    public String getTipoBateria() {
        return tipoBateria;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public boolean tieneCapacidadSuficiente(int costoEnergetico) {
        return capacidad >= costoEnergetico;
    }

    public String mostrarInformacion() {
        return "Batería " + tipoBateria + " (" + capacidad + " Wh)";
    }
}
