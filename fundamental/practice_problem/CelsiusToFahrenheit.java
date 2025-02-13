import java.util.*;
class CelsiusToFahrenheit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature in Celsius : ");
        float celsius = sc.nextInt();

        // converting celsius to fahrenheit using formula

        float fahrenheit = (celsius*9/5)+32;

        System.out.println("After Conversion : "+fahrenheit);
    }
}