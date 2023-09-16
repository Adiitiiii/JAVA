import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a = 10, b = 20, c;
        char ch;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice (+, -, *, /): ");
        ch = scanner.next().charAt(0);

        switch (ch) {
            case '+':
                c = a + b;
                System.out.print("Result: " + c);
                break;

            case '-':
                c = a - b;
                System.out.print("Result: " + c);
                break;

            case '*':
                c = a * b;
                System.out.print("Result: " + c);
                break;

            case '/':
                if (b != 0) {
                    c = a / b;
                    System.out.print("Result: " + c);
                } else {
                    System.out.print("Cannot divide by zero");
                }
                break;

            default:
                System.out.print("Invalid choice");
        }
    }
}
