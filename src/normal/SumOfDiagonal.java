package normal;

public class SumOfDiagonal {

    /*
    myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
     sumDiagonal(myArray2D) # 15
     */
    public static void main(String[] args) {
        int myArray2D[][]={{1,2,3},{4,5,6},{7,8,9}};
        int sumOfDiagonal=sumDiagonal(myArray2D);
        System.out.println("sumOfDiagonal : "+sumOfDiagonal);
    }
    public static int sumDiagonal(int[][] matrix) {
        int sum=0;
        displayMatrix(matrix);
        for(int i=0;i<matrix.length;i++) {
            for (int j = 0; j < matrix.length; j++) {
               if(i==j){
                   sum+=matrix[i][j];
               }
            }
        }

        return sum;
    }

    public static void displayMatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

}
