import java.util.*;
class VolumeOfCylinder{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of Cylinder :");
        int radius = sc.nextInt();
        System.out.println("Enter height of Cylinder :");
        int height = sc.nextInt();

        //calculating volume of cylinder using formula

        float volume = 3.14f *(radius*radius)*height;

        System.out.println("Volume of a Cylinder is:"+volume);

    }
}