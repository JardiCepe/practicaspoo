package relaciones_ej7_proveedores;

public class Main {
    public static void main(String[] args) {
        Proveedor aws = new ProveedorCloud("AWS", "Estados Unidos", "us-east-1");
        Proveedor hubspot = new ProveedorSaaS("HubSpot", "Estados Unidos", "CRM Empresarial");
        Proveedor kushki = new ProveedorPasarelasPago("Kushki", "Ecuador", 2.9);

        ClienteEmpresa cliente1 = new ClienteEmpresa("ComercioAndino S.A.");
        ClienteEmpresa cliente2 = new ClienteEmpresa("FinTech Pacífico");

        cliente1.contratarProveedor(aws, 1200.0, 12);
        cliente1.contratarProveedor(kushki, 350.0, 24);

        cliente2.contratarProveedor(aws, 2500.0, 12);
        cliente2.contratarProveedor(hubspot, 600.0, 6);

        System.out.println("--- VERIFICACIÓN POR TIPO DE PROVEEDOR ---");
        System.out.println(cliente1.getNombre() + " tiene Cloud: " + cliente1.tieneProveedorDeTipo(ProveedorCloud.class));
        System.out.println(cliente1.getNombre() + " tiene SaaS: " + cliente1.tieneProveedorDeTipo(ProveedorSaaS.class));
        System.out.println(cliente1.getNombre() + " tiene Pasarela: " + cliente1.tieneProveedorDeTipo(ProveedorPasarelasPago.class));

        System.out.println("\n--- CONTRATOS ACTIVOS CLIENTE 1 ---");
        System.out.println(cliente1.listarContratosActivos());

        System.out.println("\n--- CONTRATOS ACTIVOS CLIENTE 2 ---");
        System.out.println(cliente2.listarContratosActivos());
    }
}
