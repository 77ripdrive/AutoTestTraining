package dataTypes;

import java.util.Scanner;

public class ArrayDataEntery {

    int[] arrayDataEntery()    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many integers are you going to enter? Type a number and hit Enter.");

        int numbers = scanner.nextInt();
        int[] numericValue = new int[numbers];

        System.out.print("Enter the " + numbers + " integers separated by a space  and press <Enter>:");

       for (int i = 0; i < numbers; i++) {
           numericValue[i] = scanner.nextInt();
          System.out.print(numericValue[i] + "  ");
       }
                return numericValue;
    }

}
