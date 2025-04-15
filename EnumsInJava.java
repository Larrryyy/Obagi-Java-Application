enum AccountType {
    SAVINGS, CHECKING, FIXED_DEPOSITE;
}

public class EnumsInJava {
    public static void main(String[] args) {
        AccountType type = AccountType.SAVINGS;

        switch (type) {
            case SAVINGS: {
                System.out.println("Your saving account has been created");
            }
            break;

            case CHECKING: {
                System.out.println("Your checking account has been created");
            }
            break;

            case FIXED_DEPOSITE: {
                System.out.println("Your fixed deposit account has been created");
            }
            break;

            default:
                System.out.println("Unknown account type");
        }
    }
}
