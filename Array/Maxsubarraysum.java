package array;

public class Maxsubarraysum {
    // Brute force method (Time complexity - O(n^3) & Space complexity- O(1))
    public static void MaxSubArraySum_BruteForcemethod(int arr[]){
        int maxsum=Integer.MIN_VALUE;
        int startindex=0;
        int endindex=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                 sum+=arr[k];
                
                }
                 if(maxsum<sum){
                   
                    maxsum=sum;
                    startindex=i;
                    endindex=j;
                    
                 }
            }

        }
        for(int i=startindex;i<=endindex;i++){
            System.out.print(arr[i]+" ");
        }

         System.out.println("Max Sub array sum = "+maxsum);
        
       
    }
    // using Prefix sum (Time complexity - O(n^2) & Space complexity- O(n))
    public static void MaxSubArraySum_PrefixSum(int arr[]){
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
         int startindex=0;
        int endindex=0;
        int Prefix[]= new int[arr.length];
        Prefix[0]=arr[0];
        //calculate prefix array
        for(int i=1;i<Prefix.length;i++){
  Prefix[i]=Prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
               if(i==0){
               sum=Prefix[j];
               }else{
             sum= Prefix[j]-Prefix[i-1];
               }
                 if(maxsum<sum){
                    maxsum=sum;
                 startindex=i;
         endindex=j;
                    
                 }
            }

        }
        
         System.out.println("Max Sub array sum = "+maxsum);
        for(int i=startindex;i<=endindex;i++){
            System.out.print(arr[i]+" ");
        }
       
    }
    // kadane Algorithm (Time complexity - O(n) & Space complexity- O(1))

     public static int MaxSubArraySum_KadaneAlgorithm(int arr[]){
        if(arr.length==0) return -1;
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
      currsum=Math.max(arr[i], currsum+arr[i]);
        maxsum=Math.max(maxsum, currsum);
       }
       return maxsum;
    }
       
    
    
    public static void main(String[] args) {
        int arr[]={};
       System.out.println(MaxSubArraySum_KadaneAlgorithm(arr));
    }
}
