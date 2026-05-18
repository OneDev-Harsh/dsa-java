
import java.util.*;

class leetcode73{

    static void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j]==0){
                    list.add(i);
                    list.add(j);
                }
            }
        }
        for(int c=0; c<list.size()-1; c+=2){
            int x=list.get(c);
            int y=list.get(c+1);
            for(int i=0; i<n; i++){
                matrix[x][i]=0;
            }
            for(int i=0; i<m; i++){
                matrix[i][y]=0;
            }
        }
        printMatrix(matrix);
    }

    static void printMatrix(int[][] a){
        for (int i = 0; i < a.length; i++) {
            for(int j=0; j<a[0].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a[][] = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(a);
    }
}