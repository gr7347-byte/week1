import java.util.Scanner;

class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        double feetInYard = 3.0;
        double yardsInMile = 1760.0;

        double distanceInYards = distanceInFeet / feetInYard;
        double distanceInMiles = distanceInYards / yardsInMile;

        System.out.println("The distance in yards is " + distanceInYards +
                " while the distance in miles is " + distanceInMiles);
    }
}