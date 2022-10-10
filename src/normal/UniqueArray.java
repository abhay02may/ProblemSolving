package normal;

public class UniqueArray {
    /*int[] intArray = {1,2,3,4,5,6};
    isUnique(intArray) // true
    */
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6};
        boolean flag=isUnique(intArray); // true
        System.out.println("Array is unique: "+flag);
    }

    public static boolean isUnique(int[] intArray) {
       boolean unique=true;
        for(int i=0;i<intArray.length;i++){
            for(int j=i+1;j<intArray.length;j++){
                if(intArray[i]==intArray[j]){
                    unique=false;
                    break;
                }
            }
        }
       return unique;
    }
}
