package string;

import java.util.Arrays;

public class ValidAnagram {
    public static boolean throughSorting(String s ,String t){
        if(s.length()!= t.length()){
        return false;
    }
        char a[]=s.toCharArray();
       char b[]=t.toCharArray();

Arrays.sort(a);
Arrays.sort(b);

return Arrays.equals(a,b);
    }
      public static boolean isAnagram(String s, String t) {
    if(s.length()!= t.length()){
        return false;
    }
    int arr[]=new int[26];
     for(int i=0;i<s.length();i++){
        arr[s.charAt(i)-'a']++;
        arr[t.charAt(i)-'a']--;
     }
       for(int c:arr){
       if(c !=0){
        return false;
       }
    }
return true;
        }
    public static void main(String[] args) {
        System.out.println(throughSorting("anagram","nagaarm"));
    }
}
