package string;

public class LongestPalindrome {
       public boolean isPalindrome(String s,int i,int j){
        int low=i;
        int high=j;
        while(low<high){
            if(s.charAt(low)!= s.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
    public String bruteForce(String s) {
        int maxlen=0;
        int low =0;
        int high=0;
      for(int i=0;i<s.length();i++){
        for(int j=i;j<s.length();j++){
             if(isPalindrome(s,i,j)){
                if((j-i+1)>maxlen){
                    maxlen=j-i+1;
                low=i;
                high=j;
                }               
             }
        }
      }
      return s.substring(low,high+1);
    }
    public static String optimalSolution(String s) {

        int start = 0;
        int maxLen = 1;

        for (int i = 0; i < s.length(); i++) {

            // Odd length
            int len1 = expand(s, i, i);

            // Even length
            int len2 = expand(s, i, i + 1);

            int len = Math.max(len1, len2);

            if (len > maxLen) {
                maxLen = len;

                start = i - (len - 1) / 2;
            }
        }

        return s.substring(start, start + maxLen);
    }

    private static  int expand(String s, int left, int right) {

        while (left >= 0 &&
               right < s.length() &&
               s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        return right - left - 1;
    }

    public static void main(String[] args) {
        System.out.println(optimalSolution("babad"));
    }
}
