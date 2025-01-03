// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String:");
        String rev="";
        String input=sc.nextLine();
        int len = input.length();
        for (int i =len-1; i>=0; i--) {
            rev = rev+input.charAt(i);
        }
        System.out.println(rev);
    }
}