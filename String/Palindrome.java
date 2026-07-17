package string;
public class Palindrome {
    public static  boolean checkPalindrome(String str){
 int n=str.length();
        for(int i=0;i<=n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
     public static  boolean validPalindrome(String str){
        if(str.isEmpty()) return true;
         int n=str.length();
            int left=0;
            int right=n-1;
        while(left<right){
            char currleft=str.charAt(left);
            char currright=str.charAt(right);
            if(!Character.isLetterOrDigit(currleft)){
                left++;
            }
           else if (!Character.isLetterOrDigit(currright)){
                right--;
            }
else{
            if(Character.toLowerCase(currleft)!=Character.toLowerCase(currright)){
                return false;
            }
            left++;
            right--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="noo 5      n";
       System.out.println(validPalindrome(str));
    }
}
