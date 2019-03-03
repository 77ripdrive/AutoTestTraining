package exseptionKuchaMala;

public class RunnerExseptionTask {

    public static void main(String[] args) {

        Thread mala = new Thread(new Mala());
        Thread kucha = new Thread(new Kucha());

        mala.start();
        kucha.start();
    }

}
