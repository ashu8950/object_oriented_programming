import java.util.*;
class DoubleOpt{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.println("Enter first Integer");
        a = sc.nextDouble();
        System.out.println("Enter second Integer");
        b = sc.nextDouble();
        System.out.println("Enter third Integer");
        c = sc.nextDouble();
        System.out.println("Output of a programme");
        System.out.println(a + b *c);
        System.out.println(a * b + c);
        System.out.println(c + a / b);
        System.out.println(a % b + c);
    
    }
}