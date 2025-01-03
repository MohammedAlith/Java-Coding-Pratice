// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int rev;
        int arm=0;
        int temp=num;
        //Scanner sc = new Scanner(System.in);
        //num = sc.nextInt();
        while(num>0)
        //for(int i=0; i<num; i++);
        {
            rev = num % 10;
            arm=arm+rev*rev*rev;
            //Arm = Arm+rev * rev * rev;

            num = num / 10;
        }
        if(temp==arm)
        {
            System.out.print("Armstrong number");
        }else
        System.out.println("Not Armstrong number");
    }
}