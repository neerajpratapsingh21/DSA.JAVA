package binarysearch;

public class ShipWithInDays {
    public static int daysReq(int weight[],int capacity){
   int  days=1;
   int load=0;
   for(int i=0;i<weight.length;i++){
       if(load+weight[i]>capacity){
        days+=1;
        load=weight[i];
       }else{
        load+=weight[i];
       }
   }
   return days;
    }
public static int bruteForce(int weight[],int days){
    int max=Integer.MIN_VALUE;
    int sum=0;
    for(int w:  weight){
        max=Math.max(max, w);
        sum+=w;
    }
    for(int cap=max;cap<=sum;cap++){
        int dayreq=daysReq(weight,cap);
        if(dayreq<=days){
            return cap;
        }   
    }
    return -1;
}
public static int optimalSolution(int weight[],int days){
    int max=Integer.MIN_VALUE;
    int sum=0;
    for(int w:  weight){
        max=Math.max(max, w);
        sum+=w;
    }
    int low =max ;
    int high=sum;
   while(low<=high){
    int mid = low + (high - low)/2;
        int dayreq=daysReq(weight,mid);
        if(dayreq<=days){
            high=mid-1;
        }   else{
            low =mid+1;
        }
    }
    return low;
}
    public static void main(String[] args) {
        int weight[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println(bruteForce(weight, 5));
        System.out.println(optimalSolution(weight, 6));
    }
}
