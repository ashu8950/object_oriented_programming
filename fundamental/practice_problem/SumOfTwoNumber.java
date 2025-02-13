import java.util.*;
class SumOfTwoNumber{
    public static int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number :");
        int firstNumber = sc.nextInt();
        System.out.println("Enter Second Number :");
        int secondNumber = sc.nextInt();

        //Printing the sum of two number
        
        System.out.println("Sum of Two number is: "+sum(firstNumber,secondNumber));

    }
}