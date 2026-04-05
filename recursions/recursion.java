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

    static void revArr(int f, int a[]){
        if(f>=a.length-1-f){
            return;
        }
        int t = a[f];
        a[f] = a[a.length-1-f];
        a[a.length-1-f] = t;
        revArr(f+1,a);
    }
    
    static void printArr(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
    }

    static boolean isStringPalindrome(int i, String s){
        if(i>=s.length()/2) return true;
        if(s.charAt(i) != s.charAt(s.length()-i-1)){
            return false;
        }
        return isStringPalindrome(i+1, s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        //oneToN(n, n);
        //nToOne(1, n);
        int a[] = {8,1,0,1,3,9,3,5,1,6};
        //System.out.println(factOfN(n));
        //revArr(0,a);
        //printArr(a);
        String s = sc.nextLine().toLowerCase();
        System.out.println(isStringPalindrome(0, s));
    }
}
