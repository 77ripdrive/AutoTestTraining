package firstApp;

public class Output {
    public static void main(String[] args) {

        int[] randomNumbers = {11, 9, 4, 5, 99, 1};
        for (int i : randomNumbers) {
            System.out.print("   "+i);
        }
        System.out.println();
        for (int i : randomNumbers){
            System.out.println(i);
        }
    }
}