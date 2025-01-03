import java.util.*;

public class Main {
    public static void main(String[] args) {
        int rev;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            rev=(rev*10)+n%10;
            n=n/10;
            System.out.println rev);
        }
    }
}// Sample array with a missing number

        /*int n = arr.length + 1; // Total number of elements if the array was not missing any number
        int totalSum = n * (n + 1) / 2; // Sum of natural numbers from 1 to n

        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        int missingNumber = totalSum - actualSum;
        System.out.println("The missing number is: " + missingNumber);
    }
}*/

