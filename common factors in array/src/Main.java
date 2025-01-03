import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first array
        System.out.println("Enter the elements of the first array: ");
        int[] array1 = new int[scanner.nextInt()];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }

        // Read the second array
        System.out.println("Enter the elements of the second array: ");
        int[] array2 = new int[scanner.nextInt()];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = scanner.nextInt();
        }

        // Find the common elements
        int[] commonElements = new int[array1.length];
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    commonElements[count++] = array1[i];
                    break;
                }
            }
        }

        // Print the common elements
        System.out.println("The common elements are: ");
        for (int i = 0; i < count; i++) {
            System.out.println(commonElements[i]);
        }
    }
}