package dataTypes;

public class NumberLenght {

      static void numberLenght( int number){
         int numberlenght;
        if (number<0){    number *=-1;   }
          if (number>0) {  numberlenght = (int) Math.log10(number) + 1;

            System.out.println("The length of the number " + number + " is : " + numberlenght);
          }
            if(number==0)  {
              System.out.println("The length of the number " + number + " is :  1 ");
            }
      }
}

