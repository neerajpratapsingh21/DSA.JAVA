package array.binarySearch;
public class MinDaysToBloomingFlowers {
    public static int minimum(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i : arr){
            min=Math.min(i, min);
        }
        return min;
    }
    public static int maximum(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i : arr){
        max=Math.max(i, max);
        }
        return max;
    }
    public static boolean possibleBouquets(int arr[],int days,int m,int k){
          int count=0;
            int bouquets=0;
            for(int day :arr){
                if(days>=day){
                    count++;
                       if (count == k) {
                    bouquets++; // form one bouquet
                    count = 0; // reset count for next bouquet
                }
                }else{
                    count=0;
                   }
            }
          return bouquets>=m;
    }
    public static int bruteForce(int bloomDay[],int m,int k){
        if((long)m*k>bloomDay.length) return -1;
        int min=minimum(bloomDay);
        int max=maximum(bloomDay);
        for(int i=min;i<=max;i++){
          if(possibleBouquets(bloomDay, i, m, k)==true){
            return i;
          }
        }
        return -1;
    }
     public static int optimalSolution(int bloomDay[],int m,int k){
        if((long)m*k>bloomDay.length) return -1;
         int low=minimum(bloomDay);
        int high=maximum(bloomDay);
       while(low<=high){
        int mid=low+(high-low)/2;
             if(possibleBouquets(bloomDay, mid, m, k)==true){
               high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
 public static void main(String[] args) {
        int bloomDay[]={7,7,7,7,13,11,12,7};
        System.out.println(optimalSolution(bloomDay, 1, 3));
    }
}