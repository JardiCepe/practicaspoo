package guiado_arreglos_software;

public class Modulo {
    private String nombre;
    private String lenguaje;
    private int progreso;
    private boolean terminado;

    public Modulo(String nombre, String lenguaje, int progreso, boolean terminado) {
        this.nombre = nombre;
        this.lenguaje = lenguaje;
        if (progreso < 0) {
            this.progreso = 0;
        } else if (progreso > 100) {
            this.progreso = 100;
        } else {
            this.progreso = progreso;
        }
        this.terminado = terminado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getProgreso() {
        return progreso;
    }

    public boolean isTerminado() {
        return terminado;
    }

    public String mostrarInformacion() {
        String estado = terminado ? "Terminado" : "En progreso";
        return nombre + " (" + lenguaje + ") - Progreso: " + progreso + "% - Estado: " + estado;
    }
}
