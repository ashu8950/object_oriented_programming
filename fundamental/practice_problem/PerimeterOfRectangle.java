import java.util.*;
class PerimeterOfRectangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Rectangle: ");
        int length = sc.nextInt();
        System.out.println("Enter width of Rectangle : ");
        int width = sc.nextInt();

        //calculating perimeter of Rectangle

        int perimeter = 2*(length+width);

        System.out.println("Perimeter of Rectangle is : "+perimeter);


    }
}