import java.util.Scanner;;
class NumberAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] > 0) {
                System.out.println(numbers[i] + " is positive and " + (numbers[i] % 2 == 0 ? "even" : "odd"));
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is negative");
            } else {
                System.out.println("Zero");
            }
        }
        System.out.println("Comparison of first and last elements: " + (numbers[0] > numbers[4] ? "First is greater" : numbers[0] < numbers[4] ? "Last is greater" : "Both are equal"));
        scanner.close();
    }
}