import java.util.*;
class leetcode118{

    static long type1(int n, int r){
        n=n-1;
        r=r-1;
        int res=1;
        for(int i=0; i<r; i++){
            res*=(n-i)/(i+1);
        }
        return res;
    }

    static void type2(int n, int r){
        n=n-1;
        r=r-1;
        long res = 1;
        System.out.print(res+ " ");
        for(int i=1; i<=n+1; i++){
            res=(res*(n+1-i))/i;
            System.out.print(res+ " ");
        }
    }

    static void type3(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-1-i; j++){
                System.out.print(" ");
            }
            int res=1;
            System.out.print(res+ " ");
            for(int j=1; j<=i; j++){
                res=(res*(i+1-j))/j;
                System.out.print(res+ " ");
            }
            System.out.println();
        }
    }

    static List<List<Integer>> type4(int n){
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            List<Integer> l = new ArrayList<>();
            int res=1;
            l.add(res);
            for(int j=1; j<=i; j++){
                res=(res*(i+1-j))/j;
                l.add(res);
            }
            list.add(l);
        }
        return list;
    }

    public static void main(String[] args) {
        //System.out.println(type1(10, 2));
        type3(6);
    }
}