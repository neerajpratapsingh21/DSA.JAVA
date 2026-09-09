package string;
import java.util.Stack;

public class MinimumMovesToMakeValidParentheses {
    public  static int minMoves(String s){
        Stack<Character> con=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(con.size()!=0 && con.peek()=='(' && s.charAt(i)==')'){
                con.pop();
            }
        else{
            con.push(s.charAt(i));
        }
        }
         return  con.size();
    }
     public int minAddToMakeValid(String s) {
      int open=0;
      int close=0;
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('){
            open++;
        }else{
            if(open >0){
                open--;
            }else{
                close++;
            }
        }
      }
      return open + close;
    }
    public static void main(String[] args) {
        System.out.println(minMoves("()))(("));
    }
}
