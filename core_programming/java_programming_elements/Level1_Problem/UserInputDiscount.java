import java.util.*;
class UserInputDiscount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Fee : ");
        int fee = sc.nextInt();
        System.out.println("Enter the Discount on fee : ");
        int discountPercent =sc.nextInt();
        double discount = (fee * discountPercent) / 100.0;
        double discountedFee = fee - discount;
        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f\n", discount, discountedFee);
    }
}