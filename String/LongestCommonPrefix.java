package string;

import java.util.Arrays;

public class LongestCommonPrefix {
    // Time Complexity - O(nlogn)
    // Space Complexity - O(1)
      public static String longestCommonPrefix(String[] v) {
        if(v == null || v.length == 0) return "";
        StringBuilder ans = new StringBuilder();
        Arrays.sort(v);
        String first = v[0];
        String last = v[v.length - 1];
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }
    // Time Complexity - O(n*m)
    // Space Complexity - O(1)
    public static String optimalSolution(String[] v){
         if(v == null || v.length == 0) return "";
        String prefix=v[0];
        for(int i=1;i<v.length;i++){
            String curr=v[i];
                while(!curr.startsWith(prefix) && prefix.length()!=0){
                    prefix=prefix.substring(0, prefix.length()-1);
                }
        }
        return prefix;
    }
    public static void main(String[] args) {
        String v[]={"flower","flow","flight"};
        System.out.println(optimalSolution(v));
    }
}
