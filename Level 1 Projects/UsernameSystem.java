import java.util.*;

public class UsernameSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n------ USERNAME SYSTEM ------");
            System.out.println("1. Validate Username");
            System.out.println("2. Check Strength");
            System.out.println("3. Suggest Usernames");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int ch = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter username: ");
            String username = sc.nextLine();

            boolean valid = true;

            // Rule 1: length
            if (username.length() < 5 || username.length() > 15)
                valid = false;

            // Rule 2: first char not digit
            if (Character.isDigit(username.charAt(0)))
                valid = false;

            // Rule 3: no spaces and only allowed chars
            for (int i = 0; i < username.length(); i++) {
                char c = username.charAt(i);
                if (!(Character.isLetterOrDigit(c) || c == '_')) {
                    valid = false;
                    break;
                }
            }

            if (ch == 1) {
                if (valid)
                    System.out.println("Valid Username");
                else
                    System.out.println("Invalid Username");
            }

            else if (ch == 2) {
                if (!valid) {
                    System.out.println("Username must be valid to check strength.");
                } else {
                    boolean hasLetter = false;
                    boolean hasDigit = false;
                    boolean hasUnderscore = false;

                    for (int i = 0; i < username.length(); i++) {
                        char c = username.charAt(i);
                        if (Character.isLetter(c)) hasLetter = true;
                        else if (Character.isDigit(c)) hasDigit = true;
                        else if (c == '_') hasUnderscore = true;
                    }

                    if (hasLetter && !hasDigit && !hasUnderscore)
                        System.out.println("Strength: WEAK");
                    else if (hasLetter && hasDigit && !hasUnderscore)
                        System.out.println("Strength: MEDIUM");
                    else if (hasLetter && hasDigit && hasUnderscore)
                        System.out.println("Strength: STRONG");
                    else
                        System.out.println("Strength: MEDIUM");
                }
            }

            else if (ch == 3) {
                if (valid) {
                    System.out.println("Username is already valid. No suggestions needed.");
                } else {
                    String clean = username.replace(" ", "");

                    System.out.println("Suggestions:");
                    System.out.println(clean + "_01");
                    System.out.println(clean + "2026");
                    System.out.println("user_" + clean);
                }
            }

            else if (ch == 4) {
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