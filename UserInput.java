import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Who Goes you na: ");
        String name = input.nextLine();

        System.out.print("State your location: ");
        String address = input.nextLine();

        System.out.print("Wida, what's your Age man: ");
        byte age = input.nextByte();

        System.out.print("Paste your aza: ");
        float balance = input.nextFloat();

        System.out.print("Are you gay? (True/False): ");
        boolean isJava = input.nextBoolean();
        System.out.println();

        // Output statements with corrected formatting
        System.out.printf("Hello %s, you are welcome to First Bank%n", name);
        System.out.printf("You are living in %s%n", address);
        System.out.printf("You are %d years old%n", age);
        System.out.printf("Your account balance is: $%.2f%n", balance);
        System.out.printf("%s, are you gay? %b%n", name, isJava);
    }
}