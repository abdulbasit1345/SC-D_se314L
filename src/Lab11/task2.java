package Lab11;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first integer: ");
            int num1 = getIntInput(scanner);

            System.out.print("Enter the second integer: ");
            int num2 = getIntInput(scanner);

            int result = num1 / num2;
            System.out.println("The result of division is: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter integer numbers only.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static int getIntInput(Scanner scanner) throws NumberFormatException {
        String input = scanner.next();
        if (!input.matches("-?\\d+")) {
            throw new NumberFormatException("Input is not an integer.");
        }
        return Integer.parseInt(input);
    }
}

