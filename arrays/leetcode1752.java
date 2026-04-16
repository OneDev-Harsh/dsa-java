class leetcode1752 {

    static boolean check(int[] nums) {
        int n = nums.length;
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            int c = 0;
            if(i>=0){
                for(int j=i; j<n; j++){
                    a[c] = nums[j];
                    c++;
                }
                for(int j=0; j<i; j++){
                    a[c] = nums[j];
                    c++;
                }
                if(isSorted(a)) return true;
                for(int j=0; j<n; j++){
                    a[j] = 0;
                }
            }
        }
        return false;
    }

    static boolean isSorted(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]) return false;
        }
        return true;
    }

    public static void main(String args[]){
        int nums[] = {1,2,5,3,7,8};
        System.out.println(check(nums));
    }
}