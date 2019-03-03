package concurentCallCenter;


import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class RunnerCallCenter {

    public static void main(String[] args) {

        Semaphore operators = new Semaphore(4);

        CyclicBarrier standbyMessage = new CyclicBarrier(4, new CyclicBarrierMessage());

        System.out.println("The call center is ready to START !");

        System.out.println("Available operators in start  -->  " + operators.availablePermits() );

        new Customer(operators,standbyMessage,"1");
        new Customer(operators,standbyMessage,"2");
        new Customer(operators,standbyMessage,"3");
        new Customer(operators,standbyMessage,"4");
        new Customer(operators,standbyMessage,"5");
        new Customer(operators,standbyMessage,"6");
        new Customer(operators,standbyMessage,"7");
        new Customer(operators,standbyMessage,"8");
        new Customer(operators,standbyMessage,"9");
        new Customer(operators,standbyMessage,"10");
        new Customer(operators,standbyMessage,"11");
        new Customer(operators,standbyMessage,"12");

    }

}