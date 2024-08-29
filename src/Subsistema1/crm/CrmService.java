package Subsistema1.crm;

public class CrmService {
    private CrmService(){
        super();
    }

    public static void grabarCliente(String nombre, String codigoPostal, String ciudad, String estado){
        System.out.println("Cliente se gaurdo en el sitema CRM");
        System.out.println(nombre);
        System.out.println(codigoPostal);
        System.out.println(ciudad);
        System.out.println(estado);
    }
}
