import java.util.Arrays;

class leetcode88{

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=m-1;
        while(i<m && j>=0){
            if(nums1[j]>nums2[i]){
                int temp = nums1[j];
                nums1[j] = nums2[i];
                nums2[i] = temp;
                j--; 
                i++;
            }
            else break;
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
    }

    static void print(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }

    public static void main(String args[]){
        int a[] = {1,3,5,7};
        int b[] = {0,2,6,8,9};
        merge(a, 4, b, 5);
        print(a);
        print(b);
    }
}