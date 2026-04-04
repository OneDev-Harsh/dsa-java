import java.util.*;
class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x=0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                x++;
            }
        }
        if(x==2){
            System.out.println("It is a prime no.");
        }
        else {
            System.out.println("It is not a prime no.");
        }
    }
}
