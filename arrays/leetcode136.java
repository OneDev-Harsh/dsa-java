package arrays;

public class leetcode136 {
    static int singleNumber(int[] nums) {
        int xor = 0;
        for(int n: nums){
            xor=xor^n;
        }
        return xor;
    }

    public static void main(String args[]){
        int a[] = {4,1,2,1,2,4,8};
        System.out.println(singleNumber(a));
    }
}
