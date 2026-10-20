package practica1_videojuego;

public class Videojuego {
    // 1. Atributos en private
    private String nombre;
    private String genero;
    private String version;
    private boolean activo;

    // Getters y Setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public boolean isActivo() {
        return this.activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // Métodos
    public void mostrarInformacion() {
        System.out.println("Título: " + this.nombre);
        System.out.println("Género: " + this.genero);
        System.out.println("Versión: " + this.version);
        System.out.println("En ejecución: " + this.activo);
        System.out.println("---------------------------------");
    }

    public void iniciar() {
        this.activo = true;
        System.out.println("Iniciando el juego " + this.nombre + "...");
    }

    void cerrar() {
        this.activo = false;
        System.out.println("Cerrando el juego " + this.nombre + "...");
    }

    void mostrarVersion() {
        System.out.println("Versión actual de " + this.nombre + ": " + this.version);
    }
}