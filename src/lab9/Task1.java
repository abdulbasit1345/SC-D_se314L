package lab9;

public class Task1 {
    // Generic method to print array in reverse order
    public static <T> void printReverse(T[] array) {
        System.out.print("Array in reverse order: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 1, 6, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'T', 'I', 'S', 'A', 'B'};

        System.out.println("Integer Array:");
        printReverse(intArray);

        System.out.println("\nDouble Array:");
        printReverse(doubleArray);

        System.out.println("\nCharacter Array:");
        printReverse(charArray);
    }
}
