import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance = 10000; // initial balance

        System.out.print("Enter amount to withdraw: ");
        int amount = scanner.nextInt();

        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful!");
            System.out.println("Remaining balance: " + balance);
        }

        scanner.close();
    }
}