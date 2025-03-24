import java.util.Scanner;

// Largest and Smallest Integers
class LargestSmallest {
    public void findLargestSmallest() {
        Scanner scanner = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        System.out.println("Enter five integers:");
        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            if (num > largest) largest = num;
            if (num < smallest) smallest = num;
        }

        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }
}

// Multiples
class Multiples {
    public void checkMultiples() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        if (num1 % num2 == 0) {
            System.out.println(num1 + " is a multiple of " + num2);
        } else {
            System.out.println(num1 + " is not a multiple of " + num2);
        }
    }
}

// Checkerboard Pattern
class Checkerboard {
    public void displayCheckerboard() {
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                System.out.println("* * * * * * * *");
            } else {
                System.out.println(" * * * * * * * *");
            }
        }
    }
}

// Circle Metrics
class CircleMetrics {
    public void calculateMetrics() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        int radius = scanner.nextInt();

        System.out.printf("Diameter: %d%n", 2 * radius);
        System.out.printf("Circumference: %.2f%n", 2 * Math.PI * radius);
        System.out.printf("Area: %.2f%n", Math.PI * radius * radius);
    }
}

// Character Integers
class CharacterIntegers {
    public void displayCharacterValues() {
        char[] characters = {'A', 'B', 'C', 'a', 'b', 'c', '0', '1', '2', '$', '*', '+', '/', ' '};

        for (char character : characters) {
            System.out.printf("The character '%c' has the value %d%n", character, (int) character);
        }
    }
}

// Separate Digits
class SeparateDigits {
    public void separateDigits() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();

        System.out.printf("%d   %d   %d   %d   %d%n",
                number / 10000,
                (number / 1000) % 10,
                (number / 100) % 10,
                (number / 10) % 10,
                number % 10);
    }
}

// Squares and Cubes Table
class SquaresCubesTable {
    public void displayTable() {
        System.out.printf("%-10s%-10s%-10s%n", "Number", "Square", "Cube");
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%-10d%-10d%-10d%n", i, i * i, i * i * i);
        }
    }
}

// Number Analysis
class NumberAnalysis {
    public void analyzeNumbers() {
        Scanner scanner = new Scanner(System.in);

        int negatives = 0, positives = 0, zeros = 0;
        System.out.println("Enter five numbers:");

        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            if (num < 0) negatives++;
            else if (num > 0) positives++;
            else zeros++;
        }

        System.out.println("Negative numbers: " + negatives);
        System.out.println("Positive numbers: " + positives);
        System.out.println("Zeros: " + zeros);
    }
}

// BMI Calculator
class BMICalculator {
    public void calculateBMI() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);
        System.out.printf("Your BMI is %.2f%n", bmi);

        System.out.println("BMI Categories:");
        System.out.println("Underweight: < 18.5");
        System.out.println("Normal weight: 18.5 - 24.9");
        System.out.println("Overweight: 25 - 29.9");
        System.out.println("Obesity: BMI of 30 or greater");
    }
}

// Population Growth
class PopulationGrowth {
    public void estimateGrowth() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the current world population: ");
        long population = scanner.nextLong();

        System.out.print("Enter the annual growth rate (percentage): ");
        double growthRate = scanner.nextDouble();

        for (int year = 1; year <= 5; year++) {
            population += population * (growthRate / 100);
            System.out.printf("Year %d: Estimated population: %d%n", year, population);
        }
    }
}

// Car-Pool Savings
public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an operation to perform:");
        System.out.println("1. Largest and Smallest Integers");
        System.out.println("2. Check Multiples");
        System.out.println("3. Checkerboard Pattern");
        System.out.println("4. Circle Metrics");
        System.out.println("5. Character Integers");
        System.out.println("6. Separate Digits");
        System.out.println("7. Squares and Cubes Table");
        System.out.println("8. Number Analysis");
        System.out.println("9. BMI Calculator");
        System.out.println("10. Population Growth Estimation");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                new LargestSmallest().findLargestSmallest();
                break;
            case 2:
                new Multiples().checkMultiples();
                break;
            case 3:
                new Checkerboard().displayCheckerboard();
                break;
            case 4:
                new CircleMetrics().calculateMetrics();
                break;
            case 5:
                new CharacterIntegers().displayCharacterValues();
                break;
            case 6:
                new SeparateDigits().separateDigits();
                break;
            case 7:
                new SquaresCubesTable().displayTable();
                break;
            case 8:
                new NumberAnalysis().analyzeNumbers();
                break;
            case 9:
                new BMICalculator().calculateBMI();
                break;
            case 10:
                new PopulationGrowth().estimateGrowth();
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
        }
    }
}
