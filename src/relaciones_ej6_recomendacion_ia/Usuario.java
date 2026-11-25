package relaciones_ej6_recomendacion_ia;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    // Asociación débil: cursos recomendados asociados al usuario
    private ArrayList<Curso> cursosRecomendados;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.cursosRecomendados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarCursoRecomendado(Curso curso) {
        if (curso != null) {
            cursosRecomendados.add(curso);
        }
    }

    public Curso buscarCursoRecomendado(String nombreCurso) {
        if (nombreCurso == null) {
            return null;
        }
        for (Curso c : cursosRecomendados) {
            if (nombreCurso.equalsIgnoreCase(c.getNombre())) {
                return c;
            }
        }
        return null;
    }

    public String mostrarCursosRecomendados() {
        if (cursosRecomendados.isEmpty()) {
            return "El usuario " + nombre + " aún no tiene cursos recomendados.";
        }
        StringBuilder sb = new StringBuilder("Cursos recomendados para " + nombre + ":\n");
        for (Curso c : cursosRecomendados) {
            sb.append("- ").append(c.mostrarInformacion()).append("\n");
        }
        return sb.toString().trim();
    }
}
