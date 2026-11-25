package casa_herencia_h3_archivos;

// Desafío: agregar ArchivoAudio
public class ArchivoAudio extends Archivo {
    private int bitrateKbps;

    public ArchivoAudio(String nombre, double tamanoMB, int bitrateKbps) {
        super(nombre, tamanoMB);
        this.bitrateKbps = bitrateKbps;
    }

    @Override
    public double calcularEspacioProcesado() {
        // Audio normalizado e indexado (+10%)
        return getTamanoMB() * 1.10;
    }

    @Override
    public String mostrarInformacion() {
        return "[Audio - " + bitrateKbps + " kbps] " + super.mostrarInformacion();
    }
}
