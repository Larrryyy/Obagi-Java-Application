import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for candidate's name
        System.out.print("Enter name: ");
        String name = input.nextLine();

        // Prompt for candidate's mark
        System.out.print("Enter mark: ");
        int mark = input.nextInt();

        // Validate and print appropriate results
        if (mark > 100) {
            System.out.println("You don come ohh over sabi!");
        } else {
            if (mark >= 80) {
                System.out.printf("Candidate name: %s%n", name);
                System.out.printf("Candidate mark: %d%n", mark);
                System.out.printf("Candidate grade: %c%n", 'A');
            } else if (mark >= 70) {
                System.out.printf("Candidate name: %s%n", name);
                System.out.printf("Candidate mark: %d%n", mark);
                System.out.printf("Candidate grade: %c%n", 'B');
            } else if (mark >= 60) {
                System.out.printf("Candidate name: %s%n", name);
                System.out.printf("Candidate mark: %d%n", mark);
                System.out.printf("Candidate grade: %c%n", 'C');
            } else if (mark >= 50) {
                System.out.printf("Candidate name: %s%n", name);
                System.out.printf("Candidate mark: %d%n", mark);
                System.out.printf("Candidate grade: %c%n", 'D');
            } else if (mark >= 40) {
                System.out.printf("Candidate name: %s%n", name);
                System.out.printf("Candidate mark: %d%n", mark);
                System.out.printf("Candidate grade: %c%n", 'E');
            } else {
                System.out.printf("Candidate name: %s%n", name);
                System.out.printf("Candidate mark: %d%n", mark);
                System.out.printf("Candidate grade: %c%n", 'F');
            }
        }
    }
}