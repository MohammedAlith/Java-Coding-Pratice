import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr=new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int key=sc.nextInt();
        int ans= -1;

        /*for(int i=0; i<n; i++){
            if (arr[i]==key){
                ans=i;

            }
        }*/

        for(int i=n-1; i>=0; i--) {
            if (arr[i] == key) {
                ans = i;

            }
        }
        System.out.println(ans);





    }
}
