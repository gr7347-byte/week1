import java.util.Scanner;

class YoungAndTall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get ages and heights for Amar, Akbar, Anthony
        int amarAge = input.nextInt();
        int akbarAge = input.nextInt();
        int anthonyAge = input.nextInt();

        double amarHeight = input.nextDouble();
        double akbarHeight = input.nextDouble();
        double anthonyHeight = input.nextDouble();

        // Find youngest (smallest age)
        String youngestFriend = "Amar";
        int smallestAge = amarAge;
        if (akbarAge < smallestAge) {
            smallestAge = akbarAge;
            youngestFriend = "Akbar";
        }
        if (anthonyAge < smallestAge) {
            smallestAge = anthonyAge;
            youngestFriend = "Anthony";
        }

        // Find tallest (largest height)
        String tallestFriend = "Amar";
        double largestHeight = amarHeight;
        if (akbarHeight > largestHeight) {
            largestHeight = akbarHeight;
            tallestFriend = "Akbar";
        }
        if (anthonyHeight > largestHeight) {
            largestHeight = anthonyHeight;
            tallestFriend = "Anthony";
        }

        System.out.println("Youngest Friend: " + youngestFriend + " (Age: " + smallestAge + ")");
        System.out.println("Tallest Friend: " + tallestFriend + " (Height: " + largestHeight + ")");
        input.close();
    }
}