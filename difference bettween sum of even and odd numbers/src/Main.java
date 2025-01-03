import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements in the array
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        // Create an array to store the elements
        int[] arr = new int[n];

        // Read the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Calculate the sum of even and odd elements
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }

        // Calculate the difference
        int difference = evenSum - oddSum;

        // Output the result
        System.out.println("Difference between the sum of even and odd elements: " + difference);

        // Close the scanner
        scanner.close();
    }
}
