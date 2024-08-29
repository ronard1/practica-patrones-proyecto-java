package ronard.practicas.gof.strategy;

public class ComportamientoDensivo implements Comportamiento{
    @Override
    public void mover() {
        System.out.println("Moverse defensivamnete");
    }
}
