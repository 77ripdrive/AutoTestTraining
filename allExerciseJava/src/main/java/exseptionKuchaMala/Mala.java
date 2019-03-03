package exseptionKuchaMala;


import java.io.IOException;
import java.util.concurrent.TimeUnit;


    public  class Mala implements Runnable {


        @Override
        public void run() {
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            BufferReaderData bufferReader = new BufferReaderData();

            try {
                bufferReader.readBufferChar();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                bufferReader.saveToFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                bufferReader.readFile("C:\\AutoTestTraining\\allExerciseJava\\exeptionOperExsample.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
}
