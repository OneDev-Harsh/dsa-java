class leetcode75{

    static void better(int[] nums) {
        int z=0, o=0, t=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0) z++;
            if(nums[i]==1) o++;
            if(nums[i]==2) t++;
        }
        for(int i=0; i<z; i++){
            nums[i]=0;
        }
        for(int i=z; i<o+z; i++){
            nums[i]=1;
        }
        for(int i=o+z; i<t+o+z; i++){
            nums[i]=2;
        }
    }

    static void printArr(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }
    }

    public static void main(){
        int a[] = {2,0,2,1,1,0};
        better(a);
        printArr(a);
    }
}