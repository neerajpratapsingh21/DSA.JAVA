package string;

public class RotateString {
    public static boolean bruteforce(String str , String goal){
        if(str.length() != goal.length()) return false;
        for(int i=0;i<str.length();i++){
            String rotation = str.substring(i)+str.substring(0,i);
            if(rotation.equals(goal)){
                return true ;
            }
        }
        return false;
    }
    public static boolean optimalSolution(String str ,String goal){
        if(str.length() != goal.length()) return false;
    String rotation=str+str;
  return rotation.contains(goal);
    }
    public static void main(String[] args) {
        System.out.println(optimalSolution("rotation", "tionroat"));
    }
}
