class leetcode26 {

    static int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;

        int k = 1;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    static void printArray(int[] nums){
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+ " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4,5,6,6,6,7,7,8,8,8,9};
        System.out.println(removeDuplicates(nums));
        printArray(nums);
    }
}
