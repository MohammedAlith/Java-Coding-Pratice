// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int [] array=new int[N];
        for(int i=0; i<N; i++){
            array[i]=sc.nextInt();
        }

        int min = array[0];
        int max = array[N-1];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("The minimum element in the array is: " + min);
        System.out.println("The maximum element in the array is: " + max);
    }
}