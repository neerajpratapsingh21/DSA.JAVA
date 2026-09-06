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
    public static void main(String[] args) {
        System.out.println(minMoves("()))(("));
    }
}
