public class ClimbStairs {
    public static long climbStairs(long n){
      if(n<=3)return n;
     long last= climbStairs(n-1);
     long slast= climbStairs(n-2);
       return last+slast;
    }
    public static void main(String[] args) {
        System.out.println(climbStairs(46));
    }
}
