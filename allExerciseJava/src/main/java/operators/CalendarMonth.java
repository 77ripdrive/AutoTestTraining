package operators;

import java.util.Scanner;

public class CalendarMonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of the month: Integer number from 1 to 12: ");
        int numberMonth = scan.nextInt();
        setMonth(numberMonth);
    }

    static void setMonth(int m) {
        String[] month = {"January "," February "," March "," April "," May "," June ",
                " July "," August "," September "," October "," November "," December "};
        String calendarMonth;
        try {
            calendarMonth = month[m - 1];
            System.out.println("This month is called - " + calendarMonth + ".");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This month has not yet come up");
        }
    }
}
