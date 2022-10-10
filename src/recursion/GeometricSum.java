package recursion;

public class GeometricSum {
    public static void main(String[] args) {
        System.out.println(geoSum(3));
    }

    public static double geoSum(int k){
        if(k==0){
            return 1;
        }
        double smallAns=geoSum(k-1);
        double result=smallAns+1/Math.pow(2,k);
        return  result;
    }
}
