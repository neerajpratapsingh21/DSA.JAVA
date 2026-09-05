package string;

public class StringToInteger {
    public static int myAtoi(String s){
        if(s==null || s.length()==0) return 0;
        // Constants for 32-bit signed integer range
         final int INT_MIN=Integer.MIN_VALUE;
         final int INT_MAX=Integer.MAX_VALUE;
         // skip Leading Whitespaces
         int i=0;
         int n=s.length();
         while(i<n && s.charAt(i)==' '){
            i++;
         }
         // Check if we've reached the end
         if(i==n) return 0;

         // Step 2: Check for sign
         int sign=1;
         if(s.charAt(i)=='+'){
            i++;
         }else if(s.charAt(i)=='-'){
            sign=-1;
            i++;
         }

         // read and convert numbers
         long res=0;
         while(i<n && Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i)-'0';
            res=10*res+digit;

            if(res*sign<=INT_MIN){
                return INT_MIN;
            }
            if(res*sign>=INT_MAX){
                return INT_MAX;
            }
            i++;
         }
         return (int)(res*sign);
    }
    public static void main(String[] args) {
        System.out.println(myAtoi("-84"));
    }
    
}
