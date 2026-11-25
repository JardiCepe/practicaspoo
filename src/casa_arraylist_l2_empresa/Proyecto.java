package casa_arraylist_l2_empresa;

public class Proyecto {
    private String nombre;
    private String cliente;
    private double presupuesto;

    public Proyecto(String nombre, String cliente, double presupuesto) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.presupuesto = presupuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCliente() {
        return cliente;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public String mostrarInformacion() {
        return "Proyecto: " + nombre + " | Cliente: " + cliente + " | Presupuesto: $" + presupuesto;
    }
}
