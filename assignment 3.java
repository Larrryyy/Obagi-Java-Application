import java.util.Scanner;

public class JavaExercises {

    public static void gasMileage() {
        Scanner input = new Scanner(System.in);
        int miles, gallons, totalMiles = 0, totalGallons = 0;
        double tripMilesPerGallon, totalMilesPerGallon;

        System.out.print("Enter miles driven (-1 to quit): ");
        miles = input.nextInt();

        while (miles != -1) {
            System.out.print("Enter gallons used: ");
            gallons = input.nextInt();

            totalMiles += miles;
            totalGallons += gallons;
            tripMilesPerGallon = (double) miles / gallons;

            System.out.printf("Miles per gallon for this trip: %.2f%n", tripMilesPerGallon);
            System.out.print("Enter miles driven (-1 to quit): ");
            miles = input.nextInt();
        }

        if (totalGallons != 0) {
            totalMilesPerGallon = (double) totalMiles / totalGallons;
            System.out.printf("Combined miles per gallon: %.2f%n", totalMilesPerGallon);
        } else {
            System.out.println("No data entered.");
        }
    }

    public static void creditLimitCalculator() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter account number (or -1 to quit): ");
        int accountNumber = input.nextInt();

        while (accountNumber != -1) {
            System.out.print("Enter beginning balance: ");
            int beginningBalance = input.nextInt();

            System.out.print("Enter total charges: ");
            int charges = input.nextInt();

            System.out.print("Enter total credits: ");
            int credits = input.nextInt();

            System.out.print("Enter credit limit: ");
            int creditLimit = input.nextInt();

            int newBalance = beginningBalance + charges - credits;
            System.out.printf("New balance: %d%n", newBalance);

            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded.");
            }

            System.out.print("Enter account number (or -1 to quit): ");
            accountNumber = input.nextInt();
        }
    }

    public static void salesCommissionCalculator() {
        Scanner input = new Scanner(System.in);
        double grossSales = 0.0;

        System.out.print("Enter the value of an item sold (-1 to quit): ");
        double itemValue = input.nextDouble();

        while (itemValue != -1) {
            grossSales += itemValue;
            System.out.print("Enter the value of an item sold (-1 to quit): ");
            itemValue = input.nextDouble();
        }

        double earnings = 200 + (0.09 * grossSales);
        System.out.printf("Total earnings: $%.2f%n", earnings);
    }

    public static void salaryCalculator() {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.printf("Enter hours worked for employee %d: ", i);
            double hoursWorked = input.nextDouble();

            System.out.printf("Enter hourly rate for employee %d: ", i);
            double hourlyRate = input.nextDouble();

            double grossPay;
            if (hoursWorked > 40) {
                grossPay = (40 * hourlyRate) + ((hoursWorked - 40) * hourlyRate * 1.5);
            } else {
                grossPay = hoursWorked * hourlyRate;
            }

            System.out.printf("Gross pay for employee %d: $%.2f%n", i, grossPay);
        }
    }

    public static void findLargestNumber() {
        Scanner input = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;

        System.out.print("Enter a number (-1 to quit): ");
        int number = input.nextInt();

        while (number != -1) {
            if (number > largest) {
                largest = number;
            }
            System.out.print("Enter a number (-1 to quit): ");
            number = input.nextInt();
        }

        if (largest != Integer.MIN_VALUE) {
            System.out.printf("The largest number is: %d%n", largest);
        } else {
            System.out.println("No numbers were entered.");
        }
    }

    public static void main(String[] args) {
        System.out.println("All methods are in this file. You can call them individually!");
		
		import java.util.Scanner;

    // Method for 3.38: Encrypt a four-digit integer
    public static void encryption() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a four-digit integer to encrypt: ");
        int number = input.nextInt();

        int[] digits = new int[4];
        for (int i = 3; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        for (int i = 0; i < 4; i++) {
            digits[i] = (digits[i] + 7) % 10;
        }

        // Swap the first and third digits, and the second and fourth digits
        int temp = digits[0];
        digits[0] = digits[2];
        digits[2] = temp;
        temp = digits[1];
        digits[1] = digits[3];
        digits[3] = temp;

        System.out.print("Encrypted number: ");
        for (int digit : digits) {
            System.out.print(digit);
        }
        System.out.println();
    }

    // Method for 3.38: Decrypt a four-digit integer
    public static void decryption() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a four-digit encrypted number to decrypt: ");
        int number = input.nextInt();

        int[] digits = new int[4];
        for (int i = 3; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        // Swap the first and third digits, and the second and fourth digits back
        int temp = digits[0];
        digits[0] = digits[2];
        digits[2] = temp;
        temp = digits[1];
        digits[1] = digits[3];
        digits[3] = temp;

        for (int i = 0; i < 4; i++) {
            digits[i] = (digits[i] + 10 - 7) % 10;
        }

        System.out.print("Decrypted number: ");
        for (int digit : digits) {
            System.out.print(digit);
        }
        System.out.println();
    }

    // Method for 3.39: Calculate World Population Growth
    public static void worldPopulationGrowth() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter current world population: ");
        double population = input.nextDouble();
        System.out.print("Enter annual growth rate (as a percentage): ");
        double growthRate = input.nextDouble();

        System.out.printf("%-5s %-20s %-20s%n", "Year", "Population", "Increase");
        for (int year = 1; year <= 75; year++) {
            double increase = population * (growthRate / 100);
            population += increase;
            System.out.printf("%-5d %-20.2f %-20.2f%n", year, population, increase);

            if (population >= 2 * population) {
                System.out.printf("Population doubles in year %d%n", year);
                break;
            }
        }
    }

    // Main method to provide a menu to the user
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Select an option:");
        System.out.println("1. Encrypt a number");
        System.out.println("2. Decrypt a number");
        System.out.println("3. World Population Growth");
        System.out.print("Enter your choice (or -1 to quit): ");
        int choice = input.nextInt();

        while (choice != -1) {
            switch (choice) {
                case 1 -> encryption();
                case 2 -> decryption();
                case 3 -> worldPopulationGrowth();
                default -> System.out.println("Invalid choice. Please try again.");
            }

            System.out.print("Enter your choice (or -1 to quit): ");
            choice = input.nextInt();
        }

        System.out.println("Program terminated.");
    }
}

    }
}
