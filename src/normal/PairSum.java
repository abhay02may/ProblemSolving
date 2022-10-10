package normal;

public class PairSum {
    /*
    pairSum({2, 4, 3, 5, 6, -2, 4, 7, 8, 9},7)
        Output : "2:5 4:3 3:4 -2:9 "
     */
    public static void main(String[] args) {
        int arr[]={2, 4, 3, 5, 6, -2, 4, 7, 8, 9};
        int sum=7;
        String res=pairSum(arr,sum);
        System.out.println(res);
    }

    public static String pairSum(int[] myArray, int sum) {
        String result="";
        for(int i=0;i<myArray.length;i++){
            for(int j=i+1;j<myArray.length;j++){
                if((myArray[i]+myArray[j])==sum){
                    result+=myArray[i]+":"+myArray[j]+" ";
                }
            }
        }
        return result;
    }

}
