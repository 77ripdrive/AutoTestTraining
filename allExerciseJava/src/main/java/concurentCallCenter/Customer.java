package concurentCallCenter;


import java.util.concurrent.*;

public class Customer extends Thread {

        CyclicBarrier standByMessage;
        private Semaphore operators;

        public Customer(Semaphore operators, CyclicBarrier standByMessage,
                        String name) {
            this.standByMessage = standByMessage;
            this.operators = operators;
            this.setName(name);
            this.start();
        }

        @Override
        public void run() {
            long randomCallDuration = ThreadLocalRandom.current().nextLong(1,10);
            try {

                System.out.println("Client -->" + getName() + " is waiting to speak to the operator .");
                standByMessage.await();

                operators.acquire();
                System.out.println("Client -->" + getName() +" is getting the connection to the operator .");

                Thread.sleep(TimeUnit.SECONDS.toMillis(randomCallDuration));
                System.out.println("Client --> " + getName()  + " is ending the phone call with the operator .");
                operators.release();

                System.out.println( "Available operators  =  "  + operators.availablePermits());

            } catch (InterruptedException | BrokenBarrierException e) {
                System.err.println(e);
            }

        }
    }

