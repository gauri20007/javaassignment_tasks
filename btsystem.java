import java.util.*;

public class btsystem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int balance = 0;
        int choice;

        while (true) {
            System.out.println("\nBank Transactions------------");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    int deposit = sc.nextInt();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposited Amount Sucessfully");
                    } else {
                        System.out.println("Invalid amount Entered:");
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    int withdraw = sc.nextInt();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawn successfull.");
                    } else {
                        System.out.println("Insufficient balance");
                    }
                    break;

                case 3:
                    System.out.println("Current balance: Rs" + balance);
                    break;

                case 4:
                    System.out.println("Exiting the System.");
                    return;

                default:
                    System.out.println("Invalid choice!!!!!!");
            }
        }
    }
}
