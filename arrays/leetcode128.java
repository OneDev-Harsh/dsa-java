import java.util.*;

class leetocde128{

    static int brute(int[] nums){
        int len=1, cl=1; 
        int k=1;
        for(int i=0; i<nums.length; i++){
            int x = nums[i] + k;
            boolean found = false;
            for(int j=0; j<nums.length; j++){
                if(x==nums[j]){
                    cl++;
                    k++;
                    found=true;
                }
            }
            if(!found){
                cl=1;
            }
            len=len>cl?len:cl;
        }
        return len;
    }

    static int solution(int[] nums){
        Arrays.sort(nums);
        int l=1, max=0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i+1]-nums[i]==1){
                l++;
                max=max>l?max:l;
                continue;
            }
            if(nums[i+1]-nums[i]==0) continue;
            l=1;
        }
        return max;
    }

    public static void main(String[] args) {
        int a[] = {102, 4, 100, 101, 3, 2, 1, 1,5};
        System.out.println(solution(a));
    }
}