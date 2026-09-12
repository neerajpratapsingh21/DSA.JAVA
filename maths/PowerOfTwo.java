package maths;

public class PowerOfTwo {
     public static  boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        if(n==1) return true;
        if(n%2==1) return false;
        while(n%2==0){
            n/=2;
        }
        if(n<2) return true;

        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(56));
    }
}
