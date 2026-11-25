package relaciones_ej8_seguridad;

public class Main {
    public static void main(String[] args) {
        Amenaza a1 = new Malware("Trojan.Banker", "CRÍTICO", "Emotet");
        Amenaza a2 = new Phishing("Suplantación Nómina", "ALTO", "Correo corporativo");
        Amenaza a3 = new AtaqueDDoS("Inundación SYN", "CRÍTICO", 48.5);

        AnalistaSeguridad analista = new AnalistaSeguridad("Mateo Salazar");
        analista.registrarAmenaza(a1);
        analista.registrarAmenaza(a2);
        analista.registrarAmenaza(a3);

        // Generar alertas automáticas según el tipo de amenaza
        analista.generarAlerta(a1);
        analista.generarAlerta(a2);
        analista.generarAlerta(a3);

        System.out.println("--- CONSULTA POR TIPO DE AMENAZA ---");
        System.out.println("¿Existe Malware?: " + analista.existeAmenazaDeTipo(Malware.class));
        System.out.println("¿Existe Phishing?: " + analista.existeAmenazaDeTipo(Phishing.class));
        System.out.println("¿Existe AtaqueDDoS?: " + analista.existeAmenazaDeTipo(AtaqueDDoS.class));

        System.out.println("\n--- AMENAZAS Y ALERTAS GENERADAS ---");
        System.out.println(analista.mostrarAmenazasYAlertas());
    }
}
