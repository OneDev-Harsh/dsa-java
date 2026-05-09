import java.util.*;
class leetcode169{

    static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.get(nums[i])!=null){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else map.put(nums[i], 1);
        }
        for(int i=0; i<nums.length; i++){
            if(map.get(nums[i])>nums.length/2) return nums[i];
        }
        return nums[0];
    }

    public static void main(String args[]){
        int a[] = {3,2,3};
        System.out.println(majorityElement(a));
    }
}