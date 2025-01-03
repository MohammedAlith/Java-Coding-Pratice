import java.util.*;
public class lcm {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int A= sc.nextInt();
        int B= sc.nextInt();
        int Lcm;
        if(A>B){
            Lcm=A;
        }else
            Lcm=B;
        while(true){
            if(Lcm%A==0 && Lcm%B==0){
                System.out.println("Lcm of Two numbers: "+Lcm);
                break;
            }
        }
    }
}