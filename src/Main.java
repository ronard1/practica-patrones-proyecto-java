import ronard.practicas.gof.facade.Facade;
import ronard.practicas.gof.singleton.SingletonEager;
import ronard.practicas.gof.singleton.SingletonLazy;
import ronard.practicas.gof.singleton.SingletonLazyHolder;
import ronard.practicas.gof.strategy.*;

public class Main {
    public static void main(String[] args) {
        //Singleton
        /*
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy=SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager=SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder=SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        */

        //Strategy
        /*
        Comportamiento normal = new ComportamientoNormal();
        Comportamiento defensivo = new ComportamientoDensivo();
        Comportamiento agresivo = new ComportamientoAgresivo();

        Robot robot = new Robot();
        robot.setComportamiento(normal);
        robot.mover();
        robot.mover();
        robot.setComportamiento((agresivo));
        robot.mover();
        robot.setComportamiento(defensivo);
        robot.mover();
        robot.mover();
        robot.mover();
        */

        //Facade
        Facade facade = new Facade();
        facade.migrarCliente("Ronard","1008");
    }
}