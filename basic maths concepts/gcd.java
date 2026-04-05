import java.util.*;
public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // int x=0;
        // for(int i=1; i<=Math.min(a,b); i++){
        //     if(a%i==0 && b%i==0){
        //         x=i;
        //     }
        // }
        // System.out.println("GCD is "+x);

        // better approach :-
        for(int i=Math.min(a,b); i>=1; i--){
            if(a%i==0 && b%i==0){
                System.out.println("GCD is " + i);
                break;
            }
        }
    }
}
