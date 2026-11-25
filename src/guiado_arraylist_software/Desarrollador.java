package guiado_arraylist_software;

public class Desarrollador {
    // Atributos
    private String identificacion;
    private String nombre;
    private String especialidad;
    private double horasAsignadas;

    // Constructor
    public Desarrollador(String identificacion, String nombre, String especialidad, double horasAsignadas) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.horasAsignadas = horasAsignadas;
    }

    // Getters
    public String getIdentificacion() {
        return identificacion;
    }

    public double getHorasAsignadas() {
        return horasAsignadas;
    }

    // La clase no imprime: retorna la descripción
    public String mostrarInformacion() {
        return "ID: " + identificacion + " | Nombre: " + nombre
                + " | Especialidad: " + especialidad + " | Horas: " + horasAsignadas;
    }
}
