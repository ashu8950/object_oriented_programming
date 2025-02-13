import java.util.*;
class AverageOfThreeNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number : ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second Number : ");
        int secondNumber = sc.nextInt();
        System.out.println("Enter third Number : ");
        int thirdNumber = sc.nextInt();
        //calculating average of three number
        float average = (firstNumber+secondNumber+thirdNumber)/3;
        System.out.println("Average of Three Number : "+ average);
    }
}