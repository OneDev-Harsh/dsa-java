class rotateArray {

    static void rotateByOne(int[] a){
        for(int i=a.length-1; i>0; i--){
            int temp = a[i];
            a[i] = a[0];
            a[0] = temp;
        }
    }

    static void rotateByKPlaces(int[] a, int k){
        k=k%a.length;
        int[] t = new int[k+1];
        for(int i=0; i<=k; i++){
            t[i] = a[i];
        }
        for(int i=0; i<a.length-k; i++){
            int temp = a[i];
            a[i] = a[i+k];
            a[i+k] = temp;
        }
        for(int i=0; i<k; i++){
            a[a.length-k+i] = t[i];
        }
    }

    static void printArr(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};
        rotateByKPlaces(a, 3);
        printArr(a);
    }
}