import java.util.*;
class DistanceToKm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in kilometers:");
        double km = sc.nextDouble(); 
        
        // Assuming 1 mile = 1.6 km to calculate miles
        double mile = km / 1.6;

        System.out.printf("The total miles is %.2f miles for the given %.2f km\n", mile, km);
        
        sc.close(); 
    }
}
