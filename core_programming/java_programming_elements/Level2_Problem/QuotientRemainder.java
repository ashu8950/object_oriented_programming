import java.util.*;
class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.printf("The Quotient is %d and Remainder is %d of two numbers %d and %d\n", quotient, remainder, num1, num2);
    }
}
