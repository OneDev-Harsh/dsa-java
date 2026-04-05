package recursions;
import java.util.*;
class recursion {

    static void oneToN(int i, int n){
        if(i<1){
            return;
        }
        oneToN(i-1, n);
        System.out.println(i);
    }

    static void nToOne(int i, int n){
        if(i>n){
            return;
        }
        nToOne(i+1, n);
        System.out.println(i);
    }

    static int sumOfN(int n){
        if(n<1){
            return 0;
        }
        return n+sumOfN(n-1);
    }

    static int factOfN(int n){
        if(n<1){
            return 1;
        }
        return n*factOfN(n-1);
    }

    static void revArr(int f, int l, int a[]){
        if(f>=l){
            return;
        }
        int t = a[f];
        a[f] = a[l];
        a[l] = t;
        revArr(f+1,l-1,a);
    }
    
    static void printArr(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        //oneToN(n, n);
        //nToOne(1, n);
        int a[] = {3,4,1,2,5,9,7};
        //System.out.println(factOfN(n));
        revArr(0,a.length-1,a);
        printArr(a);
    }
}
