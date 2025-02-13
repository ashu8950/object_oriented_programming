import java.util.*;
class IntOperation{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter first Integer");
        a = sc.nextInt();
        System.out.println("Enter second Integer");
        b = sc.nextInt();
        System.out.println("Enter third Integer");
        c = sc.nextInt();
        System.out.println("Output of a programme");
        System.out.println(a + b *c);
        System.out.println(a * b + c);
        System.out.println(c + a / b);
        System.out.println(a % b + c);
    
    }
}