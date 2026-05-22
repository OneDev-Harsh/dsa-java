import java.util.*;

class leetcode229 {

    static List<Integer> majorityElement(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(map.get(nums[i])!=null){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else map.put(nums[i], 1);
            if(map.get(nums[i])>nums.length/3 && list.contains(nums[i])==false) list.add(nums[i]);
        }
        return list;
    } 

    static void printList(List<Integer> list){
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
    }

    public static void main(String[] args) {
        int nums[] = {3,2,3};
        printList(majorityElement(nums));
    }
}
