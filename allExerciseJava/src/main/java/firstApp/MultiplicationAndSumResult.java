package firstApp;

public class MultiplicationAndSumResult {
      public static void main(String[] args) {
        int sumResult = 0;
        int multiplicationResult = 1;

            for (int i = 0; i < args.length; i++) {
                int[] numericValue=new int[args.length] ;
                sumResult += numericValue[i] ;
                multiplicationResult *= numericValue[i] ;
            }
            System.out.println("Amount of numbers entered: " + sumResult);

            System.out.println("Result of Multiplication : " + multiplicationResult);

      }
}
