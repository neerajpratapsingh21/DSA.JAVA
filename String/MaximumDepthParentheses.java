package string;

public class MaximumDepthParentheses {
     public int maxDepth(String s) {
        int max=0;
        int i=0;
        int count=0;
        while(i<s.length()){
         if(s.charAt(i)=='('){
            count++;
         }
         if(s.charAt(i)==')'){
            count--;
         }
         max=Math.max(max,count);
         i++;
        }
        return max;
    }

    public static void main(String[] args) {
        MaximumDepthParentheses obj=new MaximumDepthParentheses();
        String s="(6+(5-2)+((8*2)+6))";
        System.out.println(obj.maxDepth(s));
    }
}
