import java.util.*;
class pattern {

    static void p1(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    static void p2(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }

    static void p3(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }

    static void p4(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(' ');
            }
            for(int k=0; k<i+1; k++){
                System.out.print('*');
            }
            if(i!=0){
                for(int l=0; l<i; l++){
                    System.out.print('*');
                }
            }
            System.out.println();
        }
    }

    static void p5(int n){
        for(int i=0; i<n; i++){
            for(int k=0; k<i; k++){
                System.out.print(' ');
            }
            for(int j=0; j<n-i; j++){
                System.out.print('*');
            }
            for(int l=0; l<n-i-1; l++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        p4(n);
        p5(n);
    }
}