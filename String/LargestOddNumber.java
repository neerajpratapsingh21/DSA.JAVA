package string;

public class LargestOddNumber {
    public static String largestOddNumber(String s){
        int left=0;
        int right=s.length()-1;
        while(left<=s.length()-1 && s.charAt(left)=='0'){
            left++;
        }
        while(right>=0 && (s.charAt(right)-'0')%2==0){
            right--;
        }
        if(left<=right){
            return s.substring(left, right+1);
        }
        return "";
    }
    public static void main(String[] args) {
        System.out.println(largestOddNumber("123131"));
    }
}
