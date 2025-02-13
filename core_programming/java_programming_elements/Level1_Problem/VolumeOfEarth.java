import java.util.*;
class VolumeOfEarth {
    public static void main(String[] args) {
        double radiusKm = 6378;  
        double kmToMiles = 0.621371; 

        // Calculate volume in cubic kilometers
        double volumeOfSphere = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);

        // Convert volume to cubic miles
        double radiusMiles = radiusKm * kmToMiles;
        double volumeInMiles = (4.0 / 3) * Math.PI * Math.pow(radiusMiles, 3);

        System.out.printf("The volume of Earth in cubic kilometers is %.2f and in cubic miles is %.2f\n", volumeOfSphere, volumeInMiles);
    }
}
