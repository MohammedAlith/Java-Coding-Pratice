// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();


        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ":" + "");
            array[i] = sc.nextInt();
        }


        // Find the maximum number in the array
        int max=0;
        for (int i = 0; i < size; i++)
        {
            //for (int j = i + 1; j < size; j++)
            //{
                if (array[i] > max)
                {
                    max= array[i];
                    //array[i]=array[j];
                   // array[j] = max;
                }
            //}
        }
        System.out.println("Second Largest:"+array[size-1]);
        System.out.println("Smallest:"+array[0]);
        System.out.println("max:"+max);

    }
}