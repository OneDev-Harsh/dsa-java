class leetcode48 {

    static void rotate(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int a[][] = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                a[j][n-1-i]=matrix[i][j];
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j]=a[i][j];
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }

    static void rotateOptimal(int[][] matrix){
        for(int i=0; i<matrix.length-1; i++){
            for(int j=i+1; j<matrix.length; j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length/2; j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-j-1];
                matrix[i][matrix.length-j-1]=temp;
            }
        }
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        rotateOptimal(a);
    }    
}
