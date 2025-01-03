// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int rev=0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            rev=(rev*10)+n%10;
            n=n/10;

            //System.out.println(rev);
        }
        System.out.println(rev);
    }
}