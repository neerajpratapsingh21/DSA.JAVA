package string;

public class MultiplyString {
     public static  String multiply(String num1, String num2) {
         if((num1.charAt(0)-'0')==0 || (num2.charAt(0)-'0')==0) return "0";
        int n1=0;
        for(int i=0;i<num1.length();i++){
         n1=n1*10+(num1.charAt(i)-'0');
        }
        int n2=0;
        for(int i=0;i<num2.length();i++){
         n2=n2*10+(num2.charAt(i)-'0');
        }
        int n=n1*n2;
        StringBuilder ans=new StringBuilder();
        while(n>0){
            ans.insert(0, n%10);
            n/=10;
        }
        return  ans.toString();
    }
    public static void main(String[] args) {
        System.out.println(multiply("12", "12"));
    }
}
