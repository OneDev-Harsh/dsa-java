import java.util.*;
class subarraySumK{

    static int solution_Brute(int a[], int k){
        int sum=0, c=0, mc=0;
        for(int i=0; i<a.length; i++){
            for(int j=i; j<a.length; j++){
                sum+=a[j];
                c++;
                if(sum==k){
                    if(c>mc) mc=c;
                    break;
                }
            }
            c=0;
            sum=0;
        }
        return mc;
    }

    // static int solution_Better(int a[], int k){
    //     HashMap<Integer, Integer> map = new HashMap<>();
    //     int sum=0, c=0;
    //     for(int i=0; i<a.length; i++){
    //         sum+=a[i];
    //         map.put(sum, i);
    //         if(map.containsKey(sum-k)) c=i-map.get(sum-k);
    //     }
    //     return c;
    // }

    public static void main(String[] args) {
        int a[] = {1,2,3,1,1,1,1,4,2,3};
        int k = 6;
        System.out.println(solution_Brute(a, k));
        //System.out.println(solution_Better(a, k));
    }
}