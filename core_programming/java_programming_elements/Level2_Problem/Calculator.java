import java.util.*;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();

        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division;

        if (num2 == 0) {
            System.out.println("Division by zero is not allowed.");
            division = 0;
        } else {
            division = num1 / num2;
        }

        System.out.printf(
            "The addition, subtraction, multiplication, and division value of two numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f\n",
            num1, num2, addition, subtraction, multiplication, division);
    }
}
