package practica2_modulo;

public class Modulo {
    // 1. Atributos en private
    private String nombre;
    private String lenguaje;
    private String version;
    private boolean terminado;

    // Getters y Setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLenguaje() {
        return this.lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public boolean isTerminado() {
        return this.terminado;
    }

    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }

    // Métodos
    public void mostrarInformacion() {
        System.out.println("Módulo: " + this.nombre);
        System.out.println("Lenguaje: " + this.lenguaje);
        System.out.println("Versión: " + this.version);
        System.out.println("Terminado: " + this.terminado);
        System.out.println("---------------------------------");
    }

    public void marcarTerminado() {
        this.terminado = true;
        System.out.println("El módulo " + this.nombre + " ha sido completado.");
    }

    void mostrarEstado() {
        if (this.terminado) {
            System.out.println("Estado de " + this.nombre + ": Listo para producción.");
        } else {
            System.out.println("Estado de " + this.nombre + ": En desarrollo.");
        }
    }

    void mostrarVersion() {
        System.out.println(this.nombre + " se encuentra en la versión " + this.version);
    }
}