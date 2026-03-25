import java.util.Scanner;

class RocketCountdownWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get countdown start value
        int counter = input.nextInt();

        // Count down from counter to 1 using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Blast off!");

        input.close();
    }
}