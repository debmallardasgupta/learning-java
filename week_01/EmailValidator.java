import java.util.*;

public class EmailValidator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n------ SMART EMAIL VALIDATOR ------");
            System.out.println("1. Validate Email");
            System.out.println("2. Mask Email");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            int ch = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter email: ");
            String email = sc.nextLine();

            boolean valid = true;

            
            int atCount = 0;
            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@')
                    atCount++;
            }
            // Rule 1: exactly one @
            if (atCount != 1)
                valid = false;

            // Rule 2: no spaces
            if (email.contains(" "))
                valid = false;

            if (valid) {
                int atIndex = email.indexOf('@');
                String username = email.substring(0, atIndex);
                String domain = email.substring(atIndex + 1);

                // Rule 3: username rules
                if (username.length() == 0)
                    valid = false;
                if (username.startsWith(".") || username.endsWith("."))
                    valid = false;
                if (username.contains(".."))
                    valid = false;

                // Rule 4: domain rules
                if (!domain.contains("."))
                    valid = false;
                else {
                    int dotIndex = domain.lastIndexOf('.');
                    String site = domain.substring(0, dotIndex);
                    String ext = domain.substring(dotIndex + 1);

                    if (site.length() == 0 || ext.length() < 2)
                        valid = false;
                }
            }

            if (ch == 1) {
                if (valid)
                    System.out.println("Valid Email!");
                else
                    System.out.println("INVALID Email!");
            }

            else if (ch == 2) {
                if (!valid) {
                    System.out.println("Email must be valid before masking.");
                } else {
                    int at = email.indexOf('@');

                    String masked =
                            email.charAt(0)
                            + "*".repeat(at - 2)
                            + email.charAt(at - 1)
                            + email.substring(at);

                    System.out.println("Masked Email: " + masked);
                }
            }

            else if (ch == 3) {
                System.out.println("Exiting...");
                break;
            }

            else {
                System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}