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

    static void p6(int n){
        for(int i=0; i<(2*n)-1; i++){
            if(i<n){
                for(int j=0; j<i+1; j++){
                    System.out.print('*');
                }
            }
            else {
                for(int k=0;k<(2*n)-i-1; k++){
                    System.out.print('*');
                }
            }
            System.out.println();
        }
    }

    static void p7(int n){
        for(int i=0; i<n; i++){
            int c = i%2==1?1:0;
            for(int j=0; j<i; j++){
                if(c==1){
                    System.out.print(c);
                    c=0;
                    continue;
                }
                if(c==0){
                    System.out.print(c);
                    c=1;
                }
            }
            System.out.println();
        }
    }

    static void p8(int n){
        for(int i=0; i<n; i++){
            int c=1;
            int d=i+1;
            for(int j=0; j<i+1; j++){
                System.out.print(c);
                c++;
            }
            for(int k=0; k<(2*n)-(2*(i+1)); k++){
                System.out.print(' ');
            }
            for(int l=0; l<i+1; l++){
                System.out.print(d);
                d--;
            }
            System.out.println();
        }
    }

    static void p9(int n){
        int c=1;
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }

    static void p10(int n){
        for(int i=0; i<n; i++){
            char c = 'A';
            for(int j=0; j<i+1; j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        p10(n);
    }
}