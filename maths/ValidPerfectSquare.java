package maths;

public class ValidPerfectSquare {
    public  static boolean isPerfectSquare(int n) {
        int low =1;
        int high=n;
        while(low<=high){
           int mid=low+(high-low)/2;
           if((long)mid*mid==n){
            return true;
           } else if((long)mid*mid >n){
            high=mid-1;
           }else{
            low=mid+1;
           }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(4));
    }
}
