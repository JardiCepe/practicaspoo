package casa_herencia_h3_archivos;

public class Archivo {
    private String nombre;
    private double tamanoMB;

    public Archivo(String nombre, double tamanoMB) {
        this.nombre = nombre;
        this.tamanoMB = tamanoMB;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTamanoMB() {
        return tamanoMB;
    }

    public double calcularEspacioProcesado() {
        return tamanoMB;
    }

    public String mostrarInformacion() {
        return nombre + " | Original: " + tamanoMB + " MB | Procesado: " + calcularEspacioProcesado() + " MB";
    }
}
