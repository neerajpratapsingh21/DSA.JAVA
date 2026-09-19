package array;

public class MaxConsicutiveOnesIII {
    public static boolean isValid(int arr[],int start,int end,int k){
        int count=0;
        for(int i=start;i<=end;i++){
             if(arr[i]==0) count++;
            if(count>k) return false;
           
        }
        return true;
    }
    public static int longestSubArrayWithAtMostKZeros(int arr[],int k ){
        int maxlen=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(isValid(arr, i, j, k)){
                    maxlen=Math.max(maxlen, j-i+1);
                }
            }
        }
        return maxlen;
    }
    public static int maxConsicutiveOnes(int arr[], int k){
        int zeros=0;
        int maxlen=0;
        int left=0;
        for(int right=0;right<arr.length;right++){
            if(arr[right]==0){
       zeros++;
            }
         while(zeros>k){
        if(arr[left]==0) zeros--;
        left++;
            }
            maxlen=Math.max(maxlen, right-left+1);
        }
        return maxlen;
    }
    public static void main(String[] args) {
        System.out.println(maxConsicutiveOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0},2));
    }
}
