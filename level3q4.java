import java.util.Scanner;

class TravelComputation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = input.next();
        System.out.print("Enter From City: ");
        String fromCity = input.next();
        System.out.print("Enter Via City: ");
        String viaCity = input.next();
        System.out.print("Enter To City: ");
        String toCity = input.next();

        System.out.print("Enter Distance from " + fromCity + " to " + viaCity + " (Miles): ");
        double distanceFromToVia = input.nextDouble();
        System.out.print("Enter Distance from " + viaCity + " to " + toCity + " (Miles): ");
        double distanceViaToFinalCity = input.nextDouble();

        System.out.print("Enter Time from " + fromCity + " to " + viaCity + " (minutes): ");
        int timeFromToVia = input.nextInt();
        System.out.print("Enter Time from " + viaCity + " to " + toCity + " (minutes): ");
        int timeViaToFinalCity = input.nextInt();

        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("The Total Distance travelled by " + name + " from " + fromCity +
                " to " + toCity + " via " + viaCity + " is " + totalDistance +
                " km and the Total Time taken is " + totalTime + " minutes");
    }
}