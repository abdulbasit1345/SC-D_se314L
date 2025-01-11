package Lab11;
import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.print("Array contents: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the array: ");

        try {
            int index = scanner.nextInt();
            System.out.println("Element at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}

