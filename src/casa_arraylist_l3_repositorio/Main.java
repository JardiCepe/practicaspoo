package casa_arraylist_l3_repositorio;

public class Main {
    public static void main(String[] args) {
        Repositorio repo = new Repositorio("practicaspoo");

        System.out.println("--- REGISTRO DE COMMITS (COMPOSICIÓN) ---");
        System.out.println("c001: " + repo.registrarCommit("c001", "Ana", "Estructura inicial del proyecto"));
        System.out.println("c002: " + repo.registrarCommit("c002", "Luis", "Modelo de usuario"));
        System.out.println("c003: " + repo.registrarCommit("c003", "Ana", "Conexión a base de datos"));
        System.out.println("c004: " + repo.registrarCommit("c004", "Marta", "Diseño de vistas"));
        System.out.println("c005: " + repo.registrarCommit("c005", "Ana", "Pruebas unitarias"));
        System.out.println("c006: " + repo.registrarCommit("c006", "Luis", "Corrección de errores menores"));

        // Desafío: código duplicado rechazado
        System.out.println("Duplicado c003: " + repo.registrarCommit("c003", "Pedro", "Intento duplicado"));

        System.out.println("\n--- HISTORIAL COMPLETO ---");
        System.out.println(repo.mostrarHistorial());

        System.out.println("\n--- BÚSQUEDA Y CONTEO ---");
        Commit buscado = repo.buscarPorCodigo("c004");
        System.out.println("Buscar c004: " + (buscado != null ? buscado.mostrarInformacion() : "No encontrado"));
        System.out.println("Buscar c999: " + (repo.buscarPorCodigo("c999") != null ? "Encontrado" : "No encontrado"));
        System.out.println("Commits de Ana: " + repo.contarPorAutor("Ana"));
        System.out.println("Commits de Luis: " + repo.contarPorAutor("Luis"));

        System.out.println("\n--- ELIMINAR ÚLTIMO COMMIT ---");
        Commit eliminado = repo.eliminarUltimoCommit();
        System.out.println("Eliminado: " + (eliminado != null ? eliminado.mostrarInformacion() : "Ninguno"));

        System.out.println("\n--- HISTORIAL FINAL ---");
        System.out.println(repo.mostrarHistorial());
    }
}
