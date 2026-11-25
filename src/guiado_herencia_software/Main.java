package guiado_herencia_software;

public class Main {
    public static void main(String[] args) {
        // Objetos creados fuera del sistema usando referencias de tipo Usuario
        Usuario u1 = new Administrador("admin1", "admin@demo.com", 3);
        Usuario u2 = new Desarrollador("dev1", "dev@demo.com", "Java");
        Usuario u3 = new Cliente("cliente1", "cliente@demo.com", "TechCorp");
        // Desafío adicional: clase Soporte extends Usuario
        Usuario u4 = new Soporte("soporte1", "soporte@demo.com", "Nocturno");

        SistemaUsuarios sistema = new SistemaUsuarios();
        sistema.agregarUsuario(u1);
        sistema.agregarUsuario(u2);
        sistema.agregarUsuario(u3);
        sistema.agregarUsuario(u4);

        System.out.println("--- PERMISOS POR SUBTIPO ---");
        System.out.println(u1.getUsername() + ": " + u1.obtenerPermisos());
        System.out.println(u2.getUsername() + ": " + u2.obtenerPermisos());
        System.out.println(u3.getUsername() + ": " + u3.obtenerPermisos());
        System.out.println(u4.getUsername() + ": " + u4.obtenerPermisos());

        System.out.println("\n--- LISTADO POLIMÓRFICO ---");
        System.out.println(sistema.mostrarUsuarios());

        System.out.println("\n--- BÚSQUEDA POR USERNAME ---");
        Usuario encontrado = sistema.buscarUsuario("dev1");
        System.out.println("Buscar dev1: " + (encontrado != null ? encontrado.mostrarInformacion() : "No encontrado"));
        System.out.println("Buscar fantasma: " + (sistema.buscarUsuario("fantasma") != null ? "Encontrado" : "No encontrado"));

        System.out.println("\n--- ELIMINACIÓN DE USUARIO ---");
        System.out.println("Eliminar cliente1: " + sistema.eliminarUsuario("cliente1"));
        System.out.println("Eliminar fantasma: " + sistema.eliminarUsuario("fantasma"));

        System.out.println("\n--- USUARIOS RESTANTES ---");
        System.out.println(sistema.mostrarUsuarios());
    }
}
