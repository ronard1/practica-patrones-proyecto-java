package ronard.practicas.gof.facade;

import Subsistema1.crm.CrmService;
import Subsistema2.CodigoPostal.CodigoPostalApi;

public class Facade {
    public void migrarCliente(String nombre, String codigoPostal){

        String ciudad = CodigoPostalApi.getInstancia().recuperarCiudad(codigoPostal);
        String estado = CodigoPostalApi.getInstancia().recuperarEstado(codigoPostal);
        CrmService.grabarCliente(nombre, codigoPostal, ciudad, estado);
    }
}
