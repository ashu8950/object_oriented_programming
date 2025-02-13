import java.util.*;
class KilometerToMiles{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter kilometer : ");
        float kilometer = sc.nextFloat();

        //converting kilometer to miles using formula;

        double Miles = kilometer * 0.621371;

        System.out.println("Kilometer to miles is :"+ Miles);
    }
}