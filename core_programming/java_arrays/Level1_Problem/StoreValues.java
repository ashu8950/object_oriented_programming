import java.util.Scanner;
class StoreValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] values = new double[10];
        double total = 0.0;
        int index = 0;
        System.out.println("Enter up to 10 numbers (0 or negative to stop):");
        while (index < 10) {
            double val = scanner.nextDouble();
            if (val <= 0) break;
            values[index++] = val;
        }
        for (int i = 0; i < index; i++) {
            total += values[i];
        }
        System.out.println("Total: " + total);
        scanner.close();
    }
}