package guiado_herencia_software;

import java.util.ArrayList;

public class SistemaUsuarios {
    private ArrayList<Usuario> usuarios;

    public SistemaUsuarios() {
        usuarios = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuario) {
        if (usuario != null) {
            usuarios.add(usuario);
        }
    }

    public Usuario buscarUsuario(String username) {
        if (username == null) {
            return null;
        }
        for (Usuario u : usuarios) {
            if (username.equals(u.getUsername())) {
                return u;
            }
        }
        return null;
    }

    public boolean eliminarUsuario(String username) {
        Usuario encontrado = buscarUsuario(username);
        if (encontrado != null) {
            usuarios.remove(encontrado);
            return true;
        }
        return false;
    }

    public String mostrarUsuarios() {
        if (usuarios.isEmpty()) {
            return "No hay usuarios registrados en el sistema.";
        }
        StringBuilder sb = new StringBuilder();
        for (Usuario u : usuarios) {
            sb.append("- ").append(u.mostrarInformacion())
              .append(" | Permisos: ").append(u.obtenerPermisos())
              .append("\n");
        }
        return sb.toString().trim();
    }
}
