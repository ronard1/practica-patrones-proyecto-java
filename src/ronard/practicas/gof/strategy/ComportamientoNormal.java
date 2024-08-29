package ronard.practicas.gof.strategy;

public class ComportamientoNormal implements Comportamiento{
    @Override
    public void mover() {
        System.out.println("Moverse normalmente");
    }
}
