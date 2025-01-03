// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        //Scanner sc=new Scanner(System.in);
        int myNum1 = plusMethod(x,y);
        //Scanner sc=new Scanner(System.in);
        //int x=sc.nextInt();
        //int y=sc.nextInt();
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double myNum2 = plusMethod(a,b);
        //double x=sc.nextDouble();
        //double y=sc.nextDouble();
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}