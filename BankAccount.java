import java.util.Scanner;

public class BankAccount {
    String accountName = "John Wick";
    String accountNumber = "3105684063";
    double accountBalance = 1000000.00;

    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to UBA Bank");
        System.out.println("Enter 1 to withdraw");
        System.out.println("Enter 2 to deposit");

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1: {
                System.out.print("Enter amount to withdraw: ");
                int amount = input.nextInt();

                System.out.printf("Account name is %s%n", bank.accountName);
                System.out.printf("Account number is %s%n", bank.accountNumber);
                System.out.printf("Account balance is %.2f%n", bank.accountBalance);

                bank.withdrawal(amount);
                System.out.printf("Account balance is %.2f%n", bank.accountBalance);
            }
            break;

            case 2: {
                System.out.print("Enter amount to deposit: ");
                int amount = input.nextInt();

                System.out.printf("Account name is %s%n", bank.accountName);
                System.out.printf("Account number is %s%n", bank.accountNumber);
                System.out.printf("Account balance is %.2f%n", bank.accountBalance);

                bank.deposit(amount);
                System.out.printf("Account balance is %.2f%n", bank.accountBalance);
            }
            break;

            default:
                System.out.println("Invalid Input");
        }

        input.close();
    }

    public double withdrawal(int amount) {
        accountBalance -= amount;
        return accountBalance;
    }

    public double deposit(int amount) {
        accountBalance += amount;
        return accountBalance;
    }
}
