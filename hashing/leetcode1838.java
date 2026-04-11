import java.util.*;
class leetcode1838 {

    public static int maxFrequency(int[] nums, int k){
        Arrays.sort(nums);

        int lp = 0;
        long total = 0;
        int max = 1;

        for (int rp = 0; rp < nums.length; rp++) {
            total += nums[rp];

            while ((long) nums[rp] * (rp - lp + 1) > total + k) {
                total -= nums[lp];
                lp++;
            }

            max = Math.max(max, rp - lp + 1);
        }

        return max;
    }

    public static void main(String args[]){
        int[] nums = {1,2,4};
        System.out.println(maxFrequency(nums,5));
    }
}