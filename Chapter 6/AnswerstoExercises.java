import java.util.*;

public class Chapter6Exercises {

    // 6.10: Sales Commissions
    public static void salesCommissions(int[] sales) {
        int[] ranges = new int[9];
        for (int sale : sales) {
            int salary = 200 + (int) (sale * 0.09);
            int index = (salary >= 1000) ? 8 : (salary - 200) / 100;
            ranges[index]++;
        }
        System.out.println("Salary Ranges:");
        for (int i = 0; i < ranges.length; i++) {
            if (i == 8) System.out.println("$1000 and over: " + ranges[i]);
            else System.out.printf("$%d-%d: %d\n", 200 + i * 100, 299 + i * 100, ranges[i]);
        }
    }

    // 6.11: Array operations
    public static void arrayOperations() {
        int[] counts = new int[10];
        int[] bonus = new int[15];
        int[] bestScores = {85, 92, 78, 90, 88};

        Arrays.fill(counts, 0);
        for (int i = 0; i < bonus.length; i++) bonus[i]++;
        for (int score : bestScores) System.out.println(score);
    }

    // 6.12: Duplicate Elimination
    public static void duplicateElimination() {
        Scanner input = new Scanner(System.in);
        int[] unique = new int[5];
        int count = 0;

        while (count < 5) {
            System.out.print("Enter number (10-100): ");
            int num = input.nextInt();
            if (num < 10 || num > 100) continue;
            boolean found = false;
            for (int j = 0; j < count; j++) if (unique[j] == num) found = true;
            if (!found) unique[count++] = num;
            for (int i = 0; i < count; i++) System.out.print(unique[i] + " ");
            System.out.println();
        }
    }

    // 6.13: Labeling array
    public static void labelSales() {
        int[][] sales = new int[3][5];
        int label = 1;
        for (int row = 0; row < sales.length; row++) {
            for (int col = 0; col < sales[row].length; col++) {
                sales[row][col] = label++;
            }
        }
        for (int[] row : sales) System.out.println(Arrays.toString(row));
    }

    // 6.14: Product using varargs
    public static int product(int... numbers) {
        int result = 1;
        for (int num : numbers) result *= num;
        return result;
    }

    // 6.15: Command-line argument array size
    public static void arrayWithCommandLineArg(String[] args) {
        int size = (args.length > 0) ? Integer.parseInt(args[0]) : 10;
        int[] array = new int[size];
        Arrays.fill(array, 0);
        System.out.println("Array size: " + array.length);
    }

    // 6.16: Enhanced for to sum doubles
    public static void sumCommandLineDoubles(String[] args) {
        double sum = 0.0;
        for (String arg : args) sum += Double.parseDouble(arg);
        System.out.println("Sum: " + sum);
    }

    // 6.17: Dice Rolling Simulation
    public static void diceRolling() {
        Random rand = new Random();
        int[] frequency = new int[13];

        for (int i = 0; i < 36000000; i++) {
            int sum = 1 + rand.nextInt(6) + 1 + rand.nextInt(6);
            frequency[sum]++;
        }
        for (int i = 2; i < frequency.length; i++) {
            System.out.printf("Sum %d: %d times\n", i, frequency[i]);
        }
    }

    // 6.18: Airline Reservation System
    public static void airlineReservation() {
        Scanner input = new Scanner(System.in);
        boolean[] seats = new boolean[10];

        while (true) {
            System.out.print("1 for First Class, 2 for Economy: ");
            int section = input.nextInt();
            int start = (section == 1) ? 0 : 5;
            int end = (section == 1) ? 5 : 10;
            boolean assigned = false;

            for (int i = start; i < end; i++) {
                if (!seats[i]) {
                    seats[i] = true;
                    System.out.println("Seat " + (i + 1) + " assigned in " + (section == 1 ? "First Class" : "Economy"));
                    assigned = true;
                    break;
                }
            }

            if (!assigned) {
                System.out.print((section == 1 ? "Economy" : "First Class") + " is available. Assign? (y/n): ");
                if (input.next().equalsIgnoreCase("y")) {
                    section = (section == 1) ? 2 : 1;
                } else {
                    System.out.println("Next flight leaves in 3 hours.");
                }
            }
        }
    }

    // 6.19: Total Sales with 2D array
    public static void totalSales() {
        Scanner input = new Scanner(System.in);
        double[][] sales = new double[5][4];
        System.out.println("Enter salesperson (1-4), product (1-5), value. -1 to stop.");
        while (true) {
            int sp = input.nextInt();
            if (sp == -1) break;
            int prod = input.nextInt();
            double val = input.nextDouble();
            sales[prod - 1][sp - 1] += val;
        }
        System.out.printf("%-10s", "Product");
        for (int i = 1; i <= 4; i++) System.out.printf("SP%d     ", i);
        System.out.println("Total");

        for (int i = 0; i < 5; i++) {
            double rowTotal = 0;
            System.out.printf("%-10d", (i + 1));
            for (int j = 0; j < 4; j++) {
                System.out.printf("%-8.2f", sales[i][j]);
                rowTotal += sales[i][j];
            }
            System.out.printf("%-8.2f\n", rowTotal);
        }

        System.out.printf("%-10s", "Total");
        for (int j = 0; j < 4; j++) {
            double colTotal = 0;
            for (int i = 0; i < 5; i++) colTotal += sales[i][j];
            System.out.printf("%-8.2f", colTotal);
        }
    }

    public static void main(String[] args) {
        // You can call each method here to test individually
        // Example: salesCommissions(new int[]{5000, 3000, 10000});
    }
}
