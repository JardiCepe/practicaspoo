package s4_ejercicio3_software;

public class Dispositivo {
    // Atributos de instancia
    private int id;
    private String nombre;
    private String tipo;

    // Atributo de clase (una sola copia compartida por todos los objetos)
    private static int contador = 0;

    // Paso 2 y 3: Constructor con this
    // Paso 6 y Desafío adicional: auto-incremento de contador y asignación de ID
    public Dispositivo(String nombre, String tipo) {
        contador++; // Se incrementa cada vez que nace un nuevo objeto
        this.id = contador; // Desafío adicional: ID único correlativo
        this.nombre = nombre;
        this.tipo = tipo;
    }

    // Paso 7: Metodo static para consultar el total creado
    public static int getTotalCreados() {
        return contador;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Metodo para imprimir la información propia de este dispositivo
    public void mostrarInfo() {
        System.out.println("Dispositivo #" + id + " -> Nombre: " + nombre + " | Tipo: " + tipo);
    }
}
