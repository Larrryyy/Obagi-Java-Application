import java.security.SecureRandom;
import java.util.Scanner;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the upper limit (greater than 0): ");
        int upperLimit = scanner.nextInt();

        while (upperLimit <= 0) {
            System.out.print("Invalid input. Please enter a number greater than 0: ");
            upperLimit = scanner.nextInt();
        }

        int randomNumber = secureRandom.nextInt(upperLimit) + 1;

        System.out.println("Generated random number: " + randomNumber);
    }
}
