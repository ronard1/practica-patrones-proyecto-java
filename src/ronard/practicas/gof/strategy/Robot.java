package ronard.practicas.gof.strategy;

public class Robot {
    private Comportamiento comportamiento;

    public void setComportamiento(Comportamiento comportamiento) {
        this.comportamiento = comportamiento;
    }

    public void mover(){
        comportamiento.mover();
    }
}
