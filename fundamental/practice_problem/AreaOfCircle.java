import java.util.*;
class AreaOfCircle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of Circle : ");
        int radius = sc.nextInt();
        
        //calculate area of circle using formula

        float area = 3.14f * (radius*radius);

        System.out.println("Area of circle is :"+area);
    }
}