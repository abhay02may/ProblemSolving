package recursion;

public class AllSubSequencesOfString {
    public static void main(String[] args) {
        String input="abc",output="";
        printAllSubSeq(input,output);
    }

    public static void printAllSubSeq(String input,String output){
        if(input.length()==0){
            System.out.println(output);
            return;
        }
        printAllSubSeq(input.substring(1),output);
        printAllSubSeq(input.substring(1),output+input.charAt(0));
    }
}
