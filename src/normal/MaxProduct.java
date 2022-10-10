package normal;

public class MaxProduct {
    /*INPUT => {10,20,30,40,50};
      OUTPUT=> (40,50)
    */

    public static void main(String[] args) {
        int[] intArray = {10,20,30,40,50};
        String res=maxProduct(intArray) ;// (40,50)
        System.out.println(res);
    }

    public static String maxProduct(int[] intArray) {
        int maxProd=intArray[0]*intArray[1];
        String result="";
        for(int i=0;i<intArray.length;i++){
            for(int j=i+1;j<intArray.length;j++){
                if(intArray[i]*intArray[j]>maxProd){
                    maxProd=intArray[i]*intArray[j];
                    result=intArray[i]+","+intArray[j];
                }
            }
        }
        System.out.println("maxProd : "+maxProd);
        return result;
    }

}
