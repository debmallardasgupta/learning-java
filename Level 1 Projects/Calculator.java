import java.util.*;

public class Calculator {

    // Function 1: Addition
    static int add(int a, int b) {
        return a + b;
    }

    // Function 2: Subtraction
    static int subtract(int a, int b) {
        return a - b;
    }

    // Function 3: Multiplication
    static int multiply(int a, int b) {
        return a * b;
    }

    // Function 4: Division
    static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n------ CALCULATOR ------");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Choose: ");

            int ch = sc.nextInt();

            if (ch == 5) break;

            System.out.print("Enter first number: ");
            int x = sc.nextInt();

            System.out.print("Enter second number: ");
            int y = sc.nextInt();

            if (ch == 1)
                System.out.println("Result: " + add(x, y));
            else if (ch == 2)
                System.out.println("Result: " + subtract(x, y));
            else if (ch == 3)
                System.out.println("Result: " + multiply(x, y));
            else if (ch == 4)
                System.out.println("Result: " + divide(x, y));
            else
                System.out.println("Invalid choice.");
        }
        sc.close();
    }
}
