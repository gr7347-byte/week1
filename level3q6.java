import java.util.Scanner;

class AthleteRounds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side 1 (m): ");
        double side1 = input.nextDouble();
        System.out.print("Enter side 2 (m): ");
        double side2 = input.nextDouble();
        System.out.print("Enter side 3 (m): ");
        double side3 = input.nextDouble();

        double targetDistance = 5000;
        double perimeter = side1 + side2 + side3; // [cite: 130]
        double rounds = targetDistance / perimeter; // [cite: 130]

        System.out.println("The total number of rounds the athlete will run is " + rounds +
                " to complete 5 km");
    }
}