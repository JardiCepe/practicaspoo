package relaciones_ej3_cursos;

import java.util.ArrayList;

public class Curso {
    private String codigo;
    private String nombre;
    // Composición: las unidades nacen dentro del constructor del curso y no existen sin él
    private ArrayList<Unidad> unidades;

    public Curso(String codigo, String nombre, String[] titulosUnidades, int[] horasUnidades) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.unidades = new ArrayList<>();
        if (titulosUnidades != null && horasUnidades != null) {
            int total = Math.min(titulosUnidades.length, horasUnidades.length);
            for (int i = 0; i < total; i++) {
                this.unidades.add(new Unidad(i + 1, titulosUnidades[i], horasUnidades[i]));
            }
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String mostrarInformacion() {
        StringBuilder sb = new StringBuilder("Curso [" + codigo + "] " + nombre + "\n");
        if (unidades.isEmpty()) {
            sb.append("  Sin unidades registradas.");
        } else {
            for (Unidad u : unidades) {
                sb.append("  - ").append(u.mostrarInformacion()).append("\n");
            }
        }
        return sb.toString().trim();
    }
}
