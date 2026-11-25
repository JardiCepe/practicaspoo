package casa_herencia_h3_archivos;

public class ArchivoImagen extends Archivo {
    private String resolucion;

    public ArchivoImagen(String nombre, double tamanoMB, String resolucion) {
        super(nombre, tamanoMB);
        this.resolucion = resolucion;
    }

    @Override
    public double calcularEspacioProcesado() {
        // Imagen genera miniaturas y metadatos (+20%)
        return getTamanoMB() * 1.20;
    }

    @Override
    public String mostrarInformacion() {
        return "[Imagen - " + resolucion + "] " + super.mostrarInformacion();
    }
}
