import java.util.*;
class leetcode15 {
    
    static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            Set<Integer> set = new HashSet<>();
            for(int j=i+1; j<nums.length; j++){
                List<Integer> l = new ArrayList<>();
                int k = -(nums[i]+nums[j]);
                if(set.contains(k)){
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(k);
                    l.sort(Comparator.naturalOrder());
                    if(!list.contains(l)) list.add(l);
                }
                set.add(nums[j]);
            }
        }
        return list;
    }

    static List<List<Integer>> optimal(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {

                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {

                    list.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }

                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return list;
    }
    
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        System.out.println(optimal(nums));
    }
}
