package dataTypes;

import static dataTypes.NumberLenght.numberLenght;

public class RunnerArrays {
    public static void main(String[] args) {

      int minLenghtOfNumber;
      int maxLenghtOfNumber;

        ArrayDataEntery arrayDataEntery=new ArrayDataEntery();
       int[] numericValue= arrayDataEntery.arrayDataEntery();

        System.out.println();

        BubbleSort bubbleSort=new BubbleSort();
        int [] arrayAfterSort=bubbleSort.bubbleSort(numericValue);

        System.out.println("     <--   Array After Bubble Sort");

        minLenghtOfNumber=arrayAfterSort[0];
        maxLenghtOfNumber=arrayAfterSort[arrayAfterSort.length-1];

        numberLenght(minLenghtOfNumber);
        numberLenght(maxLenghtOfNumber);



    }
}
