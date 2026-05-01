
import java.util.*;

class leetcode1{

    static int[] brute(int nums[], int target){
        int r[] = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(i!=j){
                    if(nums[i]+nums[j]==target){
                        r[0]=i; 
                        r[1]=j;
                    }
                }
            }
        }
        return r;
    }

    static int[] better(int nums[], int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        int r[] = new int[2];
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i])) {
                r[0]=map.get(target-nums[i]);
                r[1]=i;
            }
        }
        return r;
    }

    static void printArr(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }
    }

    public static void main(String args[]){
        int a[] = {2,7,11,15};
        printArr(better(a, 18));
    }
}