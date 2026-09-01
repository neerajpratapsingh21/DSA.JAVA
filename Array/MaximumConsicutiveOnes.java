package array;
public class MaximumConsicutiveOnes {
    public static int findMaxConsicutiveOnes(int arr[]){
        int max=0;
        int curr=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                curr++;
                max=Math.max(max, curr);
            }
          else{
                curr=0;
            }
        }
        return max;
    }
public static void main(String[] args) {
    int arr[]={1,0,1,1,0,0,1,1,1,1};
    System.out.println(findMaxConsicutiveOnes(arr));
}
    
}