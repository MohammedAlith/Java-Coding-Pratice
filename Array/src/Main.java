import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       int [] arr=new int[N];

        for (int i = 0; i < N; i++) {

        arr[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {

            System.out.println(arr[i]*arr[i]);





    }
}
}