package casa_herencia_h3_archivos;

import java.util.ArrayList;

public class RepositorioArchivos {
    private String nombre;
    private ArrayList<Archivo> archivos;

    public RepositorioArchivos(String nombre) {
        this.nombre = nombre;
        this.archivos = new ArrayList<>();
    }

    public void agregarArchivo(Archivo archivo) {
        if (archivo != null) {
            archivos.add(archivo);
        }
    }

    public double calcularEspacioTotalProcesado() {
        double total = 0.0;
        for (Archivo a : archivos) {
            total += a.calcularEspacioProcesado();
        }
        return total;
    }

    public String listarArchivos() {
        if (archivos.isEmpty()) {
            return "El repositorio \"" + nombre + "\" está vacío.";
        }
        StringBuilder sb = new StringBuilder("Archivos en \"" + nombre + "\":\n");
        for (Archivo a : archivos) {
            sb.append("- ").append(a.mostrarInformacion()).append("\n");
        }
        return sb.toString().trim();
    }
}
