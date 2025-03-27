import java.util.Scanner;

public class NumberProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum6to8 = 0, sum4to9 = 0;

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
            if (i >= 5 && i <= 7) { 
                sum6to8 += numbers[i];
            }
            if (i >= 3 && i <= 8) { 
                sum4to9 += numbers[i];
            }
        }

        int result = sum4to9 - sum6to8;
        System.out.println("Result: " + result);
    }
}
