import java.util.HashMap;

class leetcode560{

    static int subarraySum(int[] nums, int k) {
        int x=0;
        for(int i=0; i<nums.length; i++){
            int sum=0;
            for(int j=i; j<nums.length; j++){
                sum+=nums[j];
                if(sum==k) x++;
            }
        }
        return x;
    }

    static int optimal(int[] nums, int k) {
        int res = 0, curSum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {

            curSum += nums[i];

            if (map.containsKey(curSum - k)) {
                res += map.get(curSum - k);
            }

            map.put(curSum, map.getOrDefault(curSum, 0) + 1);
        }

        return res;
    }

    public static void main(String[] args) {
        int a[] = {1};
        int k=0;
        System.out.println(optimal(a, k));
    }
}