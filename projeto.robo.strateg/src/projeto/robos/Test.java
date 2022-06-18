package projeto.robos;


import projeto.robos.strategy.*;


public class Test {
    public static void main(String[] args) {


        //Strategy:
        Comportamento normal = new RecuoRobo();
        Comportamento defensivo = new DefesaRobo();
        Comportamento agressivo = new AtaqueRobo();

        Robo robo = new Robo();

        System.out.println("Robo 1: ");
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        System.out.println("Robo 2: ");
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        System.out.println("Robo 1: ");
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        System.out.println("Robo 2: ");
        robo.setComportamento(defensivo);
        robo.mover();

    }
}
