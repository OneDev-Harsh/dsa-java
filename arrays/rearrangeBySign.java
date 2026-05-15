class rearrangeBySign{

    static int[] solution(int[] a){
        int pos=0, neg=0;
        for(int i=0; i<a.length; i++){
            if(a[i]>=0) pos++;
            else neg++;
        }
        System.out.println(pos+" "+neg);
        int r[] = new int[a.length];
        int x=0, y=1;
        int z;
        if(pos>neg) z=2*neg;
        else z=2*pos;
        for(int i=0; i<a.length; i++){
            if(x<=z && y<=z){
                if(a[i]>=0){
                    r[x]=a[i];
                    x+=2;
                }
                else{
                    r[y] = a[i];
                    y+=2;
                }
            }
            else{
                r[z++]=a[i];
            }
        }
        return r;
    }

    static void printArr(int[] a){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+ " ");
        }
    }

    public static void main(String[] args) {
        int a[] = {1,2,-4,-5,4,6,5};
        printArr(solution(a));
    }
}