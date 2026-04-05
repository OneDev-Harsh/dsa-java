package recursions;
import java.util.Scanner;
class name {

    static void print(int x, int n){
        if(x==n){
            return;
        }
        System.out.println("Harsh");
        x++;
        print(x,n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        print(x,n);
    }
}
