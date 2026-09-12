package maths;

import java.util.ArrayList;
import java.util.List;

/**
 * HappyNumber
 */
public class HappyNumber {
 public static  boolean isHappy(int n) {
        List<Integer> con=new  ArrayList<>();
        while(true){
            int sum=0;
            while(n>0){
                sum += Math.pow(n%10,2);
                n/=10;
            }
            if(sum==1) return true;
            if(con.contains(sum)) return  false;
            con.add(sum);
            n=sum;
        }
    }
public static void main(String[] args) {
   System.out.println(isHappy(19));
}
    
}