class leetcode189 {

    static void reverse(int[] a, int s, int e){
        for(int i=s; i<e; i++){
            int temp = a[i];
            a[i] = a[e-i];
            a[e-i] = temp;
        }
    }

    static void printArr(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};
        int k = 3;
        reverse(a, 0, k-1);
        reverse(a, k, a.length-1);
        reverse(a, 0, a.length-1);
        printArr(a);
    }    
}
