import java.util.Scanner;
import java.util.Random;

public class Solutions {

    // 5.14 Integer power calculation
    public static int integerPower(int base, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }

    // 5.15 Hypotenuse calculation
    public static double hypotenuse(double side1, double side2) {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }

    // 5.16 Check if one integer is a multiple of another
    public static boolean isMultiple(int a, int b) {
        return b % a == 0;
    }

    // 5.17 Check if an integer is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // 5.18 Display a square of asterisks
    public static void squareOfAsterisks(int side) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 5.19 Display a square of any character
    public static void squareOfCharacter(int side, char fillCharacter) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print(fillCharacter);
            }
            System.out.println();
        }
    }

    // 5.20 Circle area calculation
    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    // 5.21 Separating digits
    public static void displayDigits(int number) {
        String result = "";
        while (number > 0) {
            result = (number % 10) + "  " + result;
            number /= 10;
        }
        System.out.println(result);
    }

    // 5.22 Temperature conversions
    public static double celsius(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    public static double fahrenheit(double celsius) {
        return 9.0 / 5.0 * celsius + 32;
    }

    // 5.23 Find the minimum
    public static double minimum3(double num1, double num2, double num3) {
        return Math.min(num1, Math.min(num2, num3));
    }

    // 5.24 Perfect numbers
    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    // 5.25 Prime numbers
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // 5.26 Reverse digits
    public static int reverseDigits(int number) {
        int reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed;
    }

    // 5.27 Greatest Common Divisor (GCD)
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 5.28 Quality points
    public static int qualityPoints(int average) {
        if (average >= 90) return 4;
        else if (average >= 80) return 3;
        else if (average >= 70) return 2;
        else if (average >= 60) return 1;
        else return 0;
    }

    // 5.29 Coin tossing
    enum Coin { HEADS, TAILS }

    public static Coin flip() {
        return Math.random() < 0.5 ? Coin.HEADS : Coin.TAILS;
    }

    // 5.30 and 5.31 Guess the number with count
    public static void playGuessGameWithCount() {
        Random random = new Random();
        int number = 1 + random.nextInt(1000);
        Scanner input = new Scanner(System.in);
        int guess, attempts = 0;

        System.out.print("Guess a number between 1 and 1000: ");
        do {
            guess = input.nextInt();
            attempts++;
            if (guess < number) System.out.println("Too low. Try again.");
            else if (guess > number) System.out.println("Too high. Try again.");
        } while (guess != number);

        System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
        if (attempts <= 10) System.out.println("Either you know the secret or you got lucky!");
        else System.out.println("You should be able to do better!");
    }

    // 5.32 Distance between points
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // 5.34 Binary, octal, and hexadecimal table
    public static void displayNumberSystems() {
        System.out.printf("%-10s %-10s %-10s %-10s%n", "Decimal", "Binary", "Octal", "Hex");
        for (int i = 1; i <= 256; i++) {
            System.out.printf("%-10d %-10s %-10o %-10x%n", i, Integer.toBinaryString(i), i, i);
        }
    }

    // Main method to execute tasks
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select a task to execute (5.14 - 5.39): ");
        int choice = input.nextInt();

        switch (choice) {
            case 531: // Example for 5.31 (Guess with count)
                playGuessGameWithCount();
                break;

            case 532: // Example for 5.32 (Distance calculation)
                System.out.print("Enter coordinates x1, y1, x2, y2: ");
                double x1 = input.nextDouble();
                double y1 = input.nextDouble();
                double x2 = input.nextDouble();
                double y2 = input.nextDouble();
                System.out.println("Distance: " + distance(x1, y1, x2, y2));
                break;

            case 534: // Example for 5.34 (Number systems table)
                displayNumberSystems();
                break;

            // Add more cases here as needed
        }
    }
}
