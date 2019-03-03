package exseptionKuchaMala;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Kucha implements Runnable {

    public Kucha() {
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int sizeMatrix;
        int[][] matrix;

        System.out.println("Enter Integer ,faster 10 sec! Matrix size: ");
        sizeMatrix = scanner.nextInt();
        matrix = fillMatrixRandom(sizeMatrix);
        printMatrix(matrix);
        try {
            TimeUnit.SECONDS.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            writeToFile(matrix, "C:\\AutoTestTraining\\allExerciseJava\\exeptionOperExsample.txt", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        private static int[][] fillMatrixRandom ( int sizeNumber){
            if (sizeNumber <= 0) {
                throw new IllegalArgumentException();
            }
            int[][] matrix = new int[sizeNumber][sizeNumber];
            for (int i = 0; i < sizeNumber; i++) {
                for (int j = 0; j < sizeNumber; j++) {
                    matrix[i][j] = (int) ( Math.random() * ( sizeNumber * 9 + 2 ) - ( sizeNumber + 1 ) );
                }
            }
            return matrix;
        }

        private static void printMatrix ( int[][] matrix){
            for (int i = 0, n = matrix.length; i < n; i++) {
                for (int j = 0, m = matrix[i].length; j < m; j++) {
                    System.out.print(matrix[i][j] + "  ");
                }
                System.out.println();
            }
        }

        public static void writeToFile ( int[][] array, String filePathName,boolean b) throws IOException {
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File(filePathName)));
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    writer.write(String.valueOf(array[i][j]));
                    writer.write(" ");
                }
                writer.write("\r\n");
            }
            writer.flush();
            System.out.println("See array in file.");
        }
}


