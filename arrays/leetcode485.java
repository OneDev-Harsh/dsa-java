package arrays;

public class leetcode485 {

    static int findMaxConsecutiveOnes(int[] nums) {
        int cc=0, hc=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0) cc++;
            if(cc>hc) hc=cc;
            if(i==nums.length-1) return hc;
            if(nums[i]==0) cc=0;
        }
        return cc;
    }

    public static void main(String args[]){
        int a[] = {1,0,1,1,0,1,1,1,1,1,1};
        System.out.println(findMaxConsecutiveOnes(a));;
    }
}
