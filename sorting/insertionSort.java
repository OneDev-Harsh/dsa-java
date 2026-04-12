package sorting;

public class insertionSort {
    public static void main(String[] args) {
        int a[] = {14,9,15,12,6,8,13,5};

        for(int i=0; i<a.length; i++){
            int j=i;
            while(j>0 && a[j-1]>a[j]){
                int temp = a[j-1];
                a[j-1] = a[j];
                a[j] = temp;

                j--;
            }
        }
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }
    }
}
