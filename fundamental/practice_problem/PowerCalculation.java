import java.util.*;
class PowerCalculation{
    public static double calulatingPower(int base,int power){
    
        return Math.pow(base,power);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base :");
        int base = sc.nextInt();
        System.out.println("Enter Power : ");
        int power = sc.nextInt();

        System.out.println("Calculating power : "+calulatingPower(base,power));


    }
}