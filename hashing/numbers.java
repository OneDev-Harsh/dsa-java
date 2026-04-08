import java.util.*;

class numbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
        int hash[] = new int[100];
        for(int i=0; i<a.length; i++){
            hash[a[i]]++;
        }
        int n = sc.nextInt();
        System.out.println(hash[n]);
    }
}