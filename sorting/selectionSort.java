package sorting;
import java.util.*;

class selectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {13,46,24,52,20,9};
        int mp=0;
        for(int i=0; i<a.length-1; i++){
            int min = a[i];
            for(int j=i; j<a.length; j++){
                if(a[j]<min){
                    min=a[j];
                    mp=j;
                }
            }
            int t = a[i];
            a[i] = a[mp];
            a[mp] = t;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
