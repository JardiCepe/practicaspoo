package casa_herencia_h3_archivos;

public class ArchivoVideo extends Archivo {
    private int duracionSegundos;

    public ArchivoVideo(String nombre, double tamanoMB, int duracionSegundos) {
        super(nombre, tamanoMB);
        this.duracionSegundos = duracionSegundos;
    }

    @Override
    public double calcularEspacioProcesado() {
        // Video transcodificado en múltiples calidades (+50%)
        return getTamanoMB() * 1.50;
    }

    @Override
    public String mostrarInformacion() {
        return "[Video - " + duracionSegundos + "s] " + super.mostrarInformacion();
    }
}
