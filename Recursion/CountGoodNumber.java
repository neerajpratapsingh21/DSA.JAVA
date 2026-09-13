public class CountGoodNumber {
      public static int countGoodNumbers(long n) {
 long odd=n/2;
 long even=(n+1)/2;
// long ans =(power(5,even) * power(4,odd))% 1000000007;

 // recursive function calling
 long ans = (power(5,even,1) * power(4,odd,1))% 1000000007;
    return (int) ans;
    }
 public static  long power(long x,long n){
    long ans=1;
    while(n>0){
        while(n>0 && n%2==0){
             x=(x*x) % 1000000007;
             n/=2;
        }
       ans=(ans*x) % 1000000007;
       n-=1;
    }
    return ans;
 }
 // recursive approach
 public static  long power(long x,long n ,long ans){
    if(n<=0) return ans; 
    if(n%2==0){
     return power((x*x) % 1000000007,n/2,ans);
    }
    return power(x,n-1,(ans*x) % 1000000007);
 }
 public static void main(String[] args) {
    System.out.println(countGoodNumbers(50));
 }
}
