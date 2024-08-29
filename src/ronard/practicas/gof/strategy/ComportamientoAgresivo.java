package ronard.practicas.gof.strategy;

public class ComportamientoAgresivo implements Comportamiento{
    @Override
    public void mover() {
        System.out.println("Moverse agresivamente");
    }
}
