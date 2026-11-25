package casa_arraylist_l3_repositorio;

import java.util.ArrayList;

public class Repositorio {
    private String nombre;
    private ArrayList<Commit> commits;

    public Repositorio(String nombre) {
        this.nombre = nombre;
        this.commits = new ArrayList<>();
    }

    // Composición: Repositorio crea los commits
    // Desafío: no permitir códigos de commit duplicados
    public boolean registrarCommit(String codigo, String autor, String descripcion) {
        if (codigo == null || buscarPorCodigo(codigo) != null) {
            return false;
        }
        commits.add(new Commit(codigo, autor, descripcion));
        return true;
    }

    public Commit eliminarUltimoCommit() {
        if (commits.isEmpty()) {
            return null;
        }
        return commits.remove(commits.size() - 1);
    }

    public Commit buscarPorCodigo(String codigo) {
        if (codigo == null) {
            return null;
        }
        for (Commit c : commits) {
            if (codigo.equals(c.getCodigo())) {
                return c;
            }
        }
        return null;
    }

    public int contarPorAutor(String autor) {
        if (autor == null) {
            return 0;
        }
        int contador = 0;
        for (Commit c : commits) {
            if (autor.equals(c.getAutor())) {
                contador++;
            }
        }
        return contador;
    }

    public String mostrarHistorial() {
        if (commits.isEmpty()) {
            return "El repositorio \"" + nombre + "\" no tiene commits.";
        }
        StringBuilder sb = new StringBuilder("Historial de \"" + nombre + "\":\n");
        for (Commit c : commits) {
            sb.append("- ").append(c.mostrarInformacion()).append("\n");
        }
        return sb.toString().trim();
    }
}
