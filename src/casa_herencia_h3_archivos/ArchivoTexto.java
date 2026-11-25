package casa_herencia_h3_archivos;

public class ArchivoTexto extends Archivo {
    private String codificacion;

    public ArchivoTexto(String nombre, double tamanoMB, String codificacion) {
        super(nombre, tamanoMB);
        this.codificacion = codificacion;
    }

    @Override
    public double calcularEspacioProcesado() {
        // Texto comprimido ocupa 75% del tamaño original
        return getTamanoMB() * 0.75;
    }

    @Override
    public String mostrarInformacion() {
        return "[Texto - " + codificacion + "] " + super.mostrarInformacion();
    }
}
