import java.util.*;
class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        double heightCm = distanceInFeet * 30.48;
        double heightInches = distanceInFeet * 12;

        System.out.printf("Your Height in cm is %.2f while in feet is %.2f and inches is %.2f\n", heightCm, distanceInFeet, heightInches);
        System.out.printf("The distance in yards is %.2f and in miles is %.5f\n", distanceInYards, distanceInMiles);

    }
}
