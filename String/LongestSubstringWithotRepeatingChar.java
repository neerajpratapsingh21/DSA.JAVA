package string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithotRepeatingChar {
//     public static boolean isValid(int start,int end, String s){
//         Map<Character,Integer> map=new HashMap<>();
//         for(int i=start;i<=end;i++) {
//             if(map.containsKey(s.charAt(i))){
//                 return  false;
//             }
//             map.put(s.charAt(i), 1);
//     }
//     return   true;
// }
//     public static  int lengthOfLongestSubstring(String s){
        
//         int maxlen=0;
//         for(int i=0;i<s.length();i++){
//             for(int j=i;j<s.length();j++){
//                 if(isValid(i,j,s)){
//                   maxlen=Math.max(maxlen,j-i+1);
//                 }
//             }
//         }
//         return maxlen;
//     }
    public static int opimalSolution(String s){
        Map<Character,Integer> map=new HashMap<>();
        int left=0;
       int right=0;
        int maxlen=0;
        while(right<s.length()){
            char curr=s.charAt(right);
            if(map.containsKey(curr)){
                maxlen=Math.max(maxlen, right-left);
                System.out.println(curr);
                int ind=map.get(curr);
                while(left<=ind){
                    map.remove(s.charAt(left));
                    left++;
                }
                map.put(curr, right);
            }
            map.put(curr, right);
            right++;
        }

        return  maxlen;
    }
       public static int clearAndOptimalSolution(String s){
        Map<Character,Integer> map=new HashMap<>();
        int left=0;
        int maxlen=0;
     for(int right=0;right<s.length();right++){
        char curr=s.charAt(right);
        if(map.containsKey(curr)){
            left=Math.max(left, map.get(curr)+1);
        }
        map.put(curr, right);
        maxlen=Math.max(maxlen, right-left+1);
     }
        return  maxlen;
    }
    
    public static void main(String[] args) {
        System.out.println(clearAndOptimalSolution("cadbzabcdxyazp"));
    }
}
