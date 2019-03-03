package makeGiftBox.giftBox;

import makeGiftBox.candy.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Gift  {

    public static void createBox() throws IOException {

        Gift gift = new Gift();
        ArrayList <Candy> candy = gift.createFirstGiftBox();

        showInitialInfoMessage();
        gift.printGiftBox(candy);
        gift.saveToFile(candy);

        double toralWeight = gift.getFinalWeight(candy, 0);
        System.out.println("\n-->   Total weight of all candy is: " + toralWeight + "\n");

        System.out.println("--> Sorted candy by  field Sugar,from Min to Max :\n");

        Collections.sort(candy, new SortBySugar());

        gift.printGiftBox(candy);
        showTheLastInfoMessage();
        gift.findElementBySugar(candy);
    }


    public double getFinalWeight(ArrayList<Candy> candy, double sum) {
        for (Candy vault : candy) {
            sum += vault.getWeight();
        }
        return sum;
    }

    public void findElementBySugar(ArrayList<Candy> candy) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
                double b = sc.nextDouble();
        sc.close();
        StringBuilder item = findCandyBySugar(a, b, candy);
        System.out.println("\nYour candies are: " + item);
    }

    public StringBuilder findCandyBySugar(double a, double b, ArrayList<Candy> candy) {
        StringBuilder candies = new StringBuilder();
        for (Candy vault : candy) {
            if ((vault.getSugar() >= a && vault.getSugar() <= b) || (vault.getSugar() >= b && vault.getSugar() <= a)) {
                candies.append(vault.getName()).append("(").append(vault.getType()).append("), ");
            }
        }
        if (a < 0 || b < 0) {

            throw new IllegalArgumentException("Check entered numbers. They can be real in g.");
        }
        return candies;
    }



    public void printGiftBox(ArrayList<Candy> list) {
        int i = 1;
        System.out.println("ID: " + " NAME:    " + " COST: " + "   WEIGHT:  "
                + "  TYPE:"+"    Sugar--> g/100 g of product :");
          for (Candy vault : list) {

                System.out.println(i + ".   " + vault.getName() + "    " + vault.getSugar() + "   " +
                        "    " + vault.getWeight() + "     " + vault.getType()+ "   "+vault.getSugar());
                i++;
          }
    }


    public void saveToFile(ArrayList<Candy> list) throws IOException {
        FileWriter file = new FileWriter("resultGiftBox.txt");
        Writer output = new BufferedWriter(file);
        int i = 1;
        for (Candy vault : list) {
            output.write(i + ". " + vault.getName() + " " + vault.getSugar() +
                    " " + vault.getWeight() + " " + vault.getType() + "  " + vault.getSugar()+"\n");
            i++;
        }      output.close();
     }

    public ArrayList<Candy> createFirstGiftBox(){
        ArrayList<Candy> list = new ArrayList<Candy>();
        Chocolate chocolateOne = new Chocolate("Alenka ", 2.00, 50, "Chocolate ",
                "Black",15);
        list.add(chocolateOne);
        Chocolate chocolateTwo = new Chocolate("Lundt  ", 4, 50, "  Chocolate",
                "Black",8);
        list.add(chocolateTwo);
        Zefir zefirOne = new Zefir("Zephyr ", 0.8, 50, "  Apple    ",
                "Vanile",5);
        list.add(zefirOne);
        Caramel caramelOne = new Caramel("Polet ", 0.1, 50, "  Caramel  ",
                "none",10);
        list.add(caramelOne);
        Grilyage grilyageOne = new Grilyage("Ideal  ", 0.50, 50.5, "Grilyage  ",
                "natural peanut",10);
        list.add(grilyageOne);

        return list;
    }

    public static void showInitialInfoMessage() {
        System.out.println("!!!!!!!! Hello! Here is a New Year Gift Box  !!!!!!!!\n" +
                "Information bellow will be saved to resultGiftBox.txt.\n");
    }

    public static void showTheLastInfoMessage(){
        System.out.println(
                "\nAnd now let's find some candy from the gift box by the amount of sugar in them.\n" +
                        "Please enter the first and last values of the sugar content range \n" +
                        " from the values in the gift table range(g/100 g candy). \n");
    }

}
