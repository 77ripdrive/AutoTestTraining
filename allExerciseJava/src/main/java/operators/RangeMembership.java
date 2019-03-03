package operators;

public class RangeMembership {
    public static void main(String[] args) {

        int lowerBound = -50;
        int upperBound = 10;
        int[] numbers = {-2, 15, -16, 10, -3, -51, 22, 2};

         for (int number : numbers) {
            String range = rangeMembership(lowerBound, upperBound, number);
            System.out.printf("%-5d in range: %s\n", number, range);
         }
    }


    private static String rangeMembership(int lower, int upper, int number) {

        if ((number > lower) && (number < upper)) {
            return "(" + lower + ","+ upper + ") ";

        } else if (number == lower) {
            return "[" + lower + ","+ upper + "), [" + lower + ","+ upper + "]";

        } else if (number == upper) {
            return "(" + lower + ","+ upper + "], [" + lower + ","+ upper + "]";

        } else {
            return "Number is outside the bounds of the ranges;";
        }
    }

}