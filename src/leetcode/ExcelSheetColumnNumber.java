package leetcode;
/*
A=1,B=2,C=3....
AB=1*26+2=28.
ZY=26*26+25=701

Input: columnTitle = "A"
Output: 1
Input: columnTitle = "AB"
Output: 28
Input: columnTitle = "ZY"
Output: 701
 */
public class ExcelSheetColumnNumber {

    public static void main(String[] args) {
        ExcelSheetColumnNumber obj=new ExcelSheetColumnNumber();
        String columnTitle="AB";
        int result=obj.titleToNumber(columnTitle);
        System.out.println("result : "+result);
    }


    public int titleToNumber(String columnTitle) {
        int result=0,pow=1;
        if("".equals(columnTitle)){
            return 0;
        }
        for(int i=columnTitle.length()-1;i>=0;i--){
            result+=(columnTitle.charAt(i)-64)*pow;// Ascii Value of A=65 and here A=1 thats why -64
            pow=pow*26;
        }
        return result;
    }

}
