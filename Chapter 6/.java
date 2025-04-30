import java.util.*;

public class chapter6 {

    public static void main(String[] args) {
        // Call methods as needed
        System.out.println("Choose a question to execute (e.g., 6.10, 6.28):");
        Scanner input = new Scanner(System.in);
        String choice = input.next();

        switch (choice) {
            case "6.10":
                salesCommissions();
                break;
            case "6.11":
                oneDimensionalArrayOperations();
                break;
            case "6.12":
                duplicateElimination();
                break;
            case "6.13":
                twoDimensionalArrayLabeling();
                break;
            case "6.14":
                variableLengthArgumentList();
                break;
            case "6.15":
                commandLineArray(new String[]{"10"}); // Example argument
                break;
            case "6.16":
                enhancedForStatement(new String[]{"1.5", "2.5", "3.0"}); // Example arguments
                break;
            case "6.17":
                diceRolling();
                break;
            case "6.18":
                airlineReservations();
                break;
            case "6.19":
                totalSales();
                break;
            case "6.20":
                turtleGraphics();
                break;
            case "6.21":
                knightsTour();
                break;
            case "6.22":
                knightsTourBruteForce();
                break;
            case "6.27":
                sieveOfEratosthenes();
                break;
            case "6.28":
                tortoiseAndHareRace();
                break;
            case "6.29":
                fibonacciSeries();
                break;
            case "6.33":
                pollingProgram();
                break;
            default:
                System.out.println("Invalid choice or not implemented.");
        }
    }

    // 6.10 Sales Commissions
    public static void salesCommissions() {
        int[] salaryRanges = new int[9];  // Ranges: $200–299 to $1000+
        double[] sales = {5000, 3000, 7000, 1000, 8000}; // Example sales data

        for (double sale : sales) {
            int salary = (int) (200 + 0.09 * sale);  // Calculate salary
            int range = Math.min((salary - 200) / 100, 8);  // Determine range
            salaryRanges[range]++;
        }

        System.out.println("Salary Ranges:");
        String[] ranges = {"$200–299", "$300–399", "$400–499", "$500–599", "$600–699", "$700–799", "$800–899", "$900–999", "$1000 and over"};
        for (int i = 0; i < salaryRanges.length; i++) {
            System.out.println(ranges[i] + ": " + salaryRanges[i]);
        }
    }

    // 6.11 One-Dimensional Array Operations
    public static void oneDimensionalArrayOperations() {
        // Part a: Set elements to zero
        int[] counts = new int[10];

        // Part b: Add one to each element
        int[] bonus = new int[15];
        for (int i = 0; i < bonus.length; i++) {
            bonus[i]++;
        }

        // Part c: Display in column format
        int[] bestScores = {95, 88, 92, 100, 85};
        for (int score : bestScores) {
            System.out.println(score);
        }
    }

    // 6.12 Duplicate Elimination
    public static void duplicateElimination() {
        Scanner input = new Scanner(System.in);
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        System.out.println("Enter 5 numbers between 10 and 100:");

        for (int i = 0; i < 5; i++) {
            int num = input.nextInt();
            if (num < 10 || num > 100) {
                System.out.println("Invalid number. Try again.");
                i--;
                continue;
            }
            if (!uniqueNumbers.contains(num)) {
                uniqueNumbers.add(num);
                System.out.println("Unique number entered: " + num);
            } else {
                System.out.println("Duplicate number ignored: " + num);
            }
        }
        System.out.println("Unique numbers: " + uniqueNumbers);
    }

    // 6.13 Two-Dimensional Array Labeling
    public static void twoDimensionalArrayLabeling() {
        int[][] sales = new int[3][5];
        int count = 1;

        for (int row = 0; row < sales.length; row++) {
            for (int col = 0; col < sales[row].length; col++) {
                System.out.printf("sales[%d][%d] = %d\n", row, col, count++);
            }
        }
    }

    // 6.14 Variable-Length Argument List
    public static void variableLengthArgumentList() {
        System.out.println(product(2, 3, 4));  // Output: 24
        System.out.println(product(1, 5, 7, 9));  // Output: 315
    }

    public static int product(int... numbers) {
        int result = 1;
        for (int num : numbers) {
            result *= num;
        }
        return result;
    }

    // 6.15 Command-Line Array
    public static void commandLineArray(String[] args) {
        int size = (args.length > 0) ? Integer.parseInt(args[0]) : 10;
        int[] array = new int[size];

        // Initialize and display the array
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // 6.16 Enhanced For Statement
    public static void enhancedForStatement(String[] args) {
        double sum = 0;
        for (String arg : args) {
            sum += Double.parseDouble(arg);
        }
        System.out.println("Sum: " + sum);
    }

    // 6.17 Dice Rolling
    public static void diceRolling() {
        Random random = new Random();
        int[] sums = new int[11];  // Range of sums (2–12)

        for (int i = 0; i < 36000000; i++) {
            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;
            int sum = die1 + die2;
            sums[sum - 2]++;
        }

        System.out.println("Sum\tFrequency");
        for (int i = 0; i < sums.length; i++) {
            System.out.printf("%d\t%d\n", i + 2, sums[i]);
        }
    }

    // 6.18 Airline Reservations
    public static void airlineReservations() {
        boolean[] seats = new boolean[10];
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Type 1 for First Class, 2 for Economy:");
            int section = input.nextInt();
            int start = (section == 1) ? 0 : 5;
            int end = (section == 1) ? 5 : 10;

            boolean assigned = false;
            for (int i = start; i < end; i++) {
                if (!seats[i]) {
                    seats[i] = true;
                    System.out.printf("Seat %d assigned (%s)\n", i + 1, (section == 1) ? "First Class" : "Economy");
                    assigned = true;
                    break;
                }
            }

            if (!assigned) {
                System.out.println("Section full. Switch sections? (y/n):");
                if (input.next().equalsIgnoreCase("y")) {
                    start = (start == 0) ? 5 : 0;
                    end = (end == 5) ? 10 : 5;

                    for (int i = start; i < end; i++) {
                        if (!seats[i]) {
                            seats[i] = true;
                            System.out.printf("Seat %d assigned (%s)\n", i + 1, (section == 1) ? "Economy" : "First Class");
                            assigned = true;
                            break;
                        }
                    }

                    if (!assigned) {
                        System.out.println("Next flight leaves in 3 hours.");
                        break;
                    }
                } else {
                    System.out.println("Next flight leaves in 3 hours.");
                    break;
                }
            }
        }
    }

    // 6.19 Total Sales
    public static void totalSales() {
        int[][] sales = new int[5][4];  // 5 products, 4 salespeople
        Scanner input = new Scanner(System.in);

        System.out.println("Enter sales data (productNumber salespersonNumber value):");
        while (true) {
            int product = input.nextInt();
            if (product == -1) break;  // Sentinel value to end input
            int salesperson = input.nextInt();
            int value = input.nextInt();
            sales[product - 1][salesperson - 1] += value;
        }

        // Display results
        System.out.println("Sales Summary:");
        System.out.print("\t\t");
        for (int i = 0; i < sales[0].length; i++) {
            System.out.print("Salesperson " + (i + 1) + "\t");
        }
        System.out.println("Total Product Sales");

        for (int i = 0; i < sales.length; i++) {
            System.out.print("Product " + (i + 1) + "\t");
            int totalProductSales = 0;
            for (int j = 0; j < sales[i].length; j++) {
                System.out.print(sales[i][j] + "\t\t");
                totalProductSales += sales[i][j];
            }
            System.out.println(totalProductSales);
        }

        System.out.print("Total Sales\t");
        for (int j = 0; j < sales[0].length; j++) {
            int totalSalesperson = 0;
            for (int i = 0; i < sales.length; i++) {
                totalSalesperson += sales[i][j];
            }
            System.out.print(totalSalesperson + "\t\t");
        }
        System.out.println();
    }

    // 6.20 Turtle Graphics
    public static void turtleGraphics() {
        int[][] floor = new int[20][20];
        int x = 0, y = 0;  // Starting position
        boolean penDown = false;

        int[] commands = {2, 5, 12, 3, 5, 12, 3, 5, 12, 3, 5, 12, 1, 6, 9};

        for (int command : commands) {
            switch (command) {
                case 1 -> penDown = false;  // Pen up
                case 2 -> penDown = true;   // Pen down
                case 3 -> y = Math.min(y + 1, 19);  // Move right
                case 4 -> x = Math.max(x - 1, 0);   // Move up
                case 5 -> x = Math.min(x + 1, 19);  // Move down
                case 6 -> displayFloor(floor);     // Display the floor
                case 9 -> System.exit(0);          // End
            }
            if (penDown) floor[x][y] = 1;
        }
    }

    public static void displayFloor(int[][] floor) {
        for (int[] row : floor) {
            for (int cell : row) {
                System.out.print(cell == 1 ? "*" : " ");
            }
            System.out.println();
        }
    }

    // 6.21 Knight's Tour
    public static void knightsTour() {
        int[][] board = new int[8][8];
        int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
        int currentRow = 0, currentColumn = 0;

        board[currentRow][currentColumn] = 1;  // Start position
        for (int move = 2; move <= 64; move++) {
            boolean moveMade = false;
            for (int i = 0; i < horizontal.length; i++) {
                int newRow = currentRow + vertical[i];
                int newCol = currentColumn + horizontal[i];
                if (isValidMove(newRow, newCol, board)) {
                    board[newRow][newCol] = move;
                    currentRow = newRow;
                    currentColumn = newCol;
                    moveMade = true;
                    break;
                }
            }
            if (!moveMade) break;  // Stuck, no valid moves
        }

        // Display the board
        for (int[] row : board) {
            for (int cell : row) {
                System.out.printf("%2d ", cell);
            }
            System.out.println();
        }
    }

    public static boolean isValidMove(int row, int col, int[][] board) {
        return row >= 0 && row < board.length && col >= 0 && col < board[row].length && board[row][col] == 0;
    }

    // 6.22 Knight's Tour Brute Force
    public static void knightsTourBruteForce() {
        int[][] board = new int[8][8];
        int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
        Random random = new Random();

        int currentRow = 0, currentColumn = 0;
        board[currentRow][currentColumn] = 1;
        int moveCount = 1;

        while (moveCount < 64) {
            int move = random.nextInt(8);
            int newRow = currentRow + vertical[move];
            int newCol = currentColumn + horizontal[move];
            if (isValidMove(newRow, newCol, board)) {
                board[newRow][newCol] = ++moveCount;
                currentRow = newRow;
                currentColumn = newCol;
            }
        }

        // Display the board
        for (int[] row : board) {
            for (int cell : row) {
                System.out.printf("%2d ", cell);
            }
            System.out.println();
        }
        System.out.println("Moves completed: " + moveCount);
    }

    // 6.27 Sieve of Eratosthenes
    public static void sieveOfEratosthenes() {
        int n = 1000;
        boolean[] primes = new boolean[n + 1];
        for (int i = 2; i <= n; i++) primes[i] = true;

        for (int i = 2; i * i <= n; i++) {
            if (primes[i]) {
                for (int j = i * i; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }

        System.out.println("Prime numbers between 2 and 999:");
        for (int i = 2; i <= 999; i++) {
            if (primes[i]) System.out.print(i + " ");
        }
    }

    // 6.28 Tortoise and Hare Race
    public static void tortoiseAndHareRace() {
        int tortoise = 1, hare = 1;  // Starting positions
        Random random = new Random();

        System.out.println("BANG !!!!!");
        System.out.println("AND THEY'RE OFF !!!!!");

        while (tortoise < 70 && hare < 70) {
            // Move Tortoise
            int tortoiseMove = random.nextInt(10) + 1;
            if (tortoiseMove <= 5) tortoise += 3;  // Fast plod
            else if (tortoiseMove <= 7) tortoise -= 6;  // Slip
            else tortoise += 1;  // Slow plod

            // Move Hare
            int hareMove = random.nextInt(10) + 1;
            if (hareMove <= 2) hare += 0;  // Sleep
            else if (hareMove <= 4) hare += 9;  // Big hop
            else if (hareMove == 5) hare -= 12;  // Big slip
            else if (hareMove <= 8) hare += 1;  // Small hop
            else hare -= 2;  // Small slip

            // Adjust positions if they fall below 1
            tortoise = Math.max(tortoise, 1);
            hare = Math.max(hare, 1);

            // Display race track
            for (int i = 1; i <= 70; i++) {
                if (i == tortoise && i == hare) System.out.print("OUCH!!!");
                else if (i == tortoise) System.out.print("T");
                else if (i == hare) System.out.print("H");
                else System.out.print(" ");
            }
            System.out.println();

            // Check for winners
            if (tortoise >= 70 && hare >= 70) {
                System.out.println("It's a tie!");
                break;
            } else if (tortoise >= 70) {
                System.out.println("TORTOISE WINS!!! YAY!!!");
                break;
            } else if (hare >= 70) {
                System.out.println("Hare wins. Yuch.");
                break;
            }

            try {
                Thread.sleep(500);  // Pause for half a second
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    // 6.29 Fibonacci Series
    public static void fibonacciSeries() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        System.out.println("The " + n + "th Fibonacci number is: " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // 6.33 Polling Program
    public static void pollingProgram() {
        String[] topics = {"Climate Change", "Education", "Healthcare", "Poverty", "Technology"};
        int[][] responses = new int[5][10];  // 5 topics, 10 ratings
        Scanner input = new Scanner(System.in);

        // Collect responses
        for (int person = 1; person <= 5; person++) {  // You can increase the number of participants
            System.out.println("Person " + person + ", please rate the following topics (1-10):");
            for (int i = 0; i < topics.length; i++) {
                System.out.print(topics[i] + ": ");
                int rating = input.nextInt();
                responses[i][rating - 1]++;
            }
        }

        // Display tabular report
        System.out.println("\nSummary of Responses:");
        System.out.print("Topic\t\t");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "\t");
        }
        System.out.println("Average");

        int highestTotal = 0, lowestTotal = Integer.MAX_VALUE;
        String highestTopic = "", lowestTopic = "";

        for (int i = 0; i < topics.length; i++) {
            System.out.print(topics[i] + "\t");
            int sum = 0, totalRatings = 0;

            for (int j = 0; j < 10; j++) {
                System.out.print(responses[i][j] + "\t");
                sum += responses[i][j] * (j + 1);
                totalRatings += responses[i][j];
            }

            double avg = (double) sum / totalRatings;
            System.out.printf("%.2f\n", avg);

            if (sum > highestTotal) {
                highestTotal = sum;
                highestTopic = topics[i];
            }
            if (sum < lowestTotal) {
                lowestTotal = sum;
                lowestTopic = topics[i];
            }
        }

        // Display highest and lowest rated topics
        System.out.println("\nHighest Point Total: " + highestTopic + " (" + highestTotal + ")");
        System.out.println("Lowest Point Total: " + lowestTopic + " (" + lowestTotal + ")");
    }
}