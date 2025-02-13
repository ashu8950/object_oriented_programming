import java.util.*;
class SimpleInterest{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal :");
        int principal = sc.nextInt();
        System.out.println("Enter Rate :");
        double rate = sc.nextDouble();
        System.out.println("Enter Time :");
        int time = sc.nextInt();

        //calculating simple Interest using formula

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest is : "+ simpleInterest);
    }
}