
import java.util.Arrays;

class leetcode31{

    static void nextPermutation(int[] nums) {
        int x=-1;
        for(int i=nums.length-1; i>0; i--){
            if(nums[i]>nums[i-1]){
                x=i-1;
                break;
            }
        }
        if(x==-1){
            Arrays.sort(nums);
            for(int i=0; i<nums.length; i++){
                System.out.print(nums[i]+ " ");
            }
            return;
        }
        int min=101, minind=-1;
        for(int i=x+1; i<nums.length; i++){
            if(nums[i]<min && nums[i]>nums[x]){
                min=nums[i];
                minind=i;
            }
        }
        int t=nums[x];
        nums[x]=nums[minind];
        nums[minind]=t;
        int a[] = new int [Math.abs(x+1-nums.length)];
        System.out.println(a.length);
        for(int i=x+1; i<nums.length; i++){
            a[i-(x+1)]=nums[i];
        }
        Arrays.sort(a);
        for(int i=x+1; i<nums.length; i++){
            nums[i]=a[i-(x+1)];
        }
        
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+ " ");
        }
    }

    public static void main(String[] args) {
        int a[] = {3,2,1};
        nextPermutation(a);
    }
}