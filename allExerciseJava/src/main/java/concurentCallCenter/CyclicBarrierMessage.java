package concurentCallCenter;

public class CyclicBarrierMessage implements Runnable {
private  int number=0;
    @Override
    public void run() {
        System.out.println("All operators are busy at that moment -- Please wait . ");
        System.out.println("The number of attempts to reach a free operator. -->  " +(number+=1)+'.');
    }
}
 
