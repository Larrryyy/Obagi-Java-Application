import java.util.Scanner;

public class ExerciseSolutions {

    public static void main(String[] args) {
        // Uncomment the method you'd like to run:
        // findSmallestValue();
        // calculateOddProduct();
        // calculateFactorials();
        // compoundInterest();
        // globalWarmingQuiz();
        // fairTaxCalculation();
        // facebookGrowth();
    }

    // 4.11 Find the Smallest Value
    public static void findSmallestValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int n = scanner.nextInt();
        int smallest = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value #" + (i + 1) + ": ");
            int value = scanner.nextInt();
            if (value < smallest) {
                smallest = value;
            }
        }
        System.out.println("The smallest value is: " + smallest);
        scanner.close();
    }

    // 4.12 Calculate Product of Odd Integers
    public static void calculateOddProduct() {
        int product = 1;
        for (int i = 1; i <= 15; i += 2) {
            product *= i;
        }
        System.out.println("The product of odd integers from 1 to 15 is: " + product);
    }

    // 4.13 Calculate Factorials
    public static void calculateFactorials() {
        System.out.printf("%-10s%-20s%n", "Number", "Factorial");
        for (int i = 1; i <= 20; i++) {
            long factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            System.out.printf("%-10d%-20d%n", i, factorial);
        }
        System.out.println("Note: Calculating the factorial of 100 is difficult due to overflow of type long.");
    }

    // 4.14 Modified Compound-Interest Program
    public static void compoundInterest() {
        double principal = 1000.0; // example principal amount
        System.out.printf("%-10s%-10s%n", "Rate (%)", "Amount");
        for (int rate = 5; rate <= 10; rate++) {
            double amount = principal * Math.pow(1 + rate / 100.0, 10); // compound interest for 10 years
            System.out.printf("%-10d%-10.2f%n", rate, amount);
        }
    }

    // 4.30 Global Warming Quiz
    public static void globalWarmingQuiz() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        String[] questions = {
            "1. What is the primary cause of global warming?\n1. Natural cycles\n2. Human activities\n3. Solar flares\n4. Alien interventions",
            "2. What is the greenhouse effect?\n1. Warming from greenhouses\n2. Trapping of heat by gases\n3. Cooling from plants\n4. Emissions from cars",
            "3. Which gas contributes the most to global warming?\n1. Nitrogen\n2. Methane\n3. Carbon Dioxide\n4. Oxygen",
            "4. What energy source is renewable?\n1. Coal\n2. Oil\n3. Solar energy\n4. Gasoline",
            "5. What international agreement addresses climate change?\n1. Kyoto Protocol\n2. Paris Agreement\n3. Green Deal\n4. G20 Declaration"
        };

        int[] correctAnswers = {2, 2, 3, 3, 2};

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            int answer = scanner.nextInt();
            if (answer == correctAnswers[i]) {
                score++;
            }
        }

        switch (score) {
            case 5:
                System.out.println("Excellent!");
                break;
            case 4:
                System.out.println("Very good!");
                break;
            default:
                System.out.println("Time to brush up on your knowledge of global warming.");
        }

        scanner.close();
    }

    // 4.31 Tax Plan Alternatives (FairTax)
    public static void fairTaxCalculation() {
        Scanner scanner = new Scanner(System.in);
        String[] categories = {"Housing", "Food", "Clothing", "Transportation", "Education", "Healthcare", "Vacations"};
        double totalExpenses = 0;

        for (String category : categories) {
            System.out.print("Enter your expenses for " + category + ": ");
            totalExpenses += scanner.nextDouble();
        }

        double fairTax = totalExpenses * 0.23; // 23% tax rate
        System.out.printf("Your estimated FairTax is: %.2f%n", fairTax);
        scanner.close();
    }

    // 4.32 Facebook User Base Growth
    public static void facebookGrowth() {
        double users = 1_000_000_000; // 1 billion users
        double target1 = 1_500_000_000; // 1.5 billion users
        double target2 = 2_000_000_000; // 2 billion users
        double growthRate = 0.04; // 4% monthly growth
        int months1 = 0, months2 = 0;

        while (users < target1) {
            users += users * growthRate;
            months1++;
        }

        while (users < target2) {
            users += users * growthRate;
            months2++;
        }

        System.out.println("Months to reach 1.5 billion: " + months1);
        System.out.println("Months to reach 2 billion: " + (months1 + months2));
    }
}
