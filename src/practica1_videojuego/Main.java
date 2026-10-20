package practica1_videojuego;

public class Main {
    public static void main(String[] args) {
        Videojuego juego1 = new Videojuego();
        Videojuego juego2 = new Videojuego();
        Videojuego juego3 = new Videojuego();

        // Asignación controlada con setters
        juego1.setNombre("Geometry Dash");
        juego1.setGenero("Plataformas / Ritmo");
        juego1.setVersion("2.206");
        juego1.setActivo(false);

        juego2.setNombre("Baldur's Gate 3");
        juego2.setGenero("RPG");
        juego2.setVersion("v4.1.1");
        juego2.setActivo(false);

        juego3.setNombre("Helldivers 2");
        juego3.setGenero("Shooter cooperativo");
        juego3.setVersion("1.000.400");
        juego3.setActivo(false);

        System.out.println("=== ESTADO INICIAL ===");
        juego1.mostrarInformacion();
        juego2.mostrarInformacion();
        juego3.mostrarInformacion();

        System.out.println("\n=== INICIANDO UN JUEGO ===");
        juego1.iniciar();

        System.out.println("\n=== LECTURA CON GETTERS ===");
        System.out.println("El juego " + juego1.getNombre() + " está activo? " + juego1.isActivo());
        System.out.println("El juego " + juego2.getNombre() + " está activo? " + juego2.isActivo());
    }
}