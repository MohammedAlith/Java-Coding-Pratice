// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("String: ");
        String str = sc.next();
        System.out.println("Char: ");
        char c = sc.next().charAt(0);
        //ASystem.out.println("Char: ");
        int index = str.indexOf(c);
        if (index != -1) {
            System.out.print("char:" + c + "find at index" + index);
        } else
            System.out.println("Not find");
    }
}

        //for (int i = 1; i <= 5; i++) {


            //System.out.println("i = " + i);
//

