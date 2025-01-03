import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();


        // Check if the lengths are equal
        if (str1.length() != str2.length()) {
            System.out.println("Not anagrams: Different lengths.");
        } else {
            // Convert strings to character arrays
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            // Sort the character arrays
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // Compare the sorted character arrays
            if (Arrays.equals(charArray1, charArray2)) {
                System.out.println("Anagrams");
            } else {
                System.out.println("Not anagrams");
            }
        }


    }
}
