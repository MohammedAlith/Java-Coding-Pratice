import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int A = scanner.nextInt();
        int[] arr = new int[A];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < A; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        int Sorted = 1; // Assume array is sorted
        for (int i = 0; i < A - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                Sorted = 0; // Array is not sorted
                break;
            }
        }

        System.out.println("Output: " + Sorted);
    }
}
