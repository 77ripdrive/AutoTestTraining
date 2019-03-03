package firstApp;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello !  Enter your name and click on <Enter>: ");
        String name = scanner.next();
        System.out.println("Hello " + name);
    }
}
