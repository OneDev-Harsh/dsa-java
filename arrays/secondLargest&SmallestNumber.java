class secondLargestAndSmallestNumber {

    static int secondLargest(int[] a){
        int largest = a[0];
        int secLargest = -1;
        for(int i=1; i<a.length; i++){
            if(a[i]>largest){
                secLargest = largest;
                largest = a[i];
            }
            else if(a[i]<largest && a[i]>secLargest){
                secLargest=a[i];
            }
        }
        return secLargest;
    }

    static int secondSmallest(int[] a){
        int smallest = a[0];
        int secSmallest = Integer.MAX_VALUE;
        for(int i=1; i<a.length; i++){
            if(a[i]<smallest){
                secSmallest = smallest;
                smallest = a[i];
            }
            else if(a[i]>smallest && a[i]<secSmallest){
                secSmallest=a[i];
            }
        }
        return secSmallest;
    }

    public static void main(String args[]){
        int a[] = {1,5,8,4,7,7,9,3,2,6};
        System.out.println(secondLargest(a));
        System.out.println(secondSmallest(a));
    }
}