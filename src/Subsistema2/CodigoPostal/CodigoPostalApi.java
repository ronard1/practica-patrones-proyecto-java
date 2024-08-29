package Subsistema2.CodigoPostal;

import ronard.practicas.gof.singleton.SingletonEager;

public class CodigoPostalApi {
    private static CodigoPostalApi instancia = new CodigoPostalApi();

    private CodigoPostalApi(){
        super();
    }

    public static CodigoPostalApi getInstancia(){
        return instancia;
    }

    public String recuperarCiudad(String codigoPostal){
        return "Huancayo";
    }

    public String recuperarEstado(String codigoPostal){
        return "Junín";
    }
}
