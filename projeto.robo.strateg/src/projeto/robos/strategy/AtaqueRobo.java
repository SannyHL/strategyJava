package projeto.robos.strategy;

public class AtaqueRobo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Ataque...");
    }
}
