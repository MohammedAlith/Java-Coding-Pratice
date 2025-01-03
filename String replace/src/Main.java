// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of test cases
        int numTestCases = scanner.nextInt();

        // Loop through each test case
        for (int i = 0; i < numTestCases; i++) {
            // Get the input string
            String str = scanner.next();

            // Get the first character of the string
            char firstChar = str.charAt(0);

            // Replace all occurrences of the first character except the first occurrence with '$'
            String result = firstChar + str.substring(1).replace(firstChar, '$');

            // Print the output string
            System.out.println(result);
        }
    }
}