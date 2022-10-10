package normal;

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = 1 + i + j;
            }
        }
        System.out.println(Arrays.deepToString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        String strArr[][] = {{"a", "b"}, {"c", "d"}, {"e", "f"}};
        System.out.println(Arrays.deepToString(strArr));

        TwoDimensionArray arrayObj=new TwoDimensionArray();
        arrayObj.insertInArray(0,0,10);
        arrayObj.insertInArray(0,1,20);
        arrayObj.insertInArray(0,0,10);
    }

}
class TwoDimensionArray{
    int arr[][]=null;

    public  TwoDimensionArray(){
        this.arr=new int[2][2];
        for(int row=0;row<arr.length;row++){
                for(int col=0;col<arr.length;col++){
                    arr[row][col]=Integer.MIN_VALUE;
                }
            }
        }

        public void insertInArray(int row,int col, int value){
            try{
                if(arr[row][col]==Integer.MIN_VALUE){
                    arr[row][col]=value;
                    System.out.println("Value ->"+value+" Inserted at ["+row+"]"+"["+col+"]");
                }else{
                    System.out.println("Value ->"+arr[row][col]+" Already present at ["+row+"]"+"["+col+"]");
                }
            }catch (ArrayIndexOutOfBoundsException e){
                    e.printStackTrace();
            }

        }
}





