package sorting;

public class mergeSort {

    static void mergeSorting(int a[], int low, int high){
        if(low>=high) return;
        int mid=(low+high)/2;
        mergeSorting(a, low, mid);
        mergeSorting(a, mid+1, high);
        merge(a, low, high, mid);

    }

    static void merge(int a[], int low, int high, int mid){
        int n[] = new int[high-low+1];
        int left = low;
        int right = mid+1;
        int p = 0;
        while(left<=mid && right<=high){
            if(a[left]<=a[right]){
                n[p]=a[left];
                left++;
                p++;
            }
            else{
                n[p]=a[right];
                right++;
                p++;
            }
        }
        while(left<=mid){
            n[p] = a[left];
            left++;
            p++;
        }
        while(right<=high){
            n[p] = a[right];
            right++;
            p++;
        }
        for(int i=low; i<=high; i++){
            a[i] = n[i-low];
        }
    }

    public static void main(String[] args) {
        int a[] = {3,2,4,1,3};
        mergeSorting(a, 0, a.length-1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);   
        }
    }
}
