package dataTypes;

public class BubbleSort {

       public int [] bubbleSort(int[] numericValue) {
           int number = numericValue.length;
           int temporaryItem = 0;

           for (int i = 0; i < number; i++) {
               for (int j = 1; j < ( number - i ); j++) {
                   if (( numericValue[j - 1] * numericValue[j - 1] ) > ( numericValue[j] * numericValue[j] )) {
                       temporaryItem = numericValue[j - 1];
                       numericValue[j - 1] = numericValue[j];
                       numericValue[j] = temporaryItem;
                   }
               }
           }
           for (int i = 0; i < numericValue.length; i++) {
               System.out.print(numericValue[i] + " ");
           }
           return numericValue;
       }
}
