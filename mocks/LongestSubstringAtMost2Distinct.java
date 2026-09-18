package mocks;

import java.util.HashMap;


public class LongestSubstringAtMost2Distinct {
    public static  int longestSubsWith2Char(String s){
        int left=0;
        int right=0;
        int maxlen=0;
        HashMap<Character,Integer> map=new HashMap<>();
       while(right<s.length()){
        map.put(s.charAt(right),map.getOrDefault(s.charAt(right), 0)+1);
        while(map.size()>2){
            map.put(s.charAt(left), map.get(s.charAt(left))-1);
            if(map.get(s.charAt(left))==0) map.remove(s.charAt(left));
            left++;
        }
         maxlen=Math.max(right-left+1, maxlen);
         right++;
       }
        return maxlen;
    }

    public static void main(String[] args) {
        System.out.println(longestSubsWith2Char("aaccbbbb"));
    }
}
