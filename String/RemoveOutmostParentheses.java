package string;

import java.util.ArrayList;
import java.util.List;


/**
 * RemoveOutmostParentheses
 */
public class RemoveOutmostParentheses {
    public static String bruteForce(String s){
        StringBuilder ans=new StringBuilder();
        List<Character> con=new ArrayList<>();
        int open=0;
        int close=0;
        int i=0;
        while(i<s.length()){
      if(s.charAt(i)=='('){
        open++;
        con.add(s.charAt(i));
      }else{
        close++;
        con.add(s.charAt(i));
      }

      if(open==close){
     for(int j=1;j<con.size()-1;j++){
     ans.append(con.get(j));
     }   
     open=0;
     close=0;
     con.clear();
      }
      i++;
      
        }
return ans.toString();
    }
    public static String optimalSolution(String s){
        StringBuilder ans = new StringBuilder();
        int sum=0;
        int start=0;
        int end =0;
        while(end<s.length()){
            if(s.charAt(end)=='(') sum++;
            else sum--;
            if(sum==0){
                ans.append(s.substring(start+1, end));
                start=end + 1;
            }
            end++;
        }
        return ans.toString();
    }
public static void main(String[] args) {
    String s="((())((()()()()))(())(()))";
    System.out.println(optimalSolution(s));
}
    
}