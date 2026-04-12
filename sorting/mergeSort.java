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
        for(int i=0; i<n.length; i++){
            n[i] = Math.min(a[low], a[mid+1]);
            if(n[i]==a[low]) low++;
            if(n[i]==a[mid+1]) mid++;
            if(mid>high) break;
        }
    }

    public static void main(String[] args) {
        int a[] = {1,2,4,5,4,5,6};
        //mergeSorting(a, 0, a.length-1);
        merge(a, 0, 6, 3);
        for (int i = 0; i < 7; i++) {
            System.out.print(a[i]);   
        }
    }
}
