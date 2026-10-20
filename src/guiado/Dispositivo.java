package guiado;

public class Dispositivo {
    //Atributos protegidos con private
    private String nombre;
    private String tipo;
    private boolean activo;

    // Getters y Setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isActivo() {
        return this.activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // Métodos de comportamiento
    public void mostrarInformacion() {
        System.out.println("Dispositivo: " + this.nombre);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Activo: " + this.activo);
        System.out.println("-------------------------");
    }

    void mostrarEstado() {
        System.out.println("El dispositivo " + this.nombre + " está activo: " + this.activo);
    }

    public void activar() {
        this.activo = true;
        System.out.println("-> Se ha activado el dispositivo: " + this.nombre);
    }
}
