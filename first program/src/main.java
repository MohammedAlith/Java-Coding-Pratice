import java.util.*;
class main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
            for (int i= 1; i <= n; i++) {
                if (i % 2 == 0 && i % 3 == 0 && i % 4 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
