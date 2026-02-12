import java.util.Scanner;

public class PIN {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Create PIN
        System.out.print("Set your 4-digit PIN: ");
        String originalPin = sc.nextLine();

        // 2. Login attempts
        int attempts = 0;

        while (attempts < 3) {

            System.out.print("Enter PIN: ");
            String enteredPin = sc.nextLine();

            if (enteredPin.equals(originalPin)) {
                System.out.println("Access Granted ");
                return;
            } else {
                attempts++;
                System.out.println("Wrong PIN ");
            }
        }

        // 3 attempts over
        System.out.println("System Locked!");
    }
}
